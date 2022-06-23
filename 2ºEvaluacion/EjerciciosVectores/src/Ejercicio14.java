//Rellenar una tabla 5 enteros y mostrar los valores de la tabla  mediante asteriscos.

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int tabla[] = new int[5];
			
			System.out.println("Introduce 5 valores:");
			int i;
			for (i = 0; i<tabla.length;i++) {
				tabla[i] = sc.nextInt();
			}
			for (i=0; i<tabla.length; i++) {
				System.out.print(tabla[i] + ":");
				for (int j = 0; j<tabla[i];j++ ) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
			
	
	}

}
