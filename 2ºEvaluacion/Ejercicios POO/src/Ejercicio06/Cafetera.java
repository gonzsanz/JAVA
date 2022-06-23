package Ejercicio06;

public class Cafetera {

    protected int capacidadMax;
    protected int cantidadActual;

    public Cafetera() {

        this.capacidadMax = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int max) {

        this.cantidadActual = max;
        this.capacidadMax = max;
    }

    public Cafetera(int max, int actual) {

        capacidadMax = max;
        cantidadActual  = actual;
        if (cantidadActual > capacidadMax) {
            cantidadActual = capacidadMax;
        }
    }

    public void llenarCafetera() {

        cantidadActual = capacidadMax;
    }

    public void llenarTaza(int cantidad) {

        if (cantidadActual < cantidad) {
            cantidad = cantidadActual;
            cantidadActual = 0;
        } else {
            cantidadActual -= cantidad;
        }
    }

    public void vaciarCafetera() {

        cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {

        if (cantidad>capacidadMax){
            cantidadActual = capacidadMax;
        } else 
        cantidadActual = cantidad;
    }

}
