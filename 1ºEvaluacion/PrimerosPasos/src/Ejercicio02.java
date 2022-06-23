/*
 * Leer dos números e indicar cual es el mayor.
 */

import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		try (Scanner numero = new Scanner(System.in)) {
			int num1;
			int num2;
			
			System.out.println("Introduce el primer número: ");
			num1 = numero.nextInt();
			
			System.out.println("Introduce el segundo número: ");
			num2 = numero.nextInt();
			
			if ( num1 > num2) {
				System.out.println("el mayor es " + num1);
				}
			else {
				System.out.println("El mayor es " + num2);
			}
		}	
		
	}
}
