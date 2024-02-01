package rectangulo;

import oop.Punto.Punto;

public class AppRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1,r2;
		Punto p;
		
		r1=new Rectangulo();
		r2=new Rectangulo(4,6);
		
		r1.escalar(3);
		
		r2.moverHorizontal(-3);
		
		r1.moverVertical(4);
		
		r1.mostrarDatos();
		r2.mostrarDatos();
		
		if (r1.getCentro().equals(r2.getCentro())) {
			System.out.println("Son concentricos");
		} else
			System.out.println("No son concentricos");
		
		if (r1.getCentro().getY()>r2.getCentro().getY()) {
			System.out.println("El rectangulo mas alto es r1");
		} else
			System.out.println("El rectangulo mas alto es r2");
		
		
		p=r1.getCentro();
		p.setNombre("p1");
		r1.setCentro(p);
		
		//No furula r2.getCentro().setNombre("p2");
	}
	
	

}
