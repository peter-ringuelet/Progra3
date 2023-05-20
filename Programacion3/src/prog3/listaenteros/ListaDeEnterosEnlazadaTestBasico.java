package prog3.listaenteros;

public class ListaDeEnterosEnlazadaTestBasico {

	public static void main(String[] args) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		ListaDeEnterosEnlazada listaOrdenada = new ListaDeEnterosEnlazada();
		ListaDeEnterosEnlazada ordenadaMerge = new ListaDeEnterosEnlazada();
		ListaDeEnterosEnlazada ordenada = new ListaDeEnterosEnlazada();
		ListaDeEnterosEnlazada desordenada = new ListaDeEnterosEnlazada();
		ListaDeEnterosEnlazada ordenadaMergeSort = new ListaDeEnterosEnlazada();
		
		lista.agregarFinal(2);
		lista.agregarFinal(5);
		lista.agregarFinal(9);
		imprimirRecursivo(lista);
		System.out.println(lista);
		while (!lista.fin()){
			System.out.println(lista.proximo());
		}
		imprimirRecursivo(lista);
		listaOrdenada = lista.ordenar();
		imprimirRecursivo(listaOrdenada);
		
		ordenada.agregarFinal(4);
		ordenada.agregarFinal(8);
		ordenada.agregarFinal(10);
		
		ordenadaMerge = ordenada.combinarOrdenado(listaOrdenada);
		imprimirRecursivo(ordenadaMerge);
		
		desordenada.agregarFinal(7);
		desordenada.agregarFinal(10);
		desordenada.agregarFinal(2);
		desordenada.agregarFinal(1);
		desordenada.agregarFinal(3);
		desordenada.agregarFinal(4);
		desordenada.agregarFinal(5);
		
		ordenadaMergeSort = mergeSort(desordenada);
		imprimirRecursivo(ordenadaMergeSort);
		
	}
	
	public static void imprimirRecursivo(ListaDeEnterosEnlazada lista) {
		if(!lista.fin()) {
			System.out.println(lista.proximo());
			imprimirRecursivo(lista);
		}
	}
	
	public static ListaDeEnterosEnlazada mergeSort(ListaDeEnterosEnlazada lista) {
	    if (lista.tamanio() <= 1) {
	        return lista;
	    }

	    int medio = lista.tamanio() / 2;
	    ListaDeEnterosEnlazada listaIzquierda = new ListaDeEnterosEnlazada();
	    ListaDeEnterosEnlazada listaDerecha = new ListaDeEnterosEnlazada();

	    for (int i = 0; i < medio; i++) {
	        listaIzquierda.agregarFinal(lista.elemento(i));
	    }

	    for (int i = medio; i < lista.tamanio(); i++) {
	        listaDerecha.agregarFinal(lista.elemento(i));
	    }

	    listaIzquierda = mergeSort(listaIzquierda);
	    listaDerecha = mergeSort(listaDerecha);

	    return listaIzquierda.combinarOrdenado(listaDerecha);
	}

}
