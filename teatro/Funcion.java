package teatro;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Funcion {
	private static final float PRECIOMINIMO = 1;
	private String nombre;
	private float precio;
	
	public Funcion(String nombre, float precio) {

		this.nombre = nombre;
		setPrecio  (precio);
	}
	
	public Funcion ()
	{
		this ("",0);
	}
	
	public Funcion (Funcion original)
	{
		this (original.nombre, original.precio);
	}

	public Funcion (String nombre)
	{
		this (nombre,0);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if (precio < PRECIOMINIMO)
			precio = PRECIOMINIMO;
		
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Funcion [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public boolean equals (Funcion otra)
	{
		
		return otra != null  && 
				nombre.equalsIgnoreCase(otra.nombre);
	}
	
	public void leerDatos ()
	{
		leerClave ();
		leerRestoDatos ();
	}

	public void leerRestoDatos() {
		// TODO Auto-generated method stub
		do
		{
			precio = Teclado.leerFloat("\nPrecio FunciÃ³n ");
		}while (precio < PRECIOMINIMO);
	}

	public void leerClave() {
		// TODO Auto-generated method stub
		nombre = Teclado.leerString("\nNombre FunciÃ³n");
	}
	
	public void mostrarDatos ()
	{
		Pantalla.escribirString("\nnombre funciÃ³n: "+ nombre);
		Pantalla.escribirString("\nprecio funciÃ³n: " + precio );
	}
}