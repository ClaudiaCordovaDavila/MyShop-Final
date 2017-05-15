package com.tecsup.proyecto.bean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.proyecto.myshop.bean.Producto;
import com.proyecto.myshop.db.ConeccionDB;

import oracle.sql.BLOB;

@ManagedBean(name = "managerData", eager = true)
@SessionScoped
public class ManagerData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String inNombre;
	private String inMarca;
	private String inDireccion;
	private int inCalificacion;
	private String inPrecio;
	private BLOB inFoto;
	//kg
	private Producto producto;

	
	public String getInNombre() {
		return inNombre;
	}

	public void setInNombre(String inNombre) {
		this.inNombre = inNombre;
	}

	public String getInMarca() {
		return inMarca;
	}

	public void setInMarca(String inMarca) {
		this.inMarca = inMarca;
	}

	public String getInDireccion() {
		return inDireccion;
	}

	public void setInDireccion(String inDireccion) {
		this.inDireccion = inDireccion;
	}

	public int getInCalificacion() {
		return inCalificacion;
	}

	public void setInCalificacion(int inCalificacion) {
		this.inCalificacion = inCalificacion;
	}
	
	public String getInPrecio() {
		return inPrecio;
	}

	public void setInPrecio(String inPrecio) {
		this.inPrecio = inPrecio;
	}

	public BLOB getInFoto() {
		return inFoto;
	}

	public void setInFoto(BLOB inFoto) {
		this.inFoto = inFoto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public ArrayList<Producto> getProductos() {
		ResultSet rs = null;
		PreparedStatement pst = null;
		Connection con = ConeccionDB.getConnection();
		String stm = "Select nombre, marca, direccion, calificacion, precio, foto from PRODUCTOS";
		ArrayList<Producto> records = new ArrayList<Producto>();
		//employees = new ArrayList<Employee>();
		try {
			pst = con.prepareStatement(stm);
			pst.execute();
			rs = pst.getResultSet();
			while (rs.next()) {
				Producto emp = new Producto();
				emp.setNombre(rs.getString(1));
				emp.setMarca(rs.getString(2));
				emp.setDireccion(rs.getString(3));
				emp.setCalificacion(rs.getInt(4));
				emp.setPrecio(rs.getString(5));
				emp.setFoto(rs.getBlob(6));
				records.add(emp);
				//employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return records;
		//return employees;
	}
	
public String chooseProducto(){
		
	    this.setInNombre(getProducto().getNombre());
	    this.setInMarca(getProducto().getMarca());
	    this.setInDireccion(getProducto().getDireccion());
	    this.setInCalificacion(getProducto().getCalificacion());
	    this.setInPrecio(getProducto().getPrecio());
	    
	    return null;
	 }
	
	public String busquedaProducto() {
		ResultSet rs = null;
		PreparedStatement pst = null;
		Connection con = ConeccionDB.getConnection();
		String stm = "Select nombre, marca, direccion, calificacion, precio, foto from PRODUCTOSPRUEBA WHERE NOMBRE =?";
		ArrayList<Producto> records = new ArrayList<Producto>();
		//employees = new ArrayList<Employee>();
		try {
			pst = con.prepareStatement(stm);
			pst.setString(1, getInNombre());
			pst.execute();
			rs = pst.getResultSet();
			while (rs.next()) {
				Producto emp = new Producto();
				emp.setNombre(rs.getString(1));
				emp.setMarca(rs.getString(2));
				emp.setDireccion(rs.getString(3));
				emp.setCalificacion(rs.getInt(4));
				emp.setPrecio(rs.getString(5));
				emp.setFoto(rs.getBlob(6));
				records.add(emp);
				//employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;
	}

	public String createProducto() {

		PreparedStatement pst = null;
		Connection con = ConeccionDB.getConnection();
		String stm = "INSERT INTO PRODUCTOS (nombre, marca, direccion, calificacion, precio) VALUES (?,?,?,?,?)";
		try {
			pst = con.prepareStatement(stm);
			pst.setString(1, getInNombre());
			pst.setString(2, getInMarca());
			pst.setString(3, getInDireccion());
			pst.setInt(4, getInCalificacion());
			pst.setString(5, getInPrecio());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		resetField();

		return null;
	}
	
private void resetField(){
		
		this.inNombre = "";
		this.inMarca = "";
		this.inDireccion = "";
		this.inCalificacion = 0;
		this.inPrecio = "";
	}
}
