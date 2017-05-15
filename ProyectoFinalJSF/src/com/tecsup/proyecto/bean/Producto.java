package com.tecsup.proyecto.bean;

import java.io.Serializable;
import java.sql.Blob;

//khkgfukf

public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String marca;
	private String direccion;
	private int calificacion;
	private String precio;
	private Blob foto;
	
	public Producto(String nombre, String marca, String direccion, int calificacion, String precio, Blob foto) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.direccion = direccion;
		this.calificacion = calificacion;
		this.precio = precio;
		this.foto = foto;
	}

	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}
	
	
}
