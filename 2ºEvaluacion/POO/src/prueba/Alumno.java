package prueba;

public class Alumno {

	private int matricula;
	String nombre;
	private float nota;
	
	
	public Alumno (String nombre) {
		this.nombre	= nombre;
		this.nota = 1f;
		this.matricula = (int) (Math.random()*1000+1);
	}
	
	
	public boolean igual (Alumno otro) {
		if (this.nota == otro.nota)
			return true;
		else 
			return false;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

}
