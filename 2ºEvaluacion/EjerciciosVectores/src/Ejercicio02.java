import java.util.*;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int [10];
		
		System.out.println(" Introcduce 10 números:" );
		for (int i = 0; i < num.length; i++) {
            System.out.print("vector[" + i + "]= ");
			num[i] = sc.nextInt();
		}
		
		System.out.println(" Contenido de la tabla inverso");
		for (int i = num.length; i > 0; i--) {
			System.out.println(num[i]);
		}

        sc.close();
	}

}
