package com.tecsup.proyecto.bean;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String usuario;
	private String contrase�a;
	private String pregunta;
	private String respuesta;
	
	public Usuario(int id, String usuario, String contrase�a, String pregunta, 
			String respuesta){
		super();
		this.id = id;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
