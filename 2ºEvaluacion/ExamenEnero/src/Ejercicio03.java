import java.util.Arrays;
public class Ejercicio03 {

	public static void main(String[] args) {
		int tabla[] = { 10, 1, 1, 6, 7, 5 };

		anularValor(tabla,1);
		System.out.println(Arrays.toString(tabla));
	}

	public static int anularValor(int tabla[], int valor) {
		int cont = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (valor == tabla[i]) {
				tabla[i] = 0;
				cont++;
			}
		}

		return cont;
	}
}
