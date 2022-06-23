import java.util.*;
public class Ejercicio01 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int nums[] = new int[30];
			
			//a)
			for (int i=0; i<nums.length; i++) {
				nums[i] = (int) Math.floor(Math.random()*(100-1000+1)+1000);
			}
			System.out.println("Array sin ordenar" + Arrays.toString(nums));
			
			//b)
			Arrays.sort(nums);
			System.out.println("Array ordenado" + Arrays.toString(nums));

			
			//c)
			System.out.print("Introduzca el valor que quiere buscar:");
			int valor = sc.nextInt();
			boolean resu = false;
			
			for (int j=0; j<nums.length; j++) {
				if (valor == nums[j]) {
					resu = true;
				}
			}
			
			System.out.println("¿Aparece el valor? " + resu);
		}
	}
}
