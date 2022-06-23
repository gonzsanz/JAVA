/*
 * Leer un número entero y mostrar una muralla de  asteriscos con tantas almenas como indique el usuario.
 */

import java.util.Scanner;
public class Ejercicio02B {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tamaño;
		
		System.out.print("Escribir el tamaño de la muralla:");
		tamaño = entrada.nextInt();
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1 ;j <= tamaño*5-1; j++) {
				if (i == 1 || i == 2) {
					if (j % 5 == 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}

		entrada.close();
	}
}

