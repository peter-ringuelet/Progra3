package prog3.grafos.utiles;
import prog3.grafos.*;
import prog3.listagenerica.*;
import prog3.colagenerica.*;

public class Recorridos<T> {
	
public void dfs(Grafo<T> grafo){
	boolean[] marca = new boolean[grafo.listaDeVertices().tamanio()]; 
	for (int i=0; i<=marca.length;i++) {
	      if (!marca[i])
	    	  this.dfs(i, grafo, marca);
	}
}
private void dfs(int i, Grafo<T> grafo, boolean[] marca){ 
	marca[i] = true;
	Vertice<T> v = grafo.listaDeVertices().elemento(i); 
	System.out.println(v);
	ListaGenerica<Arista<T>> adyacentes = grafo.listaDeAdyacentes(v);
	adyacentes.comenzar();
	while(!adyacentes.fin()){
	      int j = adyacentes.proximo().verticeDestino().posicion();
	      if(!marca[j]){
	    	  this.dfs(j, grafo, marca);
	      }
	}
}

public void bfs(Grafo<T> grafo) {
	boolean[] marca = new boolean[grafo.listaDeVertices().tamanio()];
	for (int i=0; i<marca.length; i++) {
		if (!marca[i])
	        this.bfs(i, grafo, marca);
	} 
}
	private void bfs (int i, Grafo<T> grafo, boolean[] marca) {
		ListaGenerica<Arista<T>> ady = null;
		ColaGenerica<Vertice<T>> q = new ColaGenerica<Vertice<T>>();
		q.encolar(grafo.listaDeVertices().elemento(i));
		marca[i] = true;
		while(!q.esVacia()) {
			Vertice<T> v = q.desencolar();
			System.out.println(v);
			ady = grafo.listaDeAdyacentes(v);
			ady.comenzar();
			while(!ady.fin()) {
				Arista<T> arista = ady.proximo();
				int j = arista.verticeDestino().posicion();
				if (!marca[j]) {
					Vertice<T> w = arista.verticeDestino();
					marca[j] = true;
					q.encolar(w);
				}
			}
			
		}
		
	} 

}