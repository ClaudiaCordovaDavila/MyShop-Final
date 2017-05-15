package com.tecsup.proyecto.validators;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="UserData", eager= true)
@SessionScoped
public class UserData implements Serializable {
	private static final long serialVersionUID = 1L; 
	   public String data; 
 
	   public String getData() { 
	      return data; 
	   } 
	   public void setData(String data) { 
	      this.data = data; 
	   }
}
