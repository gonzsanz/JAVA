package Ejercicio02;

public class Libro {

    private String titulo;
    private boolean estado;
    private int prestado;

    public Libro(String titulo) {

        this.titulo = titulo;
    }

    public void prestar() {

        estado = false;
        prestado++;
    }

    public void devolver() {

        estado = true;
    }

    public String toString() {

        if (estado){
            return "El libro " + titulo + "está prestado." + " Veces prestado: " + prestado;
        } else {
            return "El libro " + titulo + "está disponible." + " Veces prestado: " + prestado;
        }
    }

}
