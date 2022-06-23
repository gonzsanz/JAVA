package Ejercicio03;

import java.io.Serializable;

public class Candidato implements Comparable<Candidato>, Serializable {

    static final long serialVersionUID = -6529915052786823465L;
    private String nombre;
    private int votos;

    Candidato(String nombre, int votos) {

        this.nombre = nombre;
        this.votos = votos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return this.votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public int compareTo(Candidato c) {
        return this.votos - c.getVotos();
    }

    @Override
    public String toString() {
        return getNombre() + ": " + getVotos() + " votos";
    }

}
