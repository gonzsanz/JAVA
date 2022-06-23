import java.util.Arrays;
public class Ejercicio06 {

	public static void main(String[] args) {
		
		int mitabla[] = {10,3,0,1,4,0,0,9,32,0}; 
		
		Arrays.sort(mitabla);
		
		for (int i=mitabla.length; i>0; i--) {
			System.out.print(mitabla[i] + " ");
		}
		
	}
	
}
