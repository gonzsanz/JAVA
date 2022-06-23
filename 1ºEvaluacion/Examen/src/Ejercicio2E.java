import java.util.Arrays;

public class Ejercicio2E {
	
	public static void main(String args[]) {
		int t[] = {5,10,34,23};
		System.out.println(Arrays.toString(dameDivEntre5(t)));
	}

	static int[] dameDivEntre5 (int valores[]) {
		int nums[] = new int[valores.length];
		
		for (int i=0; i<valores.length; i++) {
			if (valores[i] % 5 == 0) {
				nums[i] = valores[i];
			}
		}
		return nums;
	}
}
