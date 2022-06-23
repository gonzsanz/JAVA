/*
 * Realizar un programa  que permita introducir las estaturas (en cm) de los 40 alumnos de una clase,
 *  visualizar la mayor , la menor de ellas y la estatura media.
 */

import java.util.Scanner;
public class Ejercicio01B {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int estatura = 0;
		int max, min;
		double media;
		int contEstatura = 0;
		
		System.out.println("Introduce la estatura (en cm) de 40 alumnos:");
		
		estatura = entrada.nextInt();
		max = estatura;
		min = estatura;

		for (int i = 2; i <= 40; i++) {
			estatura = entrada.nextInt();
			if (estatura > max) {
				max = estatura;
			}
			else {
				if (estatura < min) {
					min = estatura;
				}
			}
			contEstatura = contEstatura + estatura;
		}
		media = contEstatura / 40;
		System.out.println("El más alto mide " + max + " cm");
		System.out.println("El más bajo mide " + min + " cm");
		System.out.println("La altura media es " + media + " cm");

		entrada.close();
	}

}
