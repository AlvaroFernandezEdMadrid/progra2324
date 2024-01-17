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
	
	private void leerDatos() {
		leerOtrosDatos();
	}

	private void leerOtrosDatos() {
		setPrecioBase(Teclado.leerFloat("Introduce el precio base: "));
		setPeso(Teclado.leerInt("Introduce el peso: "));
		setColor(leerColor());
	}

	private Color leerColor() {
		String entrada="";
		Color color;
		
		entrada=Teclado.leerString("Color: ");
		
		return null;
	}
	
	
}
