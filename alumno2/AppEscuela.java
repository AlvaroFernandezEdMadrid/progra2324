package alumno2;

import Libreria.Libreria;
import daw.com.Pantalla;
import daw.com.Teclado;

public class AppEscuela {

	private Escuela escuela;
	
	public AppEscuela ()
	{
		escuela = new Escuela ();
	}
	
	public AppEscuela (int cuantos)
	{
		escuela = new Escuela (cuantos);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cuantos;
		AppEscuela app;
		
		cuantos = Libreria.leerEnteroPositivo("¿Cuantos grupos hay?");
		
		app = new AppEscuela (cuantos);
		
		app.cargarDatos ();
		
		app.menu ();
		
	}

	private void menu() {
		// TODO Auto-generated method stub
		int opc;
		final int SALIR = 6;
		
		do
		{
			mostrarOpciones ();
			opc = Libreria.leerEntreLimites(1, SALIR, "\nelija una opcion");
			evaluarOpcion (opc);
			
		}while (opc != SALIR);
		
	}

	private void evaluarOpcion(int opc) {
		// TODO Auto-generated method stub
		switch (opc)
		{
			case 1:
				listarAlumnos ();
				break;
			case 2:
				addAlumno ();
				break;
			case 3:
				removeAlumno();
				break;
			case 4:
				buscarGruposReducidos ();
				break;
			case 5:
				alumnosEnAsignatura();
				break;
			case 6:
				salir();
				break;
		}
		
	}

	private void alumnosEnAsignatura() {
		String asig;
		int cont=0;
		
		asig=Teclado.leerString("Asignatura: ");
		
		for (int i = 0; i < escuela.getGrupos().length; i++) {
			for (int j = 0; j < escuela.getGrupos()[i].getNAlumnos(); j++) {
				if (escuela.getGrupos()[i].getAlumno(j).buscarAsignatura(asig)!=-1) {
					cont++;
				}
			}
		}
		
		System.out.println("En la asignatura "+ asig + " hay " + cont + " alumnos.");
		
	}

	private void removeAlumno() {
		String nombreAl;
		
		nombreAl=Teclado.leerString("NIA del alumno a eliminar: ");
		
		if (escuela.removeAlumno(nombreAl)) {
			System.out.println("Alumno eliminado correctamente.");
		}else {
			System.out.println("No se ha podido eliminar al alumno.");
		}
	}

	private void salir() {
		// TODO Auto-generated method stub
		String tutores[];
		
		tutores = escuela.listaTutores();
		if (tutores != null)
			for(String t : tutores)
				if (t != null)
					Pantalla.escribirString("\n" + t);
		
	}

	private void buscarGruposReducidos() {
		// TODO Auto-generated method stub
		for (Grupo g : escuela.getGrupos())
			if (g != null)
				if (g.getNAlumnos() <= 7)
					Pantalla.escribirString("\n" + g.getNombre());
		
	}

	private void addAlumno() {
		// TODO Auto-generated method stub
		Alumno a;
		String nombreGrupo;
		
		nombreGrupo = Teclado.leerString("grupo");
		
		if (escuela.buscarGrupo(nombreGrupo) != null)
		{
			a =  new Alumno ();
			a.leerDatosNia();
			if (escuela.buscarGrupoAlumno(a)  == -1)
			{
				a.leerOtrosDatos();
				escuela.addAlumnoEnGrupo(a, nombreGrupo);
				Pantalla.escribirString("\nAlumno insertado correctamente");
			}
			else
				Pantalla.escribirString("\nEl alumno ya existe");
			
		}
		else
			Pantalla.escribirString("\nNo exsite el grupo");
		
		
		
	}

	private void listarAlumnos() {
		// TODO Auto-generated method stub
		String nombreGrupo;
		Alumno alumnos[];
		
		nombreGrupo = Teclado.leerString("\nNombre del grupo");
		
		alumnos = escuela.listarAlumnosGrupo(nombreGrupo);
		
		if (alumnos !=  null)
			for (Alumno a: alumnos)
				Pantalla.escribirString("\n" + a.getNombre() + "->" + a.getMedia());
		else
			Pantalla.escribirString("\nEl grupo no existe o no tiene alumnos");
		
	}

	private void mostrarOpciones() {
		// TODO Auto-generated method stub
		Pantalla.escribirString("\n1.Listar alumnos de un grupo");
		Pantalla.escribirString("\n2.AÃ±adir alumno");
		Pantalla.escribirString("\n3.Dar baja alumno");
		Pantalla.escribirString("\n4.Buscar grupo pequeÃ±o");
		Pantalla.escribirString("\n5.Mostrar total alumnos matriculados de una asignatura");
		Pantalla.escribirString("\n6.Salir");
		
	}

	private void cargarDatos() {
		// TODO Auto-generated method stub
		Grupo g;
		
		for (int i = 0; i < escuela.getGrupos().length; i++)
		{
			g = new Grupo ();
			do {
				g.leerNombre();
			}while (escuela.buscarGrupo(g.getNombre()) != null);
			g.leerOtrosDatos();
			// cuidado alumnos sin leer
			leerAlumnos (g);
			escuela.getGrupos()[i] = g;// agregaciÃ³n
		}
		
	}

	private void leerAlumnos(Grupo g) {
		// TODO Auto-generated method stub
		int cuantos = g.getNAlumnos();
		Alumno a;
		
		for (int i = 0; i < cuantos; i++)
		{
			a = new Alumno ();
			do
			{
				a.leerDatosNia();
			}while (escuela.buscarGrupoAlumno(a)!= -1);
			a.leerOtrosDatos();
			g.addAlumno(a);
		}
	}

}