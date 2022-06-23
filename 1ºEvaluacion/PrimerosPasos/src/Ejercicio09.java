/*
 * Un programa que lea un valor N, que indica cuantos números va a leer, lea los N números y calcule la suma y la media.
 */

import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int N, num, contador, media;
			int suma = 0;
			
			System.out.print("Número de valores a leer: ");
			N = entrada.nextInt();
			
			System.out.println("Introduce los valores: ");

			for (contador = 1; contador <= N; contador++) {
				num = entrada.nextInt();
				suma = suma + num;
			}
			media = suma / N;
			System.out.println("La suma de los valores es " + suma);
			System.out.println("La media de los valores es " + media);
		}
			
	}
}
