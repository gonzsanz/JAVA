//Define dos tablas de 10 enteros Tabla1 y Tabla2,  rellenar la primera tabla con 10 valores, 
//copiar en Tabla2 los elementos de tabla1 que sean pares y mostrar los elementos almacenados en tabla2.

import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Ta[] = new int [10];
		int Tb[] = new int [10];
		int contador = 0;
		
		System.out.println("Introduzca 10 valores");
		for (int i = 0; i<Ta.length; i++) {
			Ta[i] = sc.nextInt();
			if (Ta[i] % 2 == 0) {
				Tb[i] = Ta[i];
				contador++;
			} else Tb[i] = -1;
		}
		
		System.out.println("Números introducidos pares: "+contador);
		for (int j = 0; j<Tb.length; j++) {
			if (Tb[j] != -1) System.out.print(Tb[j] + " ");
		}

		sc.close();
	}

}
