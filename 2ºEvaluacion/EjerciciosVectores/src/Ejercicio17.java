//Rellenar una tabla con 20 caracteres, ordenar la tabla y mostrar el resultado.

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "hadjsgewngoiewbgoweg";
		char tabla[] = s.toCharArray();
		
		System.out.println("Introduzca 20 caracteres:");
		System.out.println(s);
		
		for (int i = 0; i<tabla.length; i++) {
			for (int j = 0; j<tabla.length; j++) {
				if (tabla[i]<tabla[j]) {
					char aux = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = aux;
				}
			}
		}
		System.out.println("Tabla ordenada:");
		System.out.println(tabla);

		sc.close();
	}

}
