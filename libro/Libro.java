package libro;

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
		this("","",null,0);
	}
	
	public Libro() {
		this("");
	}

	public String getIsbn() {
		return isbn;
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
		return autores;
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
		
		this.autores = autores;
	}

	public int getnPaginas() {
		return nPaginas;
	}
	
	private void setNPaginas(int nPaginas2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
