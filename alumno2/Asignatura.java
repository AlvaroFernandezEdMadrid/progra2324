package alumno2;

public class Asignatura {
	private String nombre;
	private float nota;
	private int convocatoria;
	
	
	public Asignatura(String nombre, float nota, int convocatoria) {
		this.nombre = nombre;
		setNota(nota);
		setConvocatoria(convocatoria);
	}

	public Asignatura(String nombre) {
		this(nombre,1f,1);
	}
	
	public Asignatura() {
		this("");
	}
	
	public Asignatura(Asignatura og) {
		this.nombre=og.nombre;
		this.nota=og.nota;
		this.convocatoria=og.convocatoria;
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
		if (nota<=0) {
			nota=1f;
		}
		
		if (nota>10) {
			nota=10f;
		}
		
		this.nota = nota;
	}

	public int getConvocatoria() {
		return convocatoria;
	}

	public void setConvocatoria(int convocatoria) {
		if (convocatoria<1||convocatoria>4) {
			convocatoria=1;
		}
		this.convocatoria = convocatoria;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + ", convocatoria=" + convocatoria + "]";
	}

	public boolean equals(Asignatura otro) {
		return this.nombre.equalsIgnoreCase(otro.nombre);
	}
	
	
}
