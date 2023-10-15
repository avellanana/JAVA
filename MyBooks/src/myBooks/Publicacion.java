package myBooks;

public abstract class Publicacion {
	//propiedades
	private String titulo;
	private int numPags;
	private double precio;
	private int ID;
	private static long nextID = 0;
	
	//constructor
	protected Publicacion(String titulo, int numPags, double precio) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.precio = precio;
		this.ID = (int)nextID+1;
		nextID = ID;
	}
	
	//getters
	public String getTitulo() {
		return titulo;
	}
	
	public int getNumPags() {
		return numPags;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Publicacion \"" + titulo + "\" con " + numPags + " páginas y precio " + precio + "€";
	}
	
	

}
