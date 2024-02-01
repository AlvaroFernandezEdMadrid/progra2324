package agenda;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Contacto {
	private String nombre;
	private String telefono;
	
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Contacto (String nombre)
	{
		this (nombre,"");
	}
	
	public Contacto ()
	{
		this("");
	}
	
	public Contacto (Contacto original)
	{
		this (original.nombre, original.telefono);
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void mostrarDatos ()
	{
		Pantalla.escribirString("\n" + toString());
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	public boolean equals(Contacto otro) 
	{
		
		return 	otro != null &&
				otro.nombre.equals(nombre);
	}
	
	public void leerDatos ()
	{
		leerClave ();
		
		leerOtrosDatos ();
	}

	public void leerOtrosDatos() {
		// TODO Auto-generated method stub
		telefono = Teclado.leerString("telefono");
	}

	public void leerClave() {
		// TODO Auto-generated method stub
		nombre = Teclado.leerString("nombre");
	}
	

}