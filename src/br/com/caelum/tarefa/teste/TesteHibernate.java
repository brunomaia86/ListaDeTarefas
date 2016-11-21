package br.com.caelum.tarefa.teste;

import br.com.caelum.tarefa.dao.ClienteDAO;
import br.com.caelum.tarefa.modelo.Cliente;

public class TesteHibernate {
	public static void main(String[] args) {
		Cliente primeiro = new Cliente();
		ClienteDAO dao = new ClienteDAO();
		primeiro.setNome("Josué Oliveira Moura");
		primeiro.setDataNascimento(null);
		primeiro.setCpf("34984695846");
		primeiro.setRg("3434334343");
		primeiro.setSexo("masculino");
		primeiro.setEmail("josuepaulista@hotmail.com");
		primeiro.setEstadoCivil("solteiro");
		primeiro.setCep("09783-001");
		primeiro.setEndereco("Rua do cravos");
		primeiro.setNumero("223");
		primeiro.setBairro("Jardim do quimicos");
		primeiro.setMunicipio("São Bernardo do Campo");
		primeiro.setUf("São Paulo");
		primeiro.setTelefoneRecidencial("5511970221117");
		primeiro.setTelefoneCelular("5511970221117");
		primeiro.setPortadorDeficiencia(false);
		primeiro.setPessoasResponsaveis(2);
		
		try {
			dao.salva(primeiro);
		} catch (Exception e) {
			System.out.println("Erro lançado. Error: " + e.getMessage());
		}
	}
}
