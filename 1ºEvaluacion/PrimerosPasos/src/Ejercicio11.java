/*
 * Un programa que lea 200 números y me indique cual el máximo y el mínimo.
 */

import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num;
		int max = 0;
		int min = 0;
		int contador = 0;
		int contador2 = 1;
		
		System.out.println("Introduce 200 números");
		
		do {
			num = numero.nextInt();
			System.out.println("Has introducido " + contador2 + "/200 números");
			contador2++;
			contador++;
			if (num > max) {
				max = num;
			}
			else {
				if (min < num) {
					min = num;
				}
			}
		}
		while (contador < 200);
		System.out.println("El mayor es " + max);
		System.out.println("El mayor es " + min);
		
		numero.close();

	}

}
