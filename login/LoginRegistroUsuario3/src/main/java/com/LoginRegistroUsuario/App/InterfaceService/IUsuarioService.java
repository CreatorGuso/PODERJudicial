package com.LoginRegistroUsuario.App.InterfaceService;

import java.util.List;

import com.LoginRegistroUsuario.App.Entity.usuario;

public interface IUsuarioService {
	public List<usuario>ListarUsuario();
	//usuario findByLogin(String Login);
}
