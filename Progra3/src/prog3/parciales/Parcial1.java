package prog3.parciales;
import prog3.arbolbinario.*;

public class Parcial1 {
	private ArbolBinario<Character> arbol = new ArbolBinario<Character>();
	public Parcial1(ArbolBinario<Character> arbol) {
		this.arbol = arbol;
	}
	public int procesar(int k) {
		int caminos = 0;
		if (!this.arbol.esVacio() && this.arbol != null) {
			caminos = procesarRecursivo(this.arbol, k, 0);
		}
		return caminos;
	}
	private int procesarRecursivo(ArbolBinario<Character> arbol, int k, int cont) {
		int caminos = 0;
		if((!arbol.tieneHijoIzquierdo() && arbol.tieneHijoDerecho()) || (arbol.tieneHijoIzquierdo() && !arbol.tieneHijoDerecho())) {
			cont++;
		}
		if(arbol.esHoja() && k == cont) {
			caminos++;
		}
		if(arbol.tieneHijoIzquierdo()) {
			caminos += procesarRecursivo(arbol.getHijoIzquierdo(), k, cont);
		}
		if (arbol.tieneHijoDerecho()) {
			caminos += procesarRecursivo(arbol.getHijoDerecho(), k, cont);
		}
		return caminos;
	}
}
