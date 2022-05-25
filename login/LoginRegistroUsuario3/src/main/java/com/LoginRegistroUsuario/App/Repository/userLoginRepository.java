package com.LoginRegistroUsuario.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.LoginRegistroUsuario.App.Entity.usuario;

@Controller
public interface userLoginRepository extends JpaRepository<usuario, Integer>{
	usuario findByLogin(String Login);
}
