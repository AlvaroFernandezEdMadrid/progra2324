package exaClasObj;

public class Carrera {
	private String nombre;
	private int nCorredores;
	private Corredor[] corredores;
	private int nPuntosControl;
	private PuntoControl[] puntosControl;
	private int valorPremio;
	private int dorsal=1;
	
	
	public Carrera(String nombre, int nCorredores, Corredor[] corredores, int nPuntosControl,
			PuntoControl[] puntosControl, int valorPremio) {
		
		this.nombre = nombre;
		setnCorredores(nCorredores);
		this.corredores = corredores;
		setnPuntosControl(nPuntosControl);
		this.puntosControl = puntosControl;
		setValorPremio(valorPremio);
	}
	
	public Carrera() {
		this("",1,null,1,null,1);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getnCorredores() {
		return nCorredores;
	}

	public void setnCorredores(int nCorredores) {
		if (nCorredores<0) {
			nCorredores=1;
		}
		this.nCorredores = nCorredores;
	}

	public Corredor[] getCorredores() {
		return corredores;
	}

	public void setCorredores(Corredor[] corredores) {
		this.corredores = corredores;
	}

	public int getnPuntosControl() {
		return nPuntosControl;
	}

	public void setnPuntosControl(int nPuntosControl) {
		if (nPuntosControl<0) {
			nPuntosControl=1;
		}
		this.nPuntosControl = nPuntosControl;
	}

	public PuntoControl[] getPuntosControl() {
		return puntosControl;
	}

	public void setPuntosControl(PuntoControl[] puntosControl) {
		this.puntosControl = puntosControl;
	}

	public int getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(int valorPremio) {
		if (valorPremio<0) {
			valorPremio=1;
		}
		this.valorPremio = valorPremio;
	}
	
	public boolean addCorredor(Corredor cor) {
		boolean exito=false;
		
		if (cor!=null) {
			if (corredores!=null) {
				if (buscarHuecoCorredores()!=-1) {
					do {
						cor.leerClave();
					} while (buscarCorredor(cor)!=-1);
					
					cor.leerOtrosDatos();
					cor.setDorsal(dorsal);
					dorsal++;
					corredores[buscarHuecoCorredores()]=cor;
					
					exito=true;
				}else
					System.out.println("No hay hueco");
			}
		}
		
		
		
		return exito;
	}

	public int buscarHuecoCorredores() {
		int pos=-1;
		
		for (int i = 0; i < corredores.length&&pos==-1; i++) {
			if (corredores[i]==null) {
				pos=i;
			}
		}
		
		return pos;
	}

	public int buscarCorredor(Corredor cor) {
		int pos=-1;
		
		for (int i = 0; i < corredores.length&&pos==-1; i++) {
			if (corredores[i]!=null) {
				if (corredores[i].getDni().equalsIgnoreCase(cor.getDni())) {
					pos=i;
				}
			}
		}
		
		return pos;
	}
	
	public boolean addPuntoControl(PuntoControl p) {
		boolean exito=false;
		
		if (p!=null) {
			if (puntosControl!=null) {
				if (buscarHuecoPuntos()!=-1) {
					do {
						p.leerClave();
					} while (buscarPunto(p)!=-1);
					
					p.leerOtrosDatos();
					
					puntosControl[buscarHuecoPuntos()]=p;
					
					exito=true;
				}else
					System.out.println("No hay hueco");
			}
		}
		
		
		
		return exito;
	}

	private int buscarPunto(PuntoControl p) {
		int pos=-1;
		
		for (int i = 0; i < puntosControl.length&&pos==-1; i++) {
			if (puntosControl[i]!=null) {
				if (!(puntosControl[i].getUbicacion()!=p.getUbicacion())) {
					pos=i;
				}
			}
		}
		
		return pos;
	}

	private int buscarHuecoPuntos() {
		int pos=-1;
		
		for (int i = 0; i < puntosControl.length&&pos==-1; i++) {
			if (puntosControl[i]==null) {
				pos=i;
			}
		}
		
		return pos;
	}
}
