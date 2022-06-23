/*
 * Escribe un programa que imprima los números del 1 al 10 y que además 
indique si dicho número es par o impar
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		
		for (int contador = 1; contador <= 10; contador++) {
			if (contador%2 == 0) {
				System.out.println(contador + " es par");
			}
			else {
				System.out.println(contador + " es impar");
			}
		}
	}

}
