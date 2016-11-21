package br.com.caelum.tarefa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.tarefa.dao.TarefaDAO;
import br.com.caelum.tarefa.modelo.Tarefa;

@Controller
public class TarefasController {

	@RequestMapping("novaTarefa")
	public String form() {

		return "tarefa/formulario";
	}

	@RequestMapping("adicionaTarefa")
	public String adiciona(@Valid Tarefa tarefa, BindingResult result) {
		
		if(result.hasFieldErrors("descricao"))
			return "tarefa/formulario";
		
		TarefaDAO dao = new TarefaDAO();
		dao.adiciona(tarefa);
		
		return "tarefa/adicionada";
	}
	
	@RequestMapping("listaTarefas")
	public String lista(Model model){
		TarefaDAO dao = new TarefaDAO();
		List<Tarefa> tarefas = dao.lista();
		model.addAttribute("tarefas", tarefas);
		return "tarefa/lista";
	}
	
	@RequestMapping("removeTarefa")
	public String remove(Tarefa tarefa){
		TarefaDAO dao = new TarefaDAO();
		dao.remove(tarefa);
		return "forward:listaTarefas";
	}
	
	
	@RequestMapping("mostraTarefa")
	public String mostra(Long id, Model model){
		TarefaDAO dao = new TarefaDAO();
		model.addAttribute("tarefa", dao.buscaPorId(id));
		return "tarefa/mostra";
	}
	
	@RequestMapping("alteraTarefa")
	public String altera(Tarefa tarefa){
		TarefaDAO dao = new TarefaDAO();
		dao.altera(tarefa);
		return "forward:listaTarefas";
	}
	

}
