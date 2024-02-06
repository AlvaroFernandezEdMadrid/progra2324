package agenda;

import Libreria.Libreria;
import daw.com.Pantalla;
import daw.com.Teclado;


public class AppAgenda2 {
	private static final int SALIR = 8;
	
	private Agenda agenda;
	
	public AppAgenda2 ()
	{
		agenda = new Agenda ();
	}
	
	public AppAgenda2 (int cuantos)
	{
		agenda = new Agenda (cuantos);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc, cuantos;
		AppAgenda2 app;
		
		cuantos = Libreria.leerEnteroPositivo("Cuantos?");
		app = new AppAgenda2(cuantos);
		
		
		do
		{
			app.mostrarOpciones ();
			opc = Libreria.leerEntreLimites(1, SALIR, "Elija su opciÃ³n..");
			app.evaluarOpcion (opc);
		}while (opc != SALIR);
		
	}
	
	public void evaluarOpcion(int opc) {
		// TODO Auto-generated method stub
		switch (opc)
		{
		case 1:
			insertar ();
			break;
		case 2:
			existe ();
			break;
		case 3:
			listar ();
			break;
		case 4:
			buscar ();
			break;
		case 5:
			eliminar ();
			break;
		case 6:
			agendaLlena ();
			break;
		case 7:
			huecosLibres ();
			break;
		case 8:
			salir ();
			break;
		}
		
	}
	
	private void insertar() {
		// TODO Auto-generated method stub
		Contacto contacto;
		
		contacto = new Contacto();
		
		if (!agenda.agendaLlena())
		{
			contacto.leerClave();
			if (!agenda.existeContacto(contacto))
			{
				contacto.leerOtrosDatos();
				agenda.aniadirContacto(contacto);
				Pantalla.escribirString("\ncontacto aÃ±adido correctamente");
			}
			else
				Pantalla.escribirString("\ncontacto ya existe");
		}
		else
			Pantalla.escribirString("\nAgenda llena");
	}
	

	private void existe() {
		// TODO Auto-generated method stub
		Contacto contacto;
		
		
		contacto = new Contacto();
		contacto.leerClave();
		
		
		if (agenda.existeContacto(contacto))
			Pantalla.escribirString("\nContacto existe");
		else
			Pantalla.escribirString("\nContacto no existe");
		
	}
	
	private void listar() {
		// TODO Auto-generated method stub
		agenda.listarContactos();
	}
	
	private  void buscar() {
		// TODO Auto-generated method stub
		String nombre;
		
		nombre = Teclado.leerString("nombre ");
		
		agenda.buscaContacto(nombre);
		
		
	}
	private  void eliminar() {
		Contacto contacto;
		
		contacto = new Contacto ();
		contacto.leerClave();
		
		if (agenda.eliminarContacto(contacto))
			Pantalla.escribirString("\nContacto eliminado");
		else
			Pantalla.escribirString("\nContacto no existe");
		
	}
	

	private  void agendaLlena() {
		// TODO Auto-generated method stub
		if (agenda.agendaLlena())
			Pantalla.escribirString("\nLLena");
		else
			Pantalla.escribirString("\nNo llena");
	}
	
	private  void huecosLibres() {
		// TODO Auto-generated method stub
		
		Pantalla.escribirString("\nQuedan " +
				agenda.huecosLibres() + 
				" huecos libres");
	}
	
	private  void salir() {
		// TODO Auto-generated method stub
		Pantalla.escribirString("\nfin");
	}
	
	
	public  void mostrarOpciones() {
		// TODO Auto-generated method stub
		Pantalla.escribirString("\n1.Insertar");
		Pantalla.escribirString("\n2.Existe contacto");
		Pantalla.escribirString("\n3.Listar contactos");
		Pantalla.escribirString("\n4.Buscar contacto");
		Pantalla.escribirString("\n5.Eliminar contacto");
		Pantalla.escribirString("\n6.Agenda llena");
		Pantalla.escribirString("\n7.Huecos libres");
		Pantalla.escribirString("\n8.Salir");
	}
	

}