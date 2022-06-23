/*
 * Muestre el mensaje “procesando datos... desea continuar (s/n)”,
 * si el usuario introduce ‘S’, se repite el mensaje y si dice ‘N’ muestra el mensaje adiós y termina.
 */

import java.util.*;
public class Ejercicio07 {
	
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		char letra;
				
		do {
			System.out.println("procesando datos... desea continuar (s/n)");
			letra = input.next().charAt(0);
		}
		while (letra !='n');
		System.out.println("Adios");

		input.close();

		
	}
}
