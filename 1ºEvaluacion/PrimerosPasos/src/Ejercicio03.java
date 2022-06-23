/*
 * Leer tres números e indicar cual es el mayor.
 */

import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduce el primer número: ");
		num1 = numero.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = numero.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		num3 = numero.nextInt();
		
		if ( num1 > num2) {
			if ( num1 > num3 ) {
				System.out.println("El mayor es " + num1);
			}
			else {
				System.out.println("El mayor es " + num3);
				}
		}
		else {
			if ( num2 > num3) {
				System.out.println("El mayor es " + num2);
			}
			else {
				System.out.println("El mayor es " + num3);
			}
		}
		numero.close();
		
	}
}	
