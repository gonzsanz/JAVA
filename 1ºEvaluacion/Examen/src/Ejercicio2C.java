

public class Ejercicio2C {

	
	static int[] coordMax (int matriz[][]) {
		int max = matriz[0][0]; 
		int imax = 0; 
		int jmax =0;
		int t[] = new int[2];
	     for (int i=0;i<matriz.length; i++){
	    	 for (int j =0; j<matriz[i].length; j++){
	    		 if ( matriz[i][j] > max){
	    			 max = matriz[i][j];
	    			 imax = i;
	    			 jmax = j;
	    		 }
	    	}
	    }
		
	     t[0] = imax;
	     t[1] = jmax;
	     
	  
	     return t;
	}

}
