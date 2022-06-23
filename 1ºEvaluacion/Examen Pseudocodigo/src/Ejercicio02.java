/*
 * Leer un número entero y mostrar cada una de su cifras en distintas líneas. 
 */

import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num, digito;
		System.out.print("Introduce un número:");
		num = numero.nextInt();
		while (num > 0) {
			digito = num % 10;
			System.out.println(digito);
			num = num / 10;
		}

		numero.close();
	}

}
