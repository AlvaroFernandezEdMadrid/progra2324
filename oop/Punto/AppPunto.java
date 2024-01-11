package oop.Punto;

public class AppPunto {

	public static void main(String[] args) {
		Punto p1, p2, p3;
		
		p1=new Punto(3,2,"P1");
		
		p2=new Punto();
		
		p3=new Punto("P3");
		
		p2.leerDatos();
		
		p3.setX(2);
		p3.setY(54);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
	}

}
