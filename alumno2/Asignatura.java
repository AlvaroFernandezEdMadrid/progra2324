package alumno2;

import Libreria.Libreria;
import daw.com.Teclado;

public class Asignatura {
	private static final int MINNOTA=1;
	private static final int MAXNOTA=10;
	private static final int MINCONV=1;
	private static final int MAXCONV=4;
	private String nombre;
	private float nota;
	private int convocatoria;
	
	public Asignatura(String nombre, float nota, int convocatoria) {
		this.nombre = nombre;
		setNota(nota);
		setConvocatoria(convocatoria);
	}

	public Asignatura(String nombre) {
		this(nombre,MINNOTA,MINCONV);
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
		if (nota<MINNOTA) {
			nota=MINNOTA;
		}else if (nota>MAXNOTA) {
			nota=MAXNOTA;
		}
		
		this.nota = nota;
	}

	public int getConvocatoria() {
		return convocatoria;
	}

	public void setConvocatoria(int convocatoria) {
		if (convocatoria<MINCONV) {
			convocatoria=MINCONV;
		}else if (convocatoria>MAXCONV) {
			convocatoria=MAXCONV;
		}
		this.convocatoria = convocatoria;
	}

	public void leerDatos() {
		leerNombre();
		leerOtrosDatos();
	}
	
	public void leerOtrosDatos() {
		nota=Libreria.leerEntreLimites(MINNOTA, MAXNOTA, "Nota: ");
		convocatoria=Libreria.leerEntreLimites(MAXCONV, MAXCONV, "Convocatoria: ");
	}

	public void leerNombre() {
		nombre=Teclado.leerString("Nombre: ");
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre +
				", nota=" + nota +
				", convocatoria=" + convocatoria + "]";
	}

	public boolean equals(Asignatura otro) {
		return otro!=null&&
				otro.getNombre()!=null&&
				otro.getNombre().equalsIgnoreCase(nombre);
	}
	
	public void mostrarDatos ()
	{
		System.out.println("\n" + toString());
	}
	
	public boolean estaAprobada() {
		return nota>=5;
	}
}
