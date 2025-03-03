package app.poo;

import app.poo.*;
import java.util.List;
import java.util.LinkedList;
import java.io.*;


/** Fichero : comuniti.java
 * @author Aran Iglesias Fernandez
 */

public class Comuniti {
	//paciente en revisión
	List<Person> pacion;
	//paciente que se han ido
	List<Person> pacoff;

	public Comuniti() {
		pacion = new LinkedList<Person>();
		pacoff = new LinkedList<Person>();
	}




	//
	public void putPatient(Person patient) {

		Person is = findPatient(patient.getEmail().getEmail());
		if (is == null) //si es null esque no hay paciente 
			pacion.add(patient);
		else
			System.out.println("Ya existe un paciente con este gamil.");

	}

	//
	public void deletePatient(String email) {
		Person is = findPatient(email);

		if (is != null) {
			pacoff.add(is);
			pacion.remove(is);
			System.out.println("Paciente con email " + email + " eliminado correctamente. ");
		} else
			System.out.println("No existe paciente con este email.");

	}
	//
	public void patient_Data(String email) {
		Person is = findPatient(email);
		if(is != null)
			System.out.println(is.toString());
		else 
			System.out.println("Este email no esta en la lista. Opcion 1 para agregar.");

		
	}

	//
	public Person findPatient(String email) {
		Person pfind = null;
		for (Person p : pacion) {
			if (p.getEmail().getEmail().equals(email)) {
				pfind = p;
				break;
			}

		}

		return pfind;
	}

}