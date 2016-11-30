package br.com.caelum.tarefa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefa.dao.UsuarioDAO;
import br.com.caelum.tarefa.modelo.Usuario;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String loginForm(){
		
		return "formulario-login";
	}
	
	@RequestMapping("efetuaLogin")
	public String efetuarLogin(Usuario usu, HttpSession sessao){
		if(new UsuarioDAO().existeUsuario(usu)){
			sessao.setAttribute("usuarioLogado", usu);
			return "menu";
		}
			
		return "redirect:login";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:login";
	}
	
}
