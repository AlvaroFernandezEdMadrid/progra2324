package electrodomestico;

import daw.com.Teclado;

public class Electrodomestico {
	private final static float PRECIODEFECTO=100f;
	private final static int PESODEFECTO=5;
	private final static Color COLORDEFECTO=Color.BLANCO;
	private final static Consumo CONSUMODEFECTO=Consumo.F;
	
	private float precioBase;
	private int peso;
	Color color;
	Consumo consumo;
	
	public Electrodomestico(float precioBase, int peso, Color color, Consumo consumo) {
		setPrecioBase(precioBase);
		setPeso(peso);
		setColor(color);
		setConsumo(consumo);
	}

	public Electrodomestico(float precioBase, int peso) {
		this(precioBase, peso, COLORDEFECTO, CONSUMODEFECTO);
	}

	public Electrodomestico() {
		this(PRECIODEFECTO,PESODEFECTO,COLORDEFECTO,CONSUMODEFECTO);
	}
	
//GETTERS & SETTERS
	public float getPrecioBase() {
		return precioBase;
	}

	private void setPrecioBase(float precioBase) {
		if (precioBase<0) {
			precioBase=0;
		}
		this.precioBase=precioBase;
	}

	public int getPeso() {
		return peso;
	}

	private void setPeso(int peso) {
		if (peso<0) {
			peso=0;
		}
		
		this.peso = peso;
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color==null) {
			color=Color.BLANCO;
		}
		this.color = color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	private void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}
	
	

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", peso=" + peso + ", color=" + color + ", consumo="
				+ consumo + "]";
	}

	public void leerDatos() {
		setPrecioBase(Teclado.leerFloat("Introduce el precio base: "));
		setPeso(Teclado.leerInt("Introduce el peso: "));
		setColor(comprobarColor());
		setConsumo(comprobarConsumoEnergetico());
	}

	public float getPrecioFinal() {
		float porConsumo=calcularIncrementoConsumo();
		float porPeso=calcularIncrementoPeso();
		return precioBase+porConsumo+porPeso;
	};
	
	private float calcularIncrementoPeso() {
		float incremento=0;
		
		if (peso>=80) {
			incremento=100;
		}else if (peso<80&&peso>=50) {
			incremento=80;
		}else if (peso<50&&peso>=20) {
			incremento=50;
		}else if (peso<20&&peso>0) {
			incremento=10;
		}
		
		return incremento;
	}

	private float calcularIncrementoConsumo() {
		float incremento=0;
		
		switch (consumo) {
		case A:
			incremento=100;
			break;
		case B:
			incremento=80;
			break;
		case C:
			incremento=60;
			break;
		case D:
			incremento=50;
			break;
		case E:
			incremento=30;
			break;
		case F:
			incremento=10;
			break;
		}
		
		return incremento;
	}
	
	public void mostrarDatos() {
		System.out.println(toString());
	}
	
	private Consumo comprobarConsumoEnergetico() {
		String entrada="";
		Consumo consumo;
		
		entrada=Teclado.leerString("Consumo (A-F): ").toLowerCase();
		
		switch (entrada) {
		case "a":
			consumo=Consumo.A;
			break;
		case "b":
			consumo=Consumo.B;
			break;
		case "c":
			consumo=Consumo.C;
			break;
		case "d":
			consumo=Consumo.D;
			break;
		case "e":
			consumo=Consumo.E;
			break;
		case "f":
			consumo=Consumo.F;
			break;
		default:
			consumo=CONSUMODEFECTO;
			break;
		}
		return consumo;
	}

	private Color comprobarColor() {
		String entrada="";
		Color color;
		
		entrada=Teclado.leerString("Color (Blanco, Negro, Rojo, Azul, Gris): ").toLowerCase();
		
		switch (entrada) {
		case "blanco":
			color=Color.BLANCO;
			break;
		case "negro":
			color=Color.NEGRO;
			break;
		case "rojo":
			color=Color.ROJO;
			break;
		case "azul":
			color=Color.AZUL;
			break;
		case "gris":
			color=Color.GRIS;
			break;
		default:
			color=COLORDEFECTO;
			break;
		}
		
		return color;
	}
	
	
}
