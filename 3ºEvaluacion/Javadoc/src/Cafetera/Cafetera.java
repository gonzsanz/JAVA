package Cafetera;

/**
 * Clase Cafetera
 * 
 * Esta clase simula una <b>cafetera</b>
 * 
 * @author David
 * @version 18/03/2022
 */

public class Cafetera implements Comparable<Cafetera> {

    /**
     * Capacidad máxima de la cafetera
     */
    private int capacidadMaxima;
    /**
     * Capacidad actual de la cafetera
     */
    private int capacidadActual;

    /**
     * Constructor con 2 parametros
     * 
     * @param capacidadMaxima capacidad maxinma de la cafetera
     * @param cantidad        cantidad con la que se inicia la cafetera
     */
    Cafetera(int capacidadMaxima, int cantidad) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = (capacidadMaxima > cantidad) ? cantidad : capacidadMaxima;
    }

    /**
     * Constructor que establece por defecto las cafeteras a una capacidad de 1000 y
     * vacias
     */
    Cafetera() {
        this(1000, 0);
    }

    /**
     * Constructor que establece a las cafeteras una capacidad maxima pasada por un
     * parametro y las deja vacias
     * 
     * @param valor Capacidad maxima de la cafetera
     */
    Cafetera(int valor) {
        this(valor, 0);
    }

    /**
     * Devuelve la capacidad maxima de la cafetera
     * 
     * @return capacidad maxima de la cafetera
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Devuelve la capacidad actual de la cafetera
     * 
     * @return capacidad actual de la cafetera
     */
    public int getCapacidadActual() {
        return capacidadActual;
    }

    /**
     * Llena la cafetera al maximo de su capacidad
     */
    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;
    }

    /**
     * Deja la cafetera vacia, a 0
     */
    public void vaciarCafetera() {
        capacidadActual = 0;
    }

    /**
     * Sirve una taza
     * 
     * @param vtaza Es el tamaño de la taza
     */
    public void servirTaza(int vtaza) {
        capacidadActual -= vtaza;
        if (capacidadActual < 0)
            capacidadActual = 0;
    }

    /**
     * Agrega cafe a la cafetera y la llena
     * 
     * @param vcafe Es la cantidad de café que se le agrega a la cafeteras
     */
    public void agregarCafe(int vcafe) {
        capacidadActual += vcafe;
        if (capacidadActual > capacidadMaxima)
            capacidadActual = capacidadMaxima;
    }

    // Método para ordenar cafeteras por capacidad Actual
    /**
     * Ordena las cafeteras por capacidad actual
     * 
     * @param o Es un objeto de la clase cafetera
     * @return Las cafeteras ordenadas
     */
    public int compareTo(Cafetera o) {
        return this.capacidadActual - o.capacidadActual;
    }

}
