package videoclub;

import daw.com.Teclado;

public class LeerDigitosComoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m;
		
		m = Teclado.leerString();
		
		// leer sÃ³lo dÃ­gitos
		System.out.println(m.matches("[0-9]*"));
	}

}