package exaClasObj;

import Libreria.Libreria;
import daw.com.Teclado;

public class Corredor {
	
	public final static boolean HOMBRE = false;
	public final static boolean MUJER = true;
	
	private String nombre;
	private String dni;
	private int edad;
	private boolean sexo;
	private int dorsal;
	private int segundos;
	
	
	public Corredor(String nombre, String dni, int edad, String sexo, int dorsal, int segundos) {
		this.nombre = nombre;
		this.dni = dni;
		setEdad(edad);
		setSexo(sexo);
		setDorsal(dorsal);
		setSegundos(segundos);
	}


	public Corredor(String dni) {
		this("",dni,18,"h",0,0);
	}
	
	public Corredor() {
		this("");
	}

	public Corredor(Corredor og) {
		this.nombre=og.nombre;
		this.dni=og.dni;
		this.edad=og.edad;
		this.sexo=og.sexo;
		this.dorsal=og.dorsal;
		this.segundos=og.segundos;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		if (edad<=0) {
			edad=1;
		}
		this.edad = edad;
	}


	public boolean getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		if (sexo.equalsIgnoreCase("H"))
			this.sexo = HOMBRE;
		else
			this.sexo = MUJER;
	}


	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		if (dorsal<0) {
			dorsal=0;
		}
		this.dorsal = dorsal;
	}


	public int getSegundos() {
		return segundos;
	}


	public void setSegundos(int segundos) {
		if (segundos<0) {
			segundos=0;
		}
		this.segundos = segundos;
	}


	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", dorsal="
				+ dorsal + ", segundos=" + segundos + "]";
	}

	public boolean equals(Corredor otro) {
		
		return otro!=null&&otro.dni.equalsIgnoreCase(dni);
	}
	
	public void leerDatos() {
		leerClave();
		leerOtrosDatos();	
	}


	public void leerOtrosDatos() {
		
		edad=Libreria.leerEnteroPositivo("Segundos: ");
		
		sexo=Teclado.leerString("Sexo H/M").equalsIgnoreCase("h")?HOMBRE:MUJER;
		
		dorsal=Libreria.leerEnteroPositivo("Dorsal: ");
		
		segundos=Libreria.leerEnteroPositivo("Segundos: ");
	}


	public void leerClave() {
		dni=Teclado.leerString();
	}
	
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
}
