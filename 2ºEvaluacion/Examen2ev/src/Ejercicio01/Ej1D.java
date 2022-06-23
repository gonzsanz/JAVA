package Ejercicio01;


public class Ej1D {
    
    public static boolean  estaIncluido(int ta[], int tb[]){

        if (ta.length < tb.length){

            for (int i=0; i<ta.length; i++){
                boolean esta = false;
                for (int j=0; j<tb.length;j++){
                    if (ta[i] == tb[j]){
                        esta = true;
                        break;
                    }
                }
                if (!esta){
                    return false;
                }
            }
        }
        return true;
    }
}
