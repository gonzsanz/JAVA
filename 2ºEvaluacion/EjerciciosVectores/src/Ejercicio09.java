import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[10];
		
		for (int i=0; i<tabla.length;i++) {
			System.out.print("valor vector " + i + " = ");
			tabla[i] = sc.nextInt();
			
		}
		
		System.out.println(EstaOrdenada(tabla));
		
		sc.close();
	}
	
	private static boolean EstaOrdenada(int[] tabla) {
		
		boolean resu = true;
		
		for (int i = 0; i<tabla.length-1; i++) {
			if (tabla[i] > tabla[i+1]) {
				resu = false;
			}
		}
		return resu;
	}

}
