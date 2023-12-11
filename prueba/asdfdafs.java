package prueba;

import daw.com.Teclado;

public class asdfdafs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean easd;
		String dni;
		
		dni=Teclado.leerString("dni: ");
		
		easd=comprobarDNI(dni);
		
		System.out.println(easd?"trabaja":"No trabaja");
	}
	private static boolean leerTrabaja() {
		boolean cotiza=false;
		String respuesta;
		
		do {
			respuesta=Teclado.leerString("Trabaja?:");
			if (respuesta.equalsIgnoreCase("s")) {
				cotiza=true;
			}
			else if (respuesta.equalsIgnoreCase("n")) {
				cotiza=false;
			}
		} while (!respuesta.equalsIgnoreCase("s")&&!respuesta.equalsIgnoreCase("n"));
		
		return cotiza;
	}
	
	private static boolean comprobarDNI(String dni) {
		String caracteres[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resto = Integer.valueOf(dni.substring(0, dni.length()-1));
        boolean valido=false;
        
        resto%=23;
        valido=dni.substring(dni.length()-1, dni.length()).equalsIgnoreCase(caracteres[resto]);
        
        return valido;
	}
}
