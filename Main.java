
package app.poo;

import app.poo.*;
import java.util.*;
import java.util.Locale; //para poder usar , en float

/** Fichero: Main.java
 * @author Aran Iglesias Fernandez
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // Forzar al scanner a usar el punto como separador decimal
		//contiene las listas de pacinetes
		Comuniti comunitiList = new Comuniti();

		int opc = 0;

		while (opc != 4) {
			System.out.println("\nIntroduce el numero de la opcion que quieras:");
			System.out.println("1.- Introducir paciente");
			System.out.println("2.- Dar de baja paciente");
			System.out.println("3.- Mostrar datos de paciente");
			System.out.println("4.- Salir\n");
			boolean val= false; 
			while(!val){
				try {
					opc = sc.nextInt();
					sc.nextLine(); // limpiaa buffer
					val = true; 
				} catch (InputMismatchException e) {
					System.out.println("Porfavor introduce un numero valido.");
					sc.nextLine(); 

				}
			}; 


			switch (opc) {
			case 1:

				System.out.println("Introduce nombre:");
				String nom = sc.nextLine();

				System.out.println("Primer aprellido: ");
				String pa = sc.nextLine();

				System.out.println("Years: ");
				int year = sc.nextInt();
				sc.nextLine();

				System.out.println("Genero: ");
				String gen = sc.nextLine();

				System.out.println("Peso (kg): ");
				float pes = sc.nextFloat();
				sc.nextLine();

				System.out.println("Altura (cm): ");
				float alt = sc.nextFloat();
				//leeotro vez para que se asegure de estar vacio
				sc.nextLine();

				Email email = new Email();
				boolean emailok = false;

				while (!emailok) {
					System.out.println("Email: ");
					String ema = sc.nextLine();

					try {
						email.setEmail(ema);
						emailok = true; // sale del bucle si da excepción
					} catch (EmailException e) {
						System.out.println("Error: " + e.getMessage());
					}

				}

				Person persona = new Person(nom, pa, year, gen, pes, alt, email);
				comunitiList.putPatient(persona);
				break;

			case 2:
				System.out.println("Introduce el email del paciente que quieres eliminar: ");
				String gmail = sc.nextLine();
				comunitiList.deletePatient(gmail);
				break;

			case 3:
				System.out.println("Introduce el email del paciente que quieres revisar: ");
				String em = sc.nextLine(); 
				comunitiList.patient_Data(em);
				break;

			case 4: 
				System.out.println(" Todo listo :)");
				break; 


			default:
				System.out.println("Introduce un numero de la lista.");


			}



		}

	}
}

