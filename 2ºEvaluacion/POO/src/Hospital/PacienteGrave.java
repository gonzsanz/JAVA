package Hospital;

public class PacienteGrave extends Paciente {



    private TipoGravedad gravedad;

    public PacienteGrave(String nombre, TipoGravedad gravedad) {
        super(nombre);
        this.gravedad = gravedad;
    }

    public String toString() {
        return super.toString() + " :" + gravedad;
    }
    public TipoGravedad getGravedad() {
        return gravedad;
    }
}