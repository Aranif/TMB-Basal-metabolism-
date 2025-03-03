package app.poo;

import app.poo.*;
import app.poo.EmailException;
import java.lang.Exception;

public class Email {
	private String email;

	//Constructor
	public Email(){
		this.email = ""; 
	}

	public Email(String email) throws EmailException{
		setEmail(email); 
	}
	

	public void setEmail(String email) throws EmailException {

		boolean haveat = findAt(email);
		if (haveat == true)
			this.email = email;
		else
			throw new EmailException("El gmail no contiene '@'");

	}

	public String getEmail(){
		return email; 
	}

	public boolean findAt(String email) {
		boolean find = false;
		if (email.contains("@"))
			find = true;

		return find;
	}
}