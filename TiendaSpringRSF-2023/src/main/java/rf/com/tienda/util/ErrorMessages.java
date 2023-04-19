package rf.com.tienda.util;

import java.time.LocalDate;

/* *****************************************************
 * NOMBRE: ErrorMessages.java
 * 
 * DESCRIPCION:  
 * 			Clase con los String que contienen los mensajes de error 
 * 			especificados por las reglas de negocio.
 * 
 *  @version	Enero 2016
 *  
 *  @author 	Miguel Garcia
 *  
 *  *****************************************************/
public class ErrorMessages {
	
	
		
	/**
	 * Codigo de producto
	 */
	public final static String PROERR_001 = "Formato codigo erroneo";
	public final static String PROERR_002 = "Longitud de codigo erroneo";
	
	/**
	 * Campo con longitud erronea
	 */
	public final static String PROERR_003 = "La longitud de ? ha de estar entre ? y ?";
	
	public final static String PROERR_004 = "El rango del campo es erroneo";
	
	public final static String PROERR_005 = "La fecha no es mayor o igual al dia actual -> " + LocalDate.now();
	
	public final static String CATERR_001 = "Longitud del campo erronea.";
	
	public final static String USUERR_001 = "Formato Email incorrecto.";
	
	public final static String USUERR_002 = "Formato Contrasenia incorrecto.";
	
	public final static String USUERR_003 = "Formato DNI incorrecto.";

}
