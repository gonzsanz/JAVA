/*
 * Realizar un programa que lea valores entre 0 y 9 que representan los dígitos de un número entero 
 * ( unidades, decenas, centenas y unidades de millar...)   mostrar a continuación el valor introducido. 
 */

import java.util.Scanner;
public class Ejercicio03B {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int digito, num, potencia;
		num = 0;
		potencia = 1;
		
		System.out.println("Introduce digitos hasta pulsar -1:");
		digito = numero.nextInt();

		do {
			num = num + digito*potencia;
			potencia = potencia * 10;
			digito = numero.nextInt();
		}
		while (digito >= 0);
		System.out.println("Valor final: " + num);

		numero.close();
	}

}
