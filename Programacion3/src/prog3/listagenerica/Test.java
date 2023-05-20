package prog3.listagenerica;


public class Test {

	public static void main(String[] args) {
		ListaGenericaEnlazada<Integer> lista = new ListaGenericaEnlazada<>();
		lista.agregarFinal(1);
		lista.agregarFinal(2);
		lista.agregarFinal(3);
		lista.agregarFinal(1);
		lista.agregarFinal(2);
		lista.agregarFinal(3);
	
		System.out.println("Lista normal: ");
		imprimirRecursivo(lista,0);
		System.out.println(" ");
		ListaGenericaEnlazada<Integer> listaInversa = new ListaGenericaEnlazada<>();
		
		
		lista.invertir(listaInversa);
		
		
		System.out.println("Lista inversa: ");
		imprimirRecursivo(listaInversa,0);
		System.out.println(" ");
		System.out.println("Lista normal: ");
		imprimirRecursivo(lista,0);
		System.out.println(" ");
		
		System.out.println(lista.toString());

	}
	

	public static <T> void imprimirRecursivo(ListaGenericaEnlazada<T> lista, int index) {
	    if (index < lista.tamanio()) {
	        System.out.print(lista.elemento(index) + " ");
	        imprimirRecursivo(lista, index + 1);
	    }
	}

}
