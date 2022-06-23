package Ejercicio03;

import java.util.Random;

public class Cine {

    private int filas;
    private int columnas;
    private Espectador asientos[][];
    private float precio;
    private Pelicula pelicula;
    private int numEspectadores;

    public Cine(int filas, int columnas, Pelicula pelicula, float precio) {

        this.filas = filas;
        this.columnas = columnas;
        this.pelicula = pelicula;
        this.precio = precio;
        asientos = new Espectador[filas][columnas];
        numEspectadores = 0;
    }

    public String venderAsiento(Espectador esp) {
        Random rd = new Random();
        String msg = "";
        if (esp.getDinero() < precio) {
            msg = "Lo sentimos " + esp.getNombre() + ", no tiene suficiente dinero";
            return msg;
        }
        if (numEspectadores < filas * columnas) {
            boolean asignado = false;
            do {
                int posFila = rd.nextInt(filas);
                int posColumna = rd.nextInt(columnas);
                if (asientos[posFila][posColumna] == null) {
                    asignado = true;
                    asientos[posFila][posColumna] = esp;
                    esp.setDinero(esp.getDinero() - precio);
                    msg = "Su butaca es: " + (posFila + 1) + ('A' + posColumna);
                } else {
                    msg = "No hay asientos libres";
                }
            } while (asignado == false);

        }

        return msg;
    }

    public void informeSala() {

    }

    public int recaudacion() {

        return numEspectadores;
    }

}
