package exaClasObj;

import Libreria.Libreria;
import daw.com.Teclado;

public class PuntoControl {
	private int ubicacion;
	private String nombreJuez;
	private Corredor ganador;
	
	public PuntoControl(int ubicacion, String nombreJuez, Corredor ganador) {
		setUbicacion(ubicacion);
		this.nombreJuez = nombreJuez;
		setGanador(ganador);
	}

	public PuntoControl() {
		this(0,"",null);
	}

	public int getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(int ubicacion) {
		if (ubicacion<0) {
			ubicacion=0;
		}
		this.ubicacion = ubicacion;
	}

	public String getNombreJuez() {
		return nombreJuez;
	}

	public void setNombreJuez(String nombreJuez) {
		this.nombreJuez = nombreJuez;
	}

	public Corredor getGanador() {
		Corredor copia;
		
		copia=new Corredor(ganador);
		
		return copia;
	}

	public void setGanador(Corredor ganador) {
		Corredor copia;
		
		copia=new Corredor(ganador);
		
		this.ganador = copia;
	}

	@Override
	public String toString() {
		return "PuntoControl [ubicacion=" + ubicacion + ", nombreJuez=" + nombreJuez + ", ganador=" + ganador
				+ ", segundosGanador=" + ganador.getSegundos() + "]";
	}

	public boolean equals(PuntoControl otro) {
		
		return otro!=null&&otro.ubicacion==ubicacion;
	}
	
	public void leerDatos() {
		leerClave();
		leerOtrosDatos();
	}

	public void leerClave() {
		ubicacion=Libreria.leerEnteroPositivo("\nKm en el que se ubica:");
	}

	public void leerOtrosDatos() {
		nombreJuez=Teclado.leerString("Nombre del juez: ");
		ganador.leerDatos();
	}
}
