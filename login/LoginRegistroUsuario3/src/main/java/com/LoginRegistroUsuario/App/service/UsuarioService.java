package com.LoginRegistroUsuario.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginRegistroUsuario.App.Entity.usuario;
import com.LoginRegistroUsuario.App.InterfaceService.IUsuarioService;
import com.LoginRegistroUsuario.App.Repository.usuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private usuarioRepository Datausuario;
	//@Autowired
	//private IUsuarioService DataService;
	
	@Override
	public List<usuario> ListarUsuario() {
		return (List<usuario>)Datausuario.findAll();
	}

	//@Override
	//public usuario findByLogin(String Login) {
	//	return DataService.findByLogin(Login);
	//}

}
