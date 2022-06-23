/*Leer un serie de números hasta que el usuario introduzca un 0. Mostrar a continuación los número divisibles entre 3 
 * que se han almacenado. Como máximo podremos almacenar un máximo de 10 números divisibles entre 3 (Capacidad de la tabla).
 */

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[10];
		int num;
		int contador = 0;
		int divisibles = 0;
		
		System.out.println("Introducir números y terminar con el valor 0");
		do {
			num = sc.nextInt();
			contador++;
			if(num % 3 == 0) {
				divisibles++;
			}
			
		}while (num !=0);
		
		for (int i = 0; i<tabla.length; i++) {
			
		}
		System.out.println("Números introducidos: " + contador);
		System.out.println("Números divisibles entre 3: " + divisibles);
		System.out.println("valores:");
	
		for (int j = 0; j<tabla.length; j++) {
			System.out.print(tabla[j] + " ");
		}

		sc.close();
	}
}
