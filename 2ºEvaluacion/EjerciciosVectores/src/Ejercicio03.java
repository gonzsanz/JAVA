import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int [10];
		
		System.out.println(" Introcduce 10 números:" );
		for (int i = 0; i < num.length; i++) {
            System.out.print("vector[" + i + "]= ");
			num[i] = sc.nextInt();
			
			if (num[i] % 2 == 0) System.out.println(num[i]);
		}
		
		sc.close();
	}

}
