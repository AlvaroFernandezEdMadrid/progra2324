package oop.Punto;

import daw.com.Teclado;

public class Punto {
	private int x;
	private int y;
	private String nombre;
	
	
	public Punto() {
		this.x=0;
		this.y=0;
		this.nombre="";
	}

	public Punto(int x, int y, String nombre) {
		this.x = x;
		this.y = y;
		this.nombre = nombre;
	}
	
	public Punto(String nom) {
		this.x=0;
		this.y=0;
		this.setNombre(nom);
	}
	
	public Punto(Punto og) {
		this.x=og.x;
		this.y=og.y;
		this.nombre=og.nombre;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (this.nombre==null) {
			nombre="";
		}
		this.nombre = nombre;
	}

	public boolean isOrigen() {
		return x==0&&y==0;
	}
	
	public float getDistancia() {
		
		return (float) Math.sqrt((x*x)+(y*y));
	}
	
	@Override
	public String toString() {
		return "Punto "+nombre+" esta en x:"+x+", y:"+y;
	}
	
	public void leerDatos() {
		x=Teclado.leerInt("X= ");
		y=Teclado.leerInt("Y= ");
		setNombre(Teclado.leerString("Nombre: "));
	}
	
}
