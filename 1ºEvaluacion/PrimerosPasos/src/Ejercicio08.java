/*
 * Un programa que lea un número, que compruebe que está comprendido entre 10 y 100,
 * que lo muestre por pantalla o que lo vuelva a leer en el caso que no cumpla la condición.
 */

import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num = 0;
		do {
			System.out.println("Introduce un número entre 10 y 100:");
			num = numero.nextInt();
		}
		while (num < 10 || num > 100);
		System.out.println("El numero introducido es: " + num);
		
		numero.close();
	}
}