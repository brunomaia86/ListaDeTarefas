package br.com.caelum.tarefa.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.tarefa.hibernate.HibernateUtil;
import br.com.caelum.tarefa.modelo.Cliente;

public class ClienteDAO {
	private Session session = null;
	private Transaction transaction = null;
	
	public void salva(Cliente cliente) {
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(cliente);
			transaction.commit();
		} catch (HibernateException exc) {
			System.out.println("Não foi possível salvar o cliente. Erro: " + exc.getMessage());
		} finally {
			try {
				session.close();
			} catch (Exception exc) {
				System.out.println("Erro na tentativa de fechar a sessão.");
			}
		}
	}
}
