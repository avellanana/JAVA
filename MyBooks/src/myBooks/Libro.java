package myBooks;

public class Libro extends Publicacion implements CanRead {
	//propiedades
	private String autor;
	private int pagInicial;
	private boolean formatoDigital;
	private int pagActual;
	private boolean leido;
	
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";
	
	
	//Constructor
	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, precio);
		this.autor=autor;
		this.pagInicial=pagInicial;
		this.formatoDigital=formatoDigital;
		this.pagActual=pagInicial;
		}
	
	//métodos
	public String show() {
		return Libro.mensajeCabecera + "Titulo: " + getTitulo() + "\n Autor: " + autor + "\n ID: " + getID() + "\n Paginas: " + getNumPags() + "\n "
				+ "Pagina Inicial: " + pagInicial + "\n Pagina Actual: " + pagActual + "\n Precio: " + getPrecio() + "\n Formato Digital: " 
				+ formatoDigital + "\n Leido: " + leido;
	}
	
	public static String showStatic(Libro l) {
		return l.show();
	}
	
	public boolean getLeido() {
		return leido;
	}
	
	public void leePagina(boolean silenciosamente) {
		if (leido == true) {
			System.out.printf("Libro titulado %s del autor %s ya ha sido leído%n", getTitulo(), autor);
		} else {
			if (leido == false && pagActual != super.getNumPags()) {
				pagActual += 1;
				if(pagActual == super.getNumPags()) {
					System.out.printf("Última página (%d) leída del libro titulado %s del autor %s%n", pagActual,
							getTitulo(), autor);
					leido = true;
				}else {
					System.out.printf("Página %d leída del libro titulado %s del autor %s%n", pagActual, getTitulo(),
							autor);
				}
			}
		}
	}
	
	public static void leePaginaStatic(Libro l, boolean silenciosamente) {
		if (l.leido == true) {
			System.out.printf("Libro titulado %s del autor %s ya ha sido leído%n", l.getTitulo(), l.autor);
		} else {
			if (l.leido == false && l.pagActual != l	.getNumPags()) {
				l.pagActual += 1;
				if (l.pagActual == l.getNumPags()) {
					System.out.printf("Última página (%d) leída del libro titulado %s del autor %s%n", l.pagActual,
							l.getTitulo(), l.autor);
					l.leido = true;
				} else {
					System.out.printf("Página %d leída del libro titulado %s del autor %s%n", l.pagActual,
							l.getTitulo(), l.autor);
				}
			}
		}
	}
}
	