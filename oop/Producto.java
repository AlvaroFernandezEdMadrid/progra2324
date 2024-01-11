package oop;

import daw.com.Teclado;

public class Producto {
	private String nombre;
	private float pvp;
	private int stock;
	private boolean perecedero;
	
	public Producto() {
		this.nombre="";
		this.pvp=0.01f;
		this.stock=0;
		this.perecedero=false;
	}

	public Producto(String nombre, float pvp, int stock, boolean perecedero) {
		this.setNombre(nombre);
		this.setPvp(pvp);
		this.setStock(stock);
		this.perecedero=false;
	}

	public Producto(String nombre) {
		this.setNombre(nombre);
		this.pvp=0.01f;
		this.stock=0;
		this.perecedero=false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre==null) {
			nombre="";
		}
		this.nombre = nombre;
	}

	public float getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		if (pvp<0.01) {
			pvp=0.01f;
		}
		this.pvp = pvp;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock<0) {
			stock=0;
		}
		
		this.stock = stock;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}

	@Override
	public String toString() {
		return "Producto "+nombre+" tiene "+stock+" uds. a"+pvp+" y es "+(perecedero?"perecedero":"no perecedero.");
	}
	
	public void leerDatos() {
		setNombre(Teclado.leerString("Nombre producto: "));
		setStock(Teclado.leerInt("Cuantas uds: "));
		setPvp(Teclado.leerFloat("Precio ud: "));
		setPerecedero(leerBoolean("Es perecedero S/N:"));
	}

	private boolean leerBoolean(String mensaje) {
		boolean loEs=false;
		String resp="";
		
		do {
			resp=Teclado.leerString(mensaje);
			if (resp.equalsIgnoreCase("s")) {
				loEs=true;
			}
		} while (!resp.equalsIgnoreCase("n")&&!resp.equalsIgnoreCase("s"));
		
		return loEs;
	}
		
}
