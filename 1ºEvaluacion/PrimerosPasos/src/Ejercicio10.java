/*
 * Un programa que lea números, los vaya sumando hasta que el usuario introduzca el número 0, entonces muestra la suma total y la media.
 */

import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int media;
		int contador = 0;
		System.out.println("Introduce números o 0 para finalizar");
		do {
			num = numero.nextInt();
			suma = suma + num;
			contador++;
		}
		while (num != 0);
		
		media = suma / contador;
		System.out.println("La suma de los números es " + suma);
		System.out.println("La media de los números es " + media);
		
		numero.close();

	}
}
