package teatro;

import Libreria.Libreria;
import daw.com.Pantalla;

public class AppTeatros {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teatro teatros[];
		Funcion funciones[];
		int nTeatros, nFunciones;
		//Direccion direccion;
		Funcion masCara;
		
		nTeatros = Libreria.leerEnteroPositivo("\nnº de teatros");
		nFunciones = Libreria.leerEnteroPositivo("\nnº de funciones");

		teatros = new Teatro[nTeatros];
		funciones = new Funcion[nFunciones];
		
		leerFunciones (funciones);
		
		leerTeatros (teatros, funciones);
		
		for (Teatro t: teatros)
			t.mostrarDatos();
		
		// Si se cambia algo en una funcion 
		// se cambia en todos los teatros
		funciones[3].setNombre("cambiada");
		funciones[3].setPrecio(40000);
		
		Pantalla.escribirString("\nDespues de cambiar una funcion");
		for (Teatro t: teatros)
			t.mostrarDatos();
		
		
		// Si se cambia algo de direccion
		// no se cambia en el teatro
		/*
		 * direccion = new Direccion ();
		direccion.leerDatos();
		teatros[0].setDireccion(direccion);
		teatros[0].mostrarDatos();
		direccion.setCodigoPostal("28030");
		Pantalla.escribirString("\nDespues de cambiar direccion");
		teatros[0].mostrarDatos();
		*/
		
		//Buscar la funcion mas cara.
		masCara=funciones[0];
		
		for (int i = 0; i < funciones.length; i++) {
			if (funciones[i].getPrecio()>masCara.getPrecio()) {
				masCara=funciones[i];
			}
		}
		
		System.out.println("La funcion mas cara es: "+masCara);
		
	}

	

	private static void leerTeatros(Teatro[] teatros, Funcion[] funciones) {
		// TODO Auto-generated method stub
		Teatro teatro;
		
		for (int i = 0; i < teatros.length; i++)
		{
			teatro = new Teatro ();
			do
			{
				teatro.leerClave();
			}while (existeTeatro (teatro, teatros));
			
			teatro.leerOtrosDatos();
			
			asignarFunciones (teatro, funciones);
			
			teatros[i] = teatro;
		}
	}

	private static void asignarFunciones(Teatro teatro, Funcion[] funciones) {
		// TODO Auto-generated method stub
		int cual;
		for (int i = 0; i < teatro.getFunciones().length; i++) 
		{
			for (Funcion f: funciones)
				Pantalla.escribirString("\n"+ f.getNombre());
			
			cual = Libreria.leerEntreLimites(1, funciones.length, "\nElija una funciÃ³n");
			
			teatro.setFuncion(i, funciones[cual-1]);
			
		}
		
	}

	private static boolean existeTeatro(Teatro teatro, Teatro[] teatros) {
		// TODO Auto-generated method stub
		boolean existe = false;
		
		for (int i = 0; i < teatros.length && !existe; i++)
		{
			existe = teatro.equals(teatros[i]);
		}
		
		return existe;
	}

	public static void leerFunciones(Funcion[] funciones) {
		// TODO Auto-generated method stub
		Funcion funcion;
		
		
		for (int i = 0; i < funciones.length; i++)
		{
			funcion = new Funcion ();
			do
			{
				funcion.leerClave();
			}while (existeFuncion (funcion,funciones));
			
			funcion.leerRestoDatos();
			
			funciones[i] = funcion;
		}
	}

	private static boolean existeFuncion(Funcion funcion, Funcion[] funciones) {
		// TODO Auto-generated method stub
		boolean existe = false;
		
		for (int i = 0; i < funciones.length && !existe; i++)
		{
			existe = funcion.equals(funciones[i]);
		}
		
		return existe;
	}


}