import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = {1,2,3,4,7};
		int valor = sc.nextInt();
		añadirValor(tabla, valor);
		
		sc.close();
	}
	static void  añadirValor (int tabla[], int valor) {
		int aux[] = new int[tabla.length];
		aux[0] = valor;
		for (int i=0; i<tabla.length-1; i++) {
				aux[i+1] = tabla[i];
		}
		
		System.out.println(Arrays.toString(aux));
	}
}
