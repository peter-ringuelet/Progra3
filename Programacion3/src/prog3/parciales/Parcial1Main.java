package prog3.parciales;
import prog3.arbolbinario.*;

public class Parcial1Main {

	public static void main(String[] args) {
		int caminos;
		int k =2;
		ArbolBinario<Character> arbol = new ArbolBinario<Character>('a');
		ArbolBinario<Character> HI = new ArbolBinario<Character>('c');
		arbol.agregarHijoIzquierdo(HI);
		ArbolBinario<Character> HI1 = new ArbolBinario<Character>('m');
		ArbolBinario<Character> HD1 = new ArbolBinario<Character>('p');
		HI1.agregarHijoDerecho(HD1);
		arbol.getHijoIzquierdo().agregarHijoIzquierdo(HI1);
		
		ArbolBinario<Character> arbolD = new ArbolBinario<Character>('o');
		ArbolBinario<Character> arbolDHI = new ArbolBinario<Character>('q');
		ArbolBinario<Character> arbolDHD = new ArbolBinario<Character>('z');
		arbolD.agregarHijoIzquierdo(arbolDHI);
		arbolD.agregarHijoDerecho(arbolDHD);
		
		arbol.getHijoIzquierdo().agregarHijoDerecho(arbolD);
		arbol.Preorden();
		Parcial1 a = new Parcial1(arbol);
		caminos = a.procesar(k);
		System.out.println(caminos);

	}

}
