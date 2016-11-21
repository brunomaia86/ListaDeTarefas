<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
	<h2>SGH - Logado no sistema</h2>
	<p>Bem vindo, <b>${usuarioLogado.login}</b></p>
	<a href="novoUsuario" class="link">Cadastro de cliente</a><br /><br >
	<a href="listaTarefas" class="link">Lista de tarefas</a>
	
	<br /><br /><hr />
	
	<a href="logout" class="link"">Sair do sistema</a>
</body>
</html>