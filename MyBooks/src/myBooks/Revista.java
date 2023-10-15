package myBooks;

public class Revista extends Publicacion implements CanRead {
	//propiedades
	private int pagInicial;
	private boolean formatoDigital;
	private int pagActual;
	private boolean leido;
	
	private static String mensajeCabecera = "\nDATOS REVISTA\n=============\n";
	
	//constructor
	public Revista(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, precio);
		this.pagInicial=1;
		this.formatoDigital=formatoDigital;
		this.pagActual=pagInicial;
	}
	
	//métodos
	public String show() {
		return mensajeCabecera + "Titulo: " + getTitulo() + "\n ID: " + getID() + "\n Paginas: " + getNumPags() + "\n "
				+ "Pagina Inicial: " + pagInicial + "\n Pagina Actual: " + pagActual + "\n Precio: " + getPrecio() + "\n Formato Digital: " 
				+ formatoDigital + "\n Leido: " + leido;
	}
	
	public static String showStatic(Revista r) {
		return r.show();
	}
	
	public void leePagina(boolean silenciosamente) {
		if(leido == true) {
			System.out.printf("Revista titulada %s ya ha sido leida", getTitulo());
		}else {
			if(leido == false && pagActual == super.getNumPags()) {
				pagActual +=1;
				if(pagActual == super.getNumPags()) {
					System.out.printf("Última página (%d) leída de la revista titulada %s", pagActual, getTitulo());
					leido = true;
				}else {
					System.out.printf("Página %d leída de la revista titulada %s", pagActual, getTitulo());
				}
			}	
		}
	}
	
	public static void leePaginaStatic(Revista r, boolean silenciosamente) {
		if(r.leido == true) {
			System.out.printf("Revista titulada %s ya ha sido leida", r.getTitulo());
		}else {
			if(r.leido == false && r.pagActual == r.getNumPags()) {
				r.pagActual +=1;
				if(r.pagActual == r.getNumPags()) {
					System.out.printf("Última página (%d) leída de la revista titulada %s", r.pagActual, r.getTitulo());
					r.leido = true;
				}else {
				System.out.printf("Página %d leída de la revista titulada %s", r.pagActual, r.getTitulo());
				}
			}	
		}
	}

}
