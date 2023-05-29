package prog3.parciales;
import prog3.arbolbinario.*;
import prog3.listagenerica.*;

public class Parcial3Main {

	public static void main(String[] args) {
		//Arbol creaccion
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> hd = new ArbolBinario<Integer>(7);
		arbol.agregarHijoDerecho(hd);
		ArbolBinario<Integer> hi = new ArbolBinario<Integer>(6);
		arbol.agregarHijoIzquierdo(hi);
		ArbolBinario<Integer> hi1 = new ArbolBinario<Integer>(1);
		arbol.getHijoIzquierdo().agregarHijoIzquierdo(hi1);
		ArbolBinario<Integer> hi2 = new ArbolBinario<Integer>(9);
		arbol.getHijoIzquierdo().agregarHijoDerecho(hi2);
		
		ArbolBinario<Integer> hi3 = new ArbolBinario<Integer>(0);
		arbol.getHijoIzquierdo().getHijoIzquierdo().agregarHijoDerecho(hi3);
		
		ArbolBinario<Integer> hi4 = new ArbolBinario<Integer>(11);
		ArbolBinario<Integer> hi5 = new ArbolBinario<Integer>(5);
		arbol.getHijoIzquierdo().getHijoDerecho().agregarHijoIzquierdo(hi4);
		arbol.getHijoIzquierdo().getHijoDerecho().agregarHijoDerecho(hi5);
		
		ArbolBinario<Integer> hd1 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> hd2 = new ArbolBinario<Integer>(3);
		arbol.getHijoDerecho().agregarHijoIzquierdo(hd1);
		arbol.getHijoDerecho().agregarHijoDerecho(hd2);
		
		ArbolBinario<Integer> hd3 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> hd4 = new ArbolBinario<Integer>(4);
		arbol.getHijoDerecho().getHijoIzquierdo().agregarHijoIzquierdo(hd3);
		arbol.getHijoDerecho().getHijoIzquierdo().agregarHijoDerecho(hd4);
		arbol.Preorden();
		
		// Parcial
		Parcial3 parcial = new Parcial3(arbol);
		ListaGenericaEnlazada<Integer> lista = parcial.procesar();
		System.out.println(lista.toString());
	}
	
}
