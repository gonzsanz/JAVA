
public class Ejercicio04 {

    public static repartirLista (Lista milista, Lista listapares, Lista listaimpares){


        for (int i = 0; i<milista; i++){
            if (milista.num(i) % 2 == 0){
                listapares += milista.num(i);
            } else{
                listaimpares += milista.num(i);
            }
        }
    }
}
