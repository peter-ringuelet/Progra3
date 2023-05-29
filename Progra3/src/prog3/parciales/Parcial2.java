package prog3.parciales;

import prog3.arbolgeneral.*;
import prog3.listagenerica.*;

public class Parcial2 {
	private ArbolGeneral<Integer> arbol;
	
	public Parcial2(ArbolGeneral<Integer> arbol) {
		this.arbol=arbol;
	}
	
	public ListaGenericaEnlazada<Integer> resolver(){
		ListaGenericaEnlazada<Integer> lista= new ListaGenericaEnlazada<Integer>();
		resolverRecursivo(arbol,lista);
		return lista;
					
	}
	
	public void resolverRecursivo(ArbolGeneral<Integer> arbol,ListaGenericaEnlazada<Integer> lista) {
		int total=0;
		if(arbol.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos=arbol.getHijos();
			while(!hijos.fin()) {
				ArbolGeneral<Integer> hijo=hijos.proximo();
				total+=arbol.getDato();
				resolverRecursivo(hijo, lista);
			}
			if(hijos.tamanio()%2!=0) {
				lista.agregarFinal(total);
			}
		}
		
	}
}
