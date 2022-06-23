import java.util.*;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[10];

		System.out.println(" Introcduce 10 números:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("vector[" + i + "]= ");
			num[i] = sc.nextInt();
		}
		System.out.println(" La suma es = " + sumarTabla(num));

		sc.close();
	}

	static int sumarTabla(int num[]) {
		
		int suma = 0;
		for (int valor : num) {
			suma += valor;
		}
		return suma;
	}
}
