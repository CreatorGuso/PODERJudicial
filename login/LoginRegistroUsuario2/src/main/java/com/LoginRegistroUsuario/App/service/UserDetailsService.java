package com.LoginRegistroUsuario.App.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.LoginRegistroUsuario.App.Entity.usuario;
import com.LoginRegistroUsuario.App.Repository.usuarioRepository;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Autowired
	private usuarioRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String Login) throws UsernameNotFoundException {
		
		usuario us = repo.findByLogin(Login);
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDet = new User(us.getLogin(),us.getClave(),roles);
		return userDet;
	}
}
