package app.poo;

import app.poo.*;


/**
 * Fichero : persona.java
 * calse para persona
 *
 * @author Arán Iglesias Fernández
 */

public class Person {
	//nom
	private String nom;
	//primer ape
	private String pa;
	//year
	private int ye;
	//genero
	private String gen;
	//peso
	private float kg; //kg
	//altura
	private float alt; //cm
	//metabolismo
	private float tmb;

	//Email que sera el identificador
	Email email;

	//Constructor vacio
	public Person() {}

	//Constructor
	public Person(String nom, String primera, int year, String genre, float pes, float tam, Email email) {
		this.nom = nom;
		this.ye = year;
		this.gen = genre;
		this.pa = primera;
		this.kg = pes;
		this.alt = tam;
		this.email = email;
		setMetabolismo();

	}
//funciones para dar datos
	public String getNombre() {
		return nom;
	}
	public String getPrimerApellido() {
		return pa;
	}
	public int getYear() {
		return ye;
	}

	public Email getEmail() {
		return email;
	}

	public float getKg(){
		return kg; 
	}

	private void setMetabolismo() {

		if (gen.equals("Hombre"))
			tmb = (10f * kg) + (6.25f * alt) - (5f * ye) + 5f;
		else if(gen.equals("Mujer"))
			tmb = (10f * kg) + (6.25f * alt) - (5f * ye) - 161f;
		else 
			tmb = 0; // valor por defecto
	}

	public void setYear(int year) {
		this.ye = year;
	}

	public void setKg(float body_weight) {
		this.kg = body_weight;

	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String toString() {
		return "Nombre: " + nom + "\n" +
		       "Primer apellido: " + pa + "\n" +
		       "Years: "+ ye + "\n" +
		       "Peso: " + kg + "\n" +
		       "Altura: " + alt + "\n" +
		       "TMB: " + tmb + "\n" +
		       "Email: " + email.getEmail() + "\n";
	}


}
