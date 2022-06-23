//Leer 10 números y almacenar en una tabla sólo los valores distintos, es decir si un número es introducido varias veces
//sólo se almacena en la tabla una sola vez. El programa terminará cuando la tabla esté completa.

import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[10];
		
		System.out.println("Introduce 10 números sin repetir:");
		for (int i = 0; i<tabla.length;i++) {
			System.out.print("vector [" + i + "] = ");
			tabla[i] = sc.nextInt();
			for(int j = 0; j<i; j++) {
				if(tabla[i] == tabla[j]) {
					i--;
				}
			}
		}
		System.out.println("\n VALORES ASIGNADOS \n");
		for (int k = 0; k<tabla.length; k++) {
			System.out.println("vector [" + k + "] = " + tabla[k]);
		}

		sc.close();
	}

}
