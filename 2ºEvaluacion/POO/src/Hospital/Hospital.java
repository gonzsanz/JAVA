package Hospital;

import java.util.*;

public class Hospital {
    private Paciente tpacientes[]; // Al inicio todas las posiciones son igual a null
    private int contadorpacientes;

    public Hospital(int numpacientes) {
        tpacientes = new Paciente[numpacientes];
        contadorpacientes = 0;
    }

    /**
     * @param p
     * @return boolean
     */
    // Ingreso de un paciente al hospital, devuelve false si no cabe
    public boolean ingreso(Paciente p) {

        if (contadorpacientes < tpacientes.length) {

            for (int i = 0; i < tpacientes.length; i++) {
                if (tpacientes[i] == null) {
                    tpacientes[i] = p;
                    contadorpacientes++;
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * @param id_paciente
     * @return boolean
     */
    // Alta del paciente - se borra de la tabla, su posición se pone a null
    // Devuelve false si no se encuentra
    public boolean alta(int id_paciente) {

        boolean resu = false;

        for (int i = 0; i < contadorpacientes; i++) {
            if (tpacientes[i].getId() == id_paciente) {
                tpacientes[i] = null;
                resu = true;
            }
        }
        for (int i = 0; i < contadorpacientes; i++) {
            if (tpacientes[i] == null)
                tpacientes[i] = tpacientes[i + 1];
        }
        return resu;
    }

    /**
     * @param id
     * @return Paciente
     */
    // Devuelve el paciente con el identidador indicado o null si no existe
    public Paciente buscar(int id) {

        Paciente p = null;
        for (int i = 0; i < contadorpacientes; i++) {
            if (tpacientes[i] != null && tpacientes[i].getId() == id) {
                p = tpacientes[i];
                break;
            }
        }
        return p;
    }

    // Imprime por consola la lista ORDENADO por NOMBRE de pacientes ***

    public void listapacientes() {

        Arrays.sort(tpacientes, 0, contadorpacientes, new OrderbyName());
        for (int i = 0; i < contadorpacientes; i++) {
            System.out.println(tpacientes[i]);
        }

    }

    // Devuelve el mas grave o el caso de paciente con la misma gravedad el
    // que su identificador sea mas bajo.
    public Paciente pacienteMasUrgente() {

        if (contadorpacientes == 0) {
            return null;
        }
        PacienteGrave maxg = null;

        // Buscar si hay paciente con gravedad
        for (int i = 0; i < contadorpacientes; i++) {
            Paciente p = tpacientes[i];
            if (p instanceof PacienteGrave) {
                PacienteGrave aux = (PacienteGrave) p;
                if (maxg != null) {
                    // Comparar con el paciente grave maximo
                    if (aux.getGravedad().ordinal() > maxg.getGravedad().ordinal()) {
                        aux = maxg;
                    } else if (aux.getGravedad() == maxg.getGravedad() && aux.getId() < maxg.getId()) {
                        maxg = aux;
                    }
                } else {
                    // No hay ningun maximo con gravedad provisional
                    maxg = aux;
                }
            }
        }
        // Si es null es que no hay paciente con gravedad
        // Devuelvo el primero, sino devuelvo el paciente con gravedad nmaxima
        if (maxg == null) {
            return tpacientes[0];
        } else {
            return maxg;
        }
    }

}
