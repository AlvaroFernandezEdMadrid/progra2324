package ejercicios;

import daw.com.Teclado;

public class Pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase;
		boolean itIs;
		
		phrase=Teclado.leerString("Frase: ");
		
		itIs=isPalindrome(phrase);
		
		System.out.println(itIs?"ES palindromo.":"NO ES palindromo.");
	}

	private static boolean isPalindrome(String phrase) {
		boolean itIs;
		String letter="", reverse="", phraseNoSpace="";
		
		phraseNoSpace=phrase.replace(" ", "");
		
		for (int i = phraseNoSpace.length()-1; i >= 0; i--) {
			letter=phraseNoSpace.substring(i, i+1);
			reverse+=letter;
		}
		
		itIs=phraseNoSpace.equalsIgnoreCase(reverse);
		
		return itIs;
	}

}
