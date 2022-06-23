//Realizar un programa en lenguaje Java que calcule el total de un pedido de
//cestas de navidad, sabiendo que existe tres tipos de cestas A, B, C de 100, 200 y 300 Euros y que se
//aplica un descuento de un 10 % si el total del pedido supera los 1000 Euros, el pedido sólo incluye
//un tipo de cesta y el número de cestas de ese tipo.
//El programa debe mostrar el importe total, el descuento si existe y el total menos el descuento.

import java.util.Scanner;

public class E2016_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0, precio = 0;
		char cesta;
		double descuento;
		int total;
		System.out.println("Cesta A = 100€");
		System.out.println("Cesta B = 200€");
		System.out.println("Cesta C = 300€");
		System.out.print("Elige el tipo de cesta:");
		cesta = sc.next().charAt(0);

		switch (cesta) {
		case 'A':
			System.out.println("Introduce el número de cestas que quiere: ");
			num = sc.nextInt();
			precio = 100;
			break;
		case 'B':
			System.out.println("Introduce el número de cestas que quiere: ");
			num = sc.nextInt();
			precio = 200;
			break;
		case 'C':
			System.out.println("Introduce el número de cestas que quiere: ");
			num = sc.nextInt();
			precio = 300;
			break;
		default:
				System.out.println("Opción errónea");
		}
		total = precio * num;
		
		System.out.println("Importe total: " + total + "€");
		if (total > 1000) {
			System.out.println("Descuento de 10%");
			descuento = total - (total * 0.10);
			System.out.println("importe final: " + descuento + "€");
		}
		sc.close();
	}

}
