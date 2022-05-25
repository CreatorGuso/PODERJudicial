package com.LoginRegistroUsuario.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoginRegistroUsuario.App.Entity.usuario;

@Repository
public interface usuarioRepository extends JpaRepository<usuario, Integer>{
	
}


