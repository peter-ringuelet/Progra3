package prog3.grafos.utiles;

import prog3.grafos.*;
import prog3.listagenerica.*;


public class Parcial1 {
	
	public ListaGenericaEnlazada<Ciudad> resolver (Grafo<Ciudad> ciudades, String origen, String destino){
		boolean[] marca = new boolean [ciudades.listaDeVertices().tamanio() + 1];
		ListaGenericaEnlazada<Ciudad> camino = new ListaGenericaEnlazada<Ciudad>();
		
		ListaGenerica<Vertice<Ciudad>> aux = ciudades.listaDeVertices();
		boolean ok = false;
		Vertice<Ciudad> v = null;
		aux.comenzar();
		while (!aux.fin() && !ok){
			v = aux.proximo();
			if (v.dato().getNombre().equals(origen)) {
				ok = true;
			}
		}
		if (ok && v.dato().getFase() != 1) {
			resolver (ciudades,destino,marca,camino,v.posicion());
		}
		return camino;
	}
	
	private boolean resolver(Grafo<Ciudad> ciudades, String destino, boolean []marca,ListaGenerica<Ciudad> camino, int i) {
		boolean encontre = false;
		marca[i] = true;
		Vertice <Ciudad> v = ciudades.listaDeVertices().elemento(i);
		camino.agregarFinal(v.dato());
		if (v.dato().getNombre().equals(destino)) {
			encontre = true;}
		else {
			ListaGenerica<Arista<Ciudad>> ady = ciudades.listaDeAdyacentes(v);
			ady.comenzar();
			while(!ady.fin() && !encontre) {
				Arista<Ciudad> a = ady.proximo();
				int j = a.verticeDestino().posicion();
				if (!marca[j] && a.verticeDestino().dato().getFase() != 1) {
					encontre = resolver (ciudades,destino,marca,camino,j);
				}
			}
			if (!encontre) {
				marca[i] = false;
				camino.eliminarEn(camino.tamanio());
			}
			
		}
		
		return encontre;
	}
	

}