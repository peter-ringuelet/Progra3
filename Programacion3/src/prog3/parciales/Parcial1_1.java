package prog3.parciales;
import prog3.arbolbinario.*;

public class Parcial1_1 {
	private ArbolBinario<Character> arbol = new ArbolBinario<Character>();
	public Parcial1_1(ArbolBinario<Character> arbol) {
		this.arbol = arbol;
	}
	public int procesar(int k) {
		int caminos = 0;
		if (!this.arbol.esVacio() && this.arbol != null) {
			caminos = procesarRecursivo(this.arbol,k);
		}
		return caminos;
	}
	private int procesarRecursivo(ArbolBinario<Character> arbol, int k) {
		int cont = 0;
		if(k==0 && arbol.esHoja()) {
			return 1;
		}
		if(arbol.tieneHijoIzquierdo() && !arbol.tieneHijoDerecho()) {
			cont+=procesarRecursivo(arbol.getHijoIzquierdo(),k-1);
		}
		if(!arbol.tieneHijoIzquierdo() && arbol.tieneHijoDerecho()) {
			cont+=procesarRecursivo(arbol.getHijoDerecho(),k-1);
		}
		if(arbol.tieneHijoIzquierdo() && arbol.tieneHijoDerecho()) {
			cont=+procesarRecursivo(arbol.getHijoIzquierdo(),k);
			cont+=procesarRecursivo(arbol.getHijoDerecho(),k);
		}
		return cont;
	}
}