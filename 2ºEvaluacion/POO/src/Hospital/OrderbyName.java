package Hospital;

import java.util.Comparator;

public class OrderbyName implements Comparator<Paciente> {

    @Override
    public int compare(Paciente o1, Paciente o2) {

    	Paciente p1 = o1;
    	Paciente p2 = o2;
        return p1.getName().compareTo(p2.getName());
    }

}
