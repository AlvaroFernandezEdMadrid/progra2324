package libro;

import java.util.Arrays;

import Libreria.Libreria;
import daw.com.Teclado;

public class Libro {
	private final static String AUTORDEFECTO="Anonimo";
	
	private String isbn, titulo, autores[];
	private int nPaginas;
	
	
	public Libro(String isbn, String titulo, String[]autores, int nPaginas) {
		setIsbn(isbn);
		setTitulo(titulo);
		setAutores(autores);
		setNPaginas(nPaginas);
	}

	public Libro(String isbn)
	{
		this(isbn,"",null,1);
	}
	
	public Libro() {
		this("");
	}

	public String getIsbn() {
		return isbn;
	}
	
	public Libro(Libro og) {
		this(og.isbn, og.titulo, og.autores, og.nPaginas);
	}

	public void setIsbn(String isbn) {
		if (isbn==null) {
			isbn="";
		}
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo==null) {
			titulo="";
		}
		this.titulo = titulo;
	}

	public String[] getAutores() {
		String autories[]=null;
		
		if (this.autores!=null) {
			autories=new String[this.autores.length];
			for (int i = 0; i < this.autores.length; i++) {
				autories[i]=this.autores[i];
			}
		}
		
		return autories;
	}
	
	public int getNAutores() {
		
		return autores.length;
	}
	
	public void setAutor(int cual) {
		if (cual<0) {
			cual=0;
		}
	}

	public void setAutores(String[] autores) {
		if (this.autores!=null) {
			this.autores=new String[autores.length];
			for (int i = 0; i < autores.length; i++) {
				this.autores[i]=autores[i];
			}
		} else
			this.autores=null;
		
		this.autores = autores;
	}

	public int getnPaginas() {
		return nPaginas;
	}
	
	public void setNPaginas(int nPaginas2) {
		if (nPaginas2<1) {
			nPaginas2=1;
		}
		this.nPaginas=nPaginas2;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn 
				+ ", titulo=" + titulo 
				+ ", autores=" 
				+ autores==null?"Anonimo":Arrays.toString(autores) 
				+ ", nPaginas="
				+ nPaginas + "]";
	}
	
	public void mostrarDatos() {
		System.out.println("\n"+this);
	}
	
	public void leerDatos() {
		leerClave();
		leerOtrosDatos();
	}

	public void leerClave() {
		// TODO Auto-generated method stub
		isbn=Teclado.leerString("\nISBN: ");
	}

	public void leerOtrosDatos() {
		// TODO Auto-generated method stub
		int cuantosAutores=0;
		
		titulo=Teclado.leerString("\nTitulo");
		do {
			cuantosAutores=Teclado.leerInt("\nCuantos autores? ");
		} while (cuantosAutores<0);
		
		if (cuantosAutores>0) {
			autores=new String[cuantosAutores];
			for (int i = 0; i < cuantosAutores; i++) {
				autores[i]=Teclado.leerString("\nAutor: ");
			}
		}else
			autores=null;
		
		nPaginas=Libreria.leerEnteroPositivo("Cuantas paginas:");
	}
	
	public boolean equals(Libro otro) {
		
		return otro!=null&&isbn.equalsIgnoreCase(otro.isbn);
	}
	
	
	
}
