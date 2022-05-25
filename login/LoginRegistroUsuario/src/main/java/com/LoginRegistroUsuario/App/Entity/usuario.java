package com.LoginRegistroUsuario.App.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class usuario{

	//se aplica hibernate.
	@Id
	@Column(name = "n_id_usuario")
	private Integer n_id_usuario;
	@Column(name = "s_tipo_documento")
	private String s_tipo_documento;
	@Column(name = "s_documento")
	private String s_documento;
	@Column(name = "s_nombres")
	private String s_nombres;
	@Column(name = "s_apellidos")
	private String s_apellidos;
	@Column(name = "s_direccion")
	private String s_direccion;
	@Column(name = "s_celular")
	private String s_celular;
	@Column(name = "s_email")
	private String s_email;
	@Column(name = "s_clave")
	private String s_clave;
	@Column(name = "n_activo")//1
	private Byte n_activo;
	@Column(name = "n_id_perfil")//1
	private short n_id_perfil;
	@Column(name = "s_login")
	private String login;
	@Column(name = "n_id_juzgado_paz")//0
	private int n_id_juzgado_paz; //`n_id_juzgado_paz` int(11) NOT NULL DEFAULT '0',
	@Column(name = "s_direccion_procesal")//ninguno
	private String s_direccion_procesal;
	@Column(name = "s_casilla_judicial")//ninguno
	private String s_casilla_judicial;
	@Column(name = "s_casilla_electronica")//ninguno
	private String s_casilla_electronica;
	@Column(name = "s_abogado")//n
	private String s_abogado;
	@Column(name = "n_id_tipo")
	private Short n_id_tipo;//`n_id_tipo` smallint(6) NOT NULL DEFAULT '0',
	@Column(name = "s_descripcion")//" "
	private String s_descripcion;
	@Column(name = "remember_token")//N  insertable = false
	private String remember_token;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "n_id_distrito_direccion")
	private int n_id_distrito_direccion;
	@Column(name = "n_id_provincia_direccion")
	private int n_id_provincia_direccion;
	@Column(name = "n_id_departamento_direccion")
	private int n_id_departamento_direccion;
	
	public usuario() {
		 super();
	}
	public usuario(String s_clave, String password) {
		super();
		this.s_clave = s_clave;
		this.password = password;
	}

	public usuario(int n_id_usuario, String s_tipo_documento, String s_documento, String s_nombres, String s_apellidos,
			String s_direccion, String s_celular, String s_email, String s_clave, Byte n_activo, short n_id_perfil,
			String s_login, int n_id_juzgado_paz, String s_direccion_procesal, String s_casilla_judicial,
			String s_casilla_electronica, String s_abogado, Short n_id_tipo, String s_descripcion,
			String remember_token, String email, String password, int n_id_distrito_direccion,
			int n_id_provincia_direccion, int n_id_departamento_direccion) {
		super();
		this.n_id_usuario = n_id_usuario;
		this.s_tipo_documento = s_tipo_documento;
		this.s_documento = s_documento;
		this.s_nombres = s_nombres;
		this.s_apellidos = s_apellidos;
		this.s_direccion = s_direccion;
		this.s_celular = s_celular;
		this.s_email = s_email;
		this.s_clave = s_clave;
		this.n_activo = n_activo;
		this.n_id_perfil = n_id_perfil;
		this.login = s_login;
		this.n_id_juzgado_paz = n_id_juzgado_paz;
		this.s_direccion_procesal = s_direccion_procesal;
		this.s_casilla_judicial = s_casilla_judicial;
		this.s_casilla_electronica = s_casilla_electronica;
		this.s_abogado = s_abogado;
		this.n_id_tipo = n_id_tipo;
		this.s_descripcion = s_descripcion;
		this.remember_token = remember_token;
		this.email = email;
		this.password = password;
		this.n_id_distrito_direccion = n_id_distrito_direccion;
		this.n_id_provincia_direccion = n_id_provincia_direccion;
		this.n_id_departamento_direccion = n_id_departamento_direccion;
	}

	public int getN_id_usuario() {
		return n_id_usuario;
	}

	public void setN_id_usuario(int n_id_usuario) {
		this.n_id_usuario = n_id_usuario;
	}

	public String getS_tipo_documento() {
		return s_tipo_documento;
	}

	public void setS_tipo_documento(String s_tipo_documento) {
		this.s_tipo_documento = s_tipo_documento;
	}

	public String getS_documento() {
		return s_documento;
	}

	public void setS_documento(String s_documento) {
		this.s_documento = s_documento;
	}

	public String getS_nombres() {
		return s_nombres;
	}

	public void setS_nombres(String s_nombres) {
		this.s_nombres = s_nombres;
	}

	public String getS_apellidos() {
		return s_apellidos;
	}

	public void setS_apellidos(String s_apellidos) {
		this.s_apellidos = s_apellidos;
	}

	public String getS_direccion() {
		return s_direccion;
	}

	public void setS_direccion(String s_direccion) {
		this.s_direccion = s_direccion;
	}

	public String getS_celular() {
		return s_celular;
	}

	public void setS_celular(String s_celular) {
		this.s_celular = s_celular;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	public String getS_clave() {
		return s_clave;
	}

	public void setS_clave(String s_clave) {
		this.s_clave = s_clave;
	}

	public Byte getN_activo() {
		return n_activo;
	}

	public void setN_activo(Byte n_activo) {
		this.n_activo = n_activo;
	}

	public short getN_id_perfil() {
		return n_id_perfil;
	}

	public void setN_id_perfil(short n_id_perfil) {
		this.n_id_perfil = n_id_perfil;
	}

	public String getS_login() {
		return login;
	}

	public void setS_login(String s_login) {
		this.login = s_login;
	}

	public int getN_id_juzgado_paz() {
		return n_id_juzgado_paz;
	}

	public void setN_id_juzgado_paz(int n_id_juzgado_paz) {
		this.n_id_juzgado_paz = n_id_juzgado_paz;
	}

	public String getS_direccion_procesal() {
		return s_direccion_procesal;
	}

	public void setS_direccion_procesal(String s_direccion_procesal) {
		this.s_direccion_procesal = s_direccion_procesal;
	}

	public String getS_casilla_judicial() {
		return s_casilla_judicial;
	}

	public void setS_casilla_judicial(String s_casilla_judicial) {
		this.s_casilla_judicial = s_casilla_judicial;
	}

	public String getS_casilla_electronica() {
		return s_casilla_electronica;
	}

	public void setS_casilla_electronica(String s_casilla_electronica) {
		this.s_casilla_electronica = s_casilla_electronica;
	}

	public String getS_abogado() {
		return s_abogado;
	}

	public void setS_abogado(String s_abogado) {
		this.s_abogado = s_abogado;
	}

	public Short getN_id_tipo() {
		return n_id_tipo;
	}

	public void setN_id_tipo(Short n_id_tipo) {
		this.n_id_tipo = n_id_tipo;
	}

	public String getS_descripcion() {
		return s_descripcion;
	}

	public void setS_descripcion(String s_descripcion) {
		this.s_descripcion = s_descripcion;
	}

	public String getRemember_token() {
		return remember_token;
	}

	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getN_id_distrito_direccion() {
		return n_id_distrito_direccion;
	}

	public void setN_id_distrito_direccion(int n_id_distrito_direccion) {
		this.n_id_distrito_direccion = n_id_distrito_direccion;
	}

	public int getN_id_provincia_direccion() {
		return n_id_provincia_direccion;
	}

	public void setN_id_provincia_direccion(int n_id_provincia_direccion) {
		this.n_id_provincia_direccion = n_id_provincia_direccion;
	}

	public int getN_id_departamento_direccion() {
		return n_id_departamento_direccion;
	}

	public void setN_id_departamento_direccion(int n_id_departamento_direccion) {
		this.n_id_departamento_direccion = n_id_departamento_direccion;
	}
}