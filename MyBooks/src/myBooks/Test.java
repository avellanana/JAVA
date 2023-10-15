package myBooks;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Libro lib0 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		Libro lib1 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib2 = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
		Libro lib3 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		Libro lib4 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib5 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib6 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		Libro lib7 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib8 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib9 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);
		
		Revista rev0 = new Revista("Selecciones", 82, 1, true, 21.5);
		Revista rev1 = new Revista("Vogue",100,1,true,8.99);
		Revista rev2 = new Revista("National Geographic", 120,1,false,13.55);
		Revista rev3 = new Revista("Cosmopolitan",150,1,true,7.10);
		Revista rev4 = new Revista("People",82,1,false,2.8);
		
		Publicacion [] publicaciones = {lib0,lib1,lib2,lib3,lib4,lib5,lib6,lib7,lib8,lib9,rev0,rev1,rev2,rev3,rev4};
		
		//Todas las publicaciones del array 'publicaciones' con título e ID.
		System.out.println("Todas las publicaciones");
		for(int i = 0;i<publicaciones.length;i++) {
			System.out.println("Titulo: "+ publicaciones[i].getTitulo()+ ". ID: "+ publicaciones[i].getID());
		}
		
		//Solo libros del array publicaciones con ID y título.
		System.out.println();
		System.out.println("Libros");
		for (Publicacion librosDelArray : publicaciones) {
			if (librosDelArray instanceof Libro){
				String resultadoLibros = "Titulo: "+ librosDelArray.getTitulo()+ ". ID: "+ librosDelArray.getID();
				System.out.println(resultadoLibros);
			}
		}
		
		//Solo revistas del array publicaciones con ID y título.
		System.out.println();
		System.out.println("Revistas");
		for (Publicacion revistasDelArray : publicaciones) {
			if (revistasDelArray instanceof Revista)
				System.out.println("Titulo: "+ revistasDelArray.getTitulo()+ ". ID: "+ revistasDelArray.getID());
		}
		
		//Todas las publicaciones del array publicaciones con ID,  título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros.
		System.out.println();
		System.out.println("Todas las publicaciones con un precio mayor a 20 euros");
		for (Publicacion publicacionesDelArray  : publicaciones) {
			if (publicacionesDelArray.getPrecio()>20)
				System.out.println("ID: " + publicacionesDelArray.getID() +". Titulo: "+ publicacionesDelArray.getTitulo() +
						". Precio: " + publicacionesDelArray.getPrecio());
		}
		
		//Solo libros del array publicaciones con ID y  título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros.  
		//(usar instanceof para discriminar).
		System.out.println();
		System.out.println("Libros con un precio mayor de 20 euros");
		for (Publicacion librosDelArray : publicaciones) {
			if (librosDelArray instanceof Libro){
				if (librosDelArray.getPrecio()>20) {
					System.out.println("ID: " + librosDelArray.getID()+ ". Titulo: "+ librosDelArray.getTitulo() +
						". Precio: " + librosDelArray.getPrecio());
					
				}
			}
		}
		
		/*Solo revistas del array publicaciones con ID y  título y precio pero filtrando aquellas que tienen un precio 
		mayor de 3 euros  (usar instanceof para discriminar).*/
		System.out.println();
		System.out.println("Revistas con un precio mayor a 3 euros");
		for (Publicacion revistasDelArray : publicaciones) {
			if(revistasDelArray instanceof Revista) {
				if(revistasDelArray.getPrecio()>3) {
					System.out.println("ID: " + revistasDelArray.getID()+ ". Titulo: "+ revistasDelArray.getTitulo() +
						". Precio: " + revistasDelArray.getPrecio());
				}
			}
		}
		
		//UTILIZANDO ARRAYLIST
		ArrayList <Publicacion> ALPublicaciones = new ArrayList <Publicacion>();
		
		for(int i = 0; i<publicaciones.length;i++) {
			ALPublicaciones.add(publicaciones[i]);
		}
		
		//Todas las publicaciones del arrayList con título e ID.
		System.out.println();
		System.out.println("ARRAYLIST");
		System.out.println("Todas las publicaciones");
		for(int i=0; i<ALPublicaciones.size();i++) {
			System.out.println("Titulo: "+ ALPublicaciones.get(i).getTitulo() + ". ID: " + ALPublicaciones.get(i).getID());
		}
		
		//Solo libros del arrayList con ID y título.
		System.out.println();
		System.out.println("Libros");
		for(Publicacion librosDelArrayList : ALPublicaciones) {
			if(librosDelArrayList instanceof Libro) { 
				String resultadoLibros = "Titulo: "+ librosDelArrayList.getTitulo()+ ". ID: "+ librosDelArrayList.getID();
				System.out.println(resultadoLibros);
			}
		}
		
		//Solo revistas del arrayList con ID y título.
		System.out.println();
		System.out.println("Revistas");
		for(Publicacion revistasDelArrayList : ALPublicaciones) {
			if(revistasDelArrayList instanceof Revista) {
				System.out.println("Titulo: "+ revistasDelArrayList.getTitulo()+ ". ID: "+ revistasDelArrayList.getID());
			}
		}
		
		//Todas las publicaciones del arrayList con ID,  título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros.
		System.out.println();
		System.out.println("Publicaciones con precio mayor a 20 euros");
		
		for(int i=0; i<ALPublicaciones.size();i++) {
			if(ALPublicaciones.get(i).getPrecio()>20)
			System.out.println("ID: " + ALPublicaciones.get(i).getID()+ ". Titulo: "+ ALPublicaciones.get(i).getTitulo() + ". Precio: "+ 
		ALPublicaciones.get(i).getPrecio());
		}
		
		//Solo libros del arrayList con ID y  título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros.  
		//(usar instanceof para discriminar).
		System.out.println();
		System.out.println("Libros con precio mayor de 20 euros");
		for(Publicacion librosDelArrayList : ALPublicaciones) {
			if(librosDelArrayList instanceof Libro) {
				if(librosDelArrayList.getPrecio()>20)
					System.out.println("ID: " + librosDelArrayList.getID()+ ". Titulo: "+ librosDelArrayList.getTitulo() + ". Precio: "+ 
		librosDelArrayList.getPrecio());
			}
		}
		
		/*Solo revistas del array publicaciones con ID y  título y precio pero filtrando aquellas que tienen un precio 
		mayor de 3 euros  (usar instanceof para discriminar).*/
		System.out.println();
		System.out.println("Revistas del arrayList con precio mayor a 3 euros");
		for(Publicacion revistasDelArrayList : ALPublicaciones) {
			if(revistasDelArrayList instanceof Revista) {
				if(revistasDelArrayList.getPrecio()>3) {
					System.out.println("ID: " + revistasDelArrayList.getID()+ ". Titulo: "+ revistasDelArrayList.getTitulo() + ". Precio: "+ 
		revistasDelArrayList.getPrecio());
				}
			}
		}
		
		//VERIFICACION DE LECTURA
		//Mostrar el estado del libro Ulises
		Libro verificaLibro = (Libro) ALPublicaciones.get(7);
		System.out.println(verificaLibro.show());
		
		//Lee 300 palabras de forma silenciosa con el método estático y verifica que estás en la página 304
		System.out.println();
		System.out.println("Lee 300 paginas de forma silenciosa con método estático");
		for(int i=0; i<300;i++) {
			Libro.leePaginaStatic(verificaLibro, true);
		}
		
		//Lee 5 palabras de forma NO silenciosa con el método estático y verifica que estás en la página 309
		System.out.println();
		System.out.println("Lee 5 paginas de forma no silenciosa con método estático");
		for(int i=0;i<5;i++) {
			Libro.leePaginaStatic(verificaLibro, false);
		}
		
		//Lee 10 palabras de forma NO silenciosa con el método NO estático y verifica que estás en la página 310. (Nota: creo que era 319)
		System.out.println();
		System.out.println("Lee 10 paginas de forma silenciosa con método no estático");
		for(int i=0;i<10;i++) {
			verificaLibro.leePagina(false);
		}
		
		//Lee 1000 palabras con el método NO estático y verifica que figura como leído y está en la página 400.
		System.out.println();
		System.out.println("Lee 1000 paginas de forma silenciosa con método no estático");
		while (verificaLibro.getLeido() == false) {
			verificaLibro.leePagina(false);
		}
	}

}
