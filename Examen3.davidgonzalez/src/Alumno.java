import java.io.Serializable;

public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    String nombre;
    int ev1;
    int ev2;
    int ev3;

    Alumno(String nombre, int n1, int n2, int n3) {
        this.nombre = nombre;
        this.ev1 = n1;
        this.ev2 = n2;
        this.ev3 = n3;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEv1() {
        return this.ev1;
    }

    public void setEv1(int ev1) {
        this.ev1 = ev1;
    }

    public int getEv2() {
        return this.ev2;
    }

    public void setEv2(int ev2) {
        this.ev2 = ev2;
    }

    public int getEv3() {
        return this.ev3;
    }

    public void setEv3(int ev3) {
        this.ev3 = ev3;
    }

    public String toString() {

        return this.nombre;
    }

}
