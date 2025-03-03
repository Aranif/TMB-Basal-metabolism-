package app.poo;

import app.poo.*;
import java.lang.Exception; 

public class EmailException extends Exception{
	private String text; 
	private static final long serialVersionUID = 1L; // Agregar serialVersionUID para evitar el warning


	public  EmailException(String str){
		super(str); //lama a constructor de Exception
	
}
}