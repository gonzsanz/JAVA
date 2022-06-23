/*
 * Escriba un programa que defina la constante PI como 3.1416, que calcule el 
área de un círculo, cuyo radio se pide por pantalla, y lo imprima por pantalla.
 */

import java.util.Scanner;
public class Ejercicio01 {
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		
		final float PI = 3.1416f;
		int radio;
		float area;
		
		System.out.print("Introduzca el radio del círculo en cm:");
		radio = sc.nextInt();
		
		area = PI * (radio*radio);
		System.out.println("El área del círculo es: " + area + "cm");

		sc.close();
	}
}
