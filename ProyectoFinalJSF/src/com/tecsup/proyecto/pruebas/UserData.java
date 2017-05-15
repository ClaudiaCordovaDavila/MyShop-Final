package com.tecsup.proyecto.pruebas;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.tecsup.proyecto.bean.Usuario;
import com.tecsup.proyecto.db.ConectionDB;

@ManagedBean(name = "userData2", eager = true)
@SessionScoped
public class UserData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//sdnfffsdfs
	private int inId;
	private String inUsuario;
	private String inContrasena;
	private String inPregunta;
	private String inRespuesta;
	
	private Usuario usuario;

	public int getInId() {
		return inId;
	}

	public void setInId(int inId) {
		this.inId = inId;
	}

	public String getInUsuario() {
		return inUsuario;
	}

	public void setInUsuario(String inUsuario) {
		this.inUsuario = inUsuario;
	}

	public String getInContrasena() {
		return inContrasena;
	}

	public void setInContraseña(String inContrasena) {
		this.inContrasena = inContrasena;
	}

	public String getInPregunta() {
		return inPregunta;
	}

	public void setInPregunta(String inPregunta) {
		this.inPregunta = inPregunta;
	}

	public String getInRespuesta() {
		return inRespuesta;
	}

	public void setInRespuesta(String inRespuesta) {
		this.inRespuesta = inRespuesta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public ArrayList<Usuario> getUsuarios(){
		ResultSet rs = null;
		PreparedStatement pst = null;
		Connection con = ConectionDB.getConnection();
		String stm = "Select id_user, usuario, contraseña, pregunta, respuesta from usuarios";
		ArrayList<Usuario> records = new ArrayList<Usuario>();
		try {
			pst = con.prepareStatement(stm);
			pst.execute();
			rs = pst.getResultSet();
			while (rs.next()) {
				Usuario use = new Usuario();
				use.setId(rs.getInt(1));
				use.setUsuario(rs.getString(2));
				use.setContraseña(rs.getString(3));
				use.setPregunta(rs.getString(4));
				use.setRespuesta(rs.getString(5));
				records.add(use);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return records;
	}
	
	public String createUsuario(){
		PreparedStatement pst = null;
		Connection con = ConectionDB.getConnection();
		String stm = "INSERT INTO usuarios (USUARIO, CONTRASEÑA, PREGUNTA, RESPUESTA) VALUES (?,?,?,?)";
		try {
			pst = con.prepareStatement(stm);
			pst.setString(2, getInUsuario());
			pst.setString(3, getInContrasena());
			pst.setString(4, getInPregunta());
			pst.setString(5, getInRespuesta());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		resetField();
		return null;
	}
	
	public String recuperarUsuario() {
		PreparedStatement pst = null;
		Connection con = ConectionDB.getConnection();
		String stm = "UPDATE USUARIOS SET CONTRASEÑA=?";
		try {
			pst = con.prepareStatement(stm);
			pst.setString(3, getInContrasena());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		resetField();		
		return null;
	}
	
	public String validarUsuario(){
		PreparedStatement pst = null;
		Connection con = ConectionDB.getConnection();
		String stm = "UPDATE USUARIOS SET CONTRASEÑA=?";
		try {
			pst = con.prepareStatement(stm);
			pst.setString(3, getInContrasena());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		resetField();		
		return null;
	}
	
	private void resetField(){
		
		this.inId = 0;
		this.inUsuario = "";
		this.inContrasena = "";
		this.inPregunta = "";
		this.inRespuesta = "";
	}
}
