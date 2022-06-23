/*
 * Se necesita conocer una serie de datos de una empresa, para ello se introduce los 20 salarios de los empleados.
 * Realizar un algoritmos que sea capaz de responder a las siguientes preguntas:
 */
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double salario;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		System.out.println("Introduce los 20 salarios:");
		
		for (int i=1; i <= 3; i++) {
			salario = entrada.nextDouble();
			if (salario > 3000) contador1++;
			if (salario > 1000 && salario < 3000) contador2++;
			if (salario < 1000) contador3++;
		}
		System.out.println(contador1 + " personas ganan mas de 3000 Euros/Mes");
		System.out.println(contador2 + " personas ganan entre 1000 y 3000 Euros/Mes");
		System.out.println(contador3 + " personas ganan menos de 1000 Euros/Mes");

		entrada.close();
	}

}
