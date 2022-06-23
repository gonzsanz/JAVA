import java.io.Serializable;

public class Candidato implements Serializable, Comparable<Candidato> {
    static final long serialVersionUID = -6529915052786823465L;
    String nombre;
    int votos;

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                        ", votos=" + votos;
    }

    @Override
    public int compareTo(Candidato o) {
        return this.votos-o.votos;
    }
}