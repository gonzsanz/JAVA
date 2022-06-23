/*
 * Escribe un programa que indique cuantos números comprendidos entre el 1 
y el 10 son mayores que 3.
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		int mayores = 0;
		
		for (int contador = 1; contador <= 10; contador++) {
			if (contador > 3) {
				mayores++;
			}
		}
		System.out.println("Hay " + mayores + " números comprendidos entre el 1 y el 10");
	}

}
