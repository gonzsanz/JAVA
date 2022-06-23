/*
 * Un programa que lea 4 número y calcule la media.
 */

import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		float media;
		
		System.out.println("Introduce 4 números");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		
		media = (num1 + num2 + num3 + num4)/4;
		System.out.println("La media es " + media);
		
		input.close();

	}
}