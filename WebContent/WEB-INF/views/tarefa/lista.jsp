<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="resources/js/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="resources/js/jquery-ui-1.10.1.custom.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" />

<title>Insert title here</title>
</head>
<body>

	<script type="text/javascript">
	function finalizaAgora(id) {
		$.post("finalizaTarefa",{'id' : id},function(resposta) {
			$("#tarefa_"+id).html(resposta);
		} );
	}
	//Minha funçãos
	function removeAgora(id) {
		//JQuery metodo->post(URLSpringMVC, {'identificador},Função de manipulação)
		$.post("removeTarefa",{'id' : id},
		function() {
			$("#tarefa_"+id).closest('tr').hide();
		} );
	}
</script>


	<a href="novaTarefa" class="link">Criar uma nova tarefa</a>
	<br />
	<br />
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Descrição</th>
			<th>Finalizado?</th>
			<th>Data de finalização</th>
			<th>Apagar tarefa</th>
			<th>Alterar tarefa</th>
			<th>Desafio remove tarefa</th>
		</tr>

		<c:forEach items="${tarefas}" var="tarefa">
			<tr id="tarefa_${tarefa.id}">
				<td>${tarefa.id}</td>
				<td>${tarefa.descricao}</td>
				<c:if test="${tarefa.finalizado eq true}">
					<td>Finalizado</td>
				</c:if>
				<c:if test="${tarefa.finalizado eq false}">
					<td><a href="#" onclick="finalizaAgora(${tarefa.id})">Finalizar</a>
					</td>
				</c:if>
				<td><fmt:formatDate value="${tarefa.dataFinalizacao.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><a href="removeTarefa?id=${tarefa.id}">Remove</a></td>
				<td><a href="mostraTarefa?id=${tarefa.id}">Altera</a></td>
				<td><a href="#" onclick="removeAgora(${tarefa.id})">Remove
						agora!</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="logout" title="Sair do sistema" class="link">Sair do
		sistema</a>
</body>
</html>