package com.LoginRegistroUsuario.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.LoginRegistroUsuario.App.Entity.usuario;
import com.LoginRegistroUsuario.App.Repository.usuarioRepository;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{
	
	@Autowired
	usuarioRepository usuarioREPO;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//Buscar el usuario con el repositorio y si no existe lanzar una exepcion
	     com.LoginRegistroUsuario.App.Entity.usuario appUser = 
	                 usuarioREPO.findByLogin(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));
	   //Mapear nuestra lista de Authority con la de spring security 
	   //  List grantList = new ArrayList();
	   //  String tipoUsu="USER";
	   //  String tipoUsu2="ADMIN";
	   //  grantList.add(tipoUsu);
	   //  grantList.add(tipoUsu2);
	     
	     //Crear El objeto UserDetails que va a ir en sesion y retornarlo.
	     UserDetails usuario = (UserDetails) new usuario(appUser.getS_login(), appUser.getPassword());
	          return usuario;
	     }
}


