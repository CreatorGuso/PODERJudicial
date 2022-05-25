package com.LoginRegistroUsuario.App.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LoginRegistroUsuario.App.Entity.usuario;
import com.LoginRegistroUsuario.App.service.UsuarioService;

@Controller
@RequestMapping
public class ControllerTablaUsuario {
	
	@Autowired
	private UsuarioService ServiceUsuario;
	
	@GetMapping("/listarUsuario")
	public String ListarUsuario(Model model) {
		List<usuario>usuario=ServiceUsuario.ListarUsuario();
		model.addAttribute("usuarios",usuario);
		return "usuarios";
	}
	@GetMapping({"/","/login2"})
	public String Login2(Model model) {
		return "login2";
	}
}
