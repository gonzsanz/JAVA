/*
 * Leer tres número enteros y mostrar una flecha con guiones terminados con el carácter ‘>’ según el formato del ejemplo  
 * con el valor de cada uno de los números. Hay que mostrar el valor y su representación en forma de flecha.
 */

import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Introduce 3 números:");
		num1 = numero.nextInt();
		num2 = numero.nextInt();
		num3 = numero.nextInt();

		System.out.print(num1 + ": ");
		for (int i = 1; i <= num1; i++) {
			System.out.print("-");

		}
		System.out.println(">");
		
		System.out.print(num2 + ": ");
		for (int i = 1; i <= num2; i++) {
			System.out.print("-");

		}
		System.out.println(">");
		
		System.out.print(num3 + ": ");
		for (int i = 1; i <= num3; i++) {
			System.out.print("-");

		}
		System.out.println(">");

		numero.close();

	}

}
