package com.tecsup.proyecto.validators;
import java.net.URISyntaxException;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.sun.org.apache.xerces.internal.util.URI;
import com.sun.org.apache.xerces.internal.util.URI.MalformedURIException;

@FacesValidator("com.tecsup.proyecto.validators.LoginValidator")

public class LoginValidator implements Validator{
	
	@Override
	public void validate(FacesContext facesContext, UIComponent component,
			Object value) throws ValidatorException {
		
		FacesMessage msg = 
	    	     new FacesMessage("mi error");
		throw new ValidatorException(msg);
				
		/*
		 StringBuilder url = new StringBuilder(); 
	      String urlValue = value.toString();  
	      if(!urlValue.startsWith("http://", 0)){ 
	         url.append("http://"); 
	      } 
	      url.append(urlValue);  
	      
	      try { 
	         new URI(url.toString()); 
	      } catch (MalformedURIException e) {
	    	  FacesMessage msg = 
	    	     new FacesMessage("URL validation failed","Invalid URL format"); 
	    	  msg.setSeverity(FacesMessage.SEVERITY_ERROR); 
	    	  throw new ValidatorException(msg);
		} 		
	      */
	      
	}

}
