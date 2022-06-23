//Elaborar un algoritmo que lea números enteros hasta que el usuario introduzca un valor igual a
//cero y calcule la media de los números pares y de los impares. El programa me mostrará el número
//total de valores introducidos y cual de las dos medias tiene un valor mayor: la de los pares o la de
//los impares. 

import java.util.Scanner;

public class E2016_01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num;
		int par = 0, impar = 0, total = 0, contPar = 0, contImpar = 0;
		int mediaPar = 0, mediaImpar = 0;
		System.out.println("Introduzca valores o 0 para finalizar");

		do {
			num = sc.nextInt();
			if (num > 0 || num < 0) {
				if (num % 2 == 0) {
					par = par + num;
					contPar++;
				} else {
					impar = impar + num;
					contImpar++;
				}
			}
			total++;
		} while (num != 0);
		System.out.println("El número total de valores es: " + total);
		System.out.println("El número de valores pares es: " + contPar);
		System.out.println("El número de valores impares es: " + contImpar);

		mediaPar = par / contPar;
		mediaImpar = impar / contImpar;
		System.out.println("La media de los valores pares es: " + mediaPar);
		System.out.println("La media de los valores impares es: " + mediaImpar);

		if (mediaPar > mediaImpar) {
			System.out.println("La media mayor es la Par");
		} else
			System.out.println("La media mayor es la Impar");

			sc.close();
	}

}
