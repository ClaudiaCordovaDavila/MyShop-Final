package com.tecsup.proyecto.validators;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("com.tecsup.proyecto.validators.UserValidator")

public class UserValidator implements Validator{
	
	@Override
	public void validate(FacesContext facesContext, UIComponent component,
			Object value) throws ValidatorException {
		
		
		
//		StringBuilder url = new StringBuilder(); 
//	      String urlValue = value.toString();  
//	      if(!urlValue.startsWith("http://", 0)){ 
//	         url.append("http://"); 
//	      } 
//	      url.append(urlValue);  
//	      
//	      try { 
//	         new URI(url.toString()); 
//	      } catch (MalformedURIException e) {
//	    	  FacesMessage msg = 
//	    	     new FacesMessage("URL validation failed","Invalid URL format"); 
//	    	  msg.setSeverity(FacesMessage.SEVERITY_ERROR); 
//	    	  throw new ValidatorException(msg);
//		} 		
		
	}
}