package oop.Punto;

public class AppPunto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear 3 puntos, leerlos por teclado y mostrar por pantalla el punto mas bajo (y mas peque)
		Punto p1, p2, p3, masBajo;
		
		p1=new Punto();
		p2=new Punto();
		p3=new Punto();
		

		System.out.println("P1: ");
		p1.leerDatos();
		System.out.println("P2: ");
		p2.leerDatos();
		System.out.println("P3: ");
		p3.leerDatos();
		
		masBajo=new Punto(p1);
		
		
		if (p2.getY()<masBajo.getY()) {
			masBajo=p2;
		}
		
		if (p3.getY()<masBajo.getY()) {
			masBajo=p3;
		}
		
		System.out.println("El punto mas pequenio es "+masBajo);
		
	}

}
