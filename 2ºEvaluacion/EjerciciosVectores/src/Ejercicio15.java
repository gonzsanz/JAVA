//Escribir un programa que lea  números enteros entre 1 y 100 de la  entrada estándar y genere un histograma con las frecuencias de cada número.
//Al introducir 0 se finaliza la entrada de datos. Para representar las barras del histograma utilizar secuencias del carácter ‘*’ 
//si un número no se ha introducido no tiene que aparecer en el histograma.

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[100];
		int num;
		
		System.out.println("Introduzca valores entre 1 y 100 o Pulse 0 para terminar");
		num = sc.nextInt();
		while (num != 0) {
			//Anotar valor
			tabla[num-1]++;
			num = sc.nextInt();
		}
		
		//Mostrar histograma
		for (int i = 0; i<tabla.length; i++) {
			if (tabla[i]>0) {
				System.out.print((i+1) + ":");
				for (int j = 1; j<=tabla[i]; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

		sc.close();
	}

}
