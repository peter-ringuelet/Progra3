package prog3.parciales;
import prog3.arbolbinario.*;
import prog3.listagenerica.*;

public class Parcial3 {
	private ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();
	public Parcial3(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	public ListaGenericaEnlazada<Integer> procesar(){
		ListaGenericaEnlazada<Integer> lista = new ListaGenericaEnlazada<Integer>();
		if (!this.arbol.esVacio() && this.arbol != null) {
			procesarRecursivo(this.arbol, lista);
		}
		return lista;
	}
	private void procesarRecursivo(ArbolBinario<Integer> arbol, ListaGenericaEnlazada<Integer> lista) {
		if(arbol.tieneHijoIzquierdo() && arbol.tieneHijoDerecho()) {
			if(arbol.getHijoIzquierdo().getDato() <= arbol.getHijoDerecho().getDato()) {
				lista.agregarFinal(arbol.getDato());
			}
		}
		if(arbol.tieneHijoIzquierdo()) {
			procesarRecursivo(arbol.getHijoIzquierdo(), lista);
		}
		if(arbol.tieneHijoDerecho()) {
			procesarRecursivo(arbol.getHijoDerecho(), lista);
		}
	}
}
