package Pizzeria;

public class Pizza {

    private TamañoPizza tamaño;
    private TipoPizza tipo;
    private EstadoPizza estado;

    static int totalpizzaspedidas = 0;
    static int totalpizzasservidas = 0;

    public Pizza(TipoPizza tipo, TamañoPizza tamaño) {

        this.tamaño = tamaño;
        this.tipo = tipo;
        estado = EstadoPizza.PEDIDA;
        totalpizzaspedidas++;
    }

    public void sirve() {

        estado = EstadoPizza.ENTREGADA;
        totalpizzasservidas++;
    }

    public String toString() {

        return "Tipo: " + tipo +
                "\nTamaño: " + tamaño +
                "\nEstado: " + estado +
                "\n---------------------";
    }

    public static int getTotalPedidas() {

        return totalpizzaspedidas;
    }

    public static int getTotalServidas() {

        return totalpizzasservidas;
    }
}