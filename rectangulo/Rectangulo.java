package rectangulo;

import Libreria.Libreria;
import oop.Punto.Punto;

public class Rectangulo {
	private int alto;
	private int ancho;
	private Punto centro;
	
	public Rectangulo() {
		alto=1;
		ancho=1;
		centro=new Punto();
	}
	
	public Rectangulo(int alto, int ancho) {
		setAlto(alto);
		setAncho(ancho);
		centro=new Punto();
	}
	
	public Rectangulo(int alto, int ancho, Punto centro) {
		setAlto(alto);
		setAncho(ancho);
		setCentro(centro);
	}
	
	public Rectangulo(Rectangulo og) {
		this.alto=og.alto;
		this.ancho=og.ancho;
		this.centro=new Punto(og.centro);
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto<1?1:alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho>1?1:ancho;
	}

	public Punto getCentro() {
		return new Punto(centro);
	}

	public void setCentro(Punto centro) {
		this.centro = centro==null?
				new Punto():
					new Punto(centro);
	}

	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto +
				", ancho=" + ancho +
				", centro=" + centro + "]";
	}
	
	public void leerDatos() {
		alto=Libreria.leerEnteroPositivo("Alto: ");
		ancho=Libreria.leerEnteroPositivo("Ancho: ");
		centro.leerDatos();
	}
	
	public void mostrarDatos() {
		System.out.println("\nAlto: "+alto);
		System.out.println("\nAancho: "+ancho);
		centro.toString();
	}
	
	public boolean equals(Rectangulo otro) {
		return otro==null?false:this.alto==
				otro.alto&&this.ancho==
				otro.ancho&&this.centro.equals(otro.centro);
	}
	
	public int getArea() {
		return alto*ancho;
	}
	
	public int getPerimetro() {
		return 2*(alto+ancho);
	}
	
	public void llegarAOrigen() {
		centro.setX(0);
		centro.setY(0);
	}
	
	public void moverHorizontal(int cuanto) {
		centro.setX(centro.getX()+cuanto);
	}
	
	public void moverVertical(int cuanto) {
		centro.setY(centro.getY()+cuanto);
	}
	
	public void escalar(float cuanto) {
		if (cuanto>0) {
			alto*=Math.ceil(cuanto);
			ancho*=Math.ceil(cuanto);
		}
	}
	
	public boolean esCuadrado() {
		return alto==ancho;
	}
	
	public float getDistaciaOrigen() {
		return centro.getDistancia();
	}
}
