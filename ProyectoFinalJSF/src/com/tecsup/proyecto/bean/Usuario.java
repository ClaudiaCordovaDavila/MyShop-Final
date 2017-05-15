package com.tecsup.proyecto.bean;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String usuario;
	private String contraseña;
	private String pregunta;
	private String respuesta;
	
	public Usuario(int id, String usuario, String contraseña, String pregunta, 
			String respuesta){
		super();
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}
	
	public Usuario(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}	
}
