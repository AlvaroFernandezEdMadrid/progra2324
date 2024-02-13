package alumno2;

import java.util.Arrays;

import Libreria.Libreria;
import daw.com.Teclado;

public class Escuela {
	private String nombre;
	private int cuantos;
	private Grupo[] grupos;
	
	public Escuela(String nombre, int cuantos, Grupo[] grupos) {
		this.nombre = nombre;
		setCuantos(cuantos);
		setGrupos(grupos);
	}
	
	public Escuela (String nombre) {
		this(nombre,0,null);
	}
	
	public Escuela() {
		this("");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCuantos() {
		return cuantos;
	}
	
	public void setCuantos(int cuantos) {
		if (cuantos<0) {
			cuantos=0;
		}
		this.cuantos=cuantos;
	}

	public Grupo[] getGrupos() {
		return grupos;
	}
	
	public void setGrupos(Grupo[] grupos) {
		this.grupos = grupos;
	}
	
	public Grupo getGrupo(int cual) {
		return grupos[cual];
	}
	
	public void setGrupo(Grupo grupo, int donde) {
		grupos[donde]=grupo;
	}

	public int buscarGrupo(Grupo grupoABuscar) {
		int pos=-1;
		
		for (int i = 0; i < grupos.length; i++) {
			if (grupoABuscar.getNombre().equalsIgnoreCase(grupos[i].getNombre())) {
				pos=i;
			}
		}
		
		return pos;
	}
	
	public int buscarHueco() {
		int donde=-1;
		
		for (int i = 0; i < grupos.length&&donde==-1; i++) {
			if (grupos[i]==null) {
				donde=i;
			}
		}
		
		return donde;
	}
	
	public boolean addGrupo(Grupo grupoAnadir) {
		boolean exito=false;
		
		int donde=buscarHueco();
		
		if (buscarGrupo(grupoAnadir)!=-1&&donde!=-1) {
			grupos[donde]=grupoAnadir;
			exito=true;
		}
		
		return exito;
	}
	
	public void leerDatos() {
		leerClave();
		inicializar();
		leerGrupos();
		leerAlumnos();
	}

	private void leerAlumnos() {
		Alumno nuevo;
		
		nuevo=new Alumno();
		
		for (int i = 0; i < grupos.length; i++) {
			for (int j = 0; j < grupos[i].getNAlumnos(); j++) {
				do {
					nuevo.leerDatos();
				} while (grupos[i].buscarAlumno(nuevo)!=-1);
				grupos[i].addAlumno(nuevo);
			}
		}
	}

	private void inicializar() {
		cuantos=Libreria.leerEnteroPositivo("Cuantos grupos: ");
		grupos=new Grupo[cuantos];
		for (int i = 0; i < grupos.length; i++) {
			grupos[i]=new Grupo();
		}
	}

	public void leerClave() {	
		nombre=Teclado.leerString("Nombre de la escuela: ");
	}

	public void leerGrupos() {
		for (int i = 0; i < grupos.length; i++) {
			grupos[i].leerDatos();
		}
	}
	
	public boolean anadirAlumnoEnGrupo(Alumno a, String nombreGrupo) {
		boolean exito=false;
		
		int g=buscarGrupo(new Grupo(nombreGrupo));

		grupos[g].addAlumno(a);
		
		return exito;
	}
	
	public void mostrarDatos() {
		System.out.println("Escuela [nombre=" + nombre + ", cuantos=" + cuantos + ", grupos=" + Arrays.toString(grupos) + "]");
	}
}
