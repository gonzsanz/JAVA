//Leer 20 número, y calcular el porcentaje de valores que supera el valor de la media.

import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[20];
		int suma = 0;
		int media;
		int contSupera = 0;
		
		//Rellenar
		for (int i=0; i<num.length; i++) {
			System.out.print("vector[" + i + "]= ");
			num[i] = sc.nextInt();
			suma += num[i];
		}
		
		media = suma/20;
		
		//Comparar
		for (int i = 0; i<num.length;i++) {
			if (num[i] > media) {
				contSupera++;
			}
		}
		contSupera = contSupera*100/20;
		System.out.println("La media es = " + media);
		System.out.println("Superan el valor de la media: " + contSupera + " %");

		sc.close();
	}

}
