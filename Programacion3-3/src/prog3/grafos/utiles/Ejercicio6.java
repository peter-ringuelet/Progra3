package prog3.grafos.utiles;
import prog3.grafos.*;
import prog3.listagenerica.*;
import prog3.colagenerica.*;

public class Ejercicio6 {
	private Grafo<String> grafo = new Grafo<String>();
	public ListaGenerica<String> devolverCamino(String ciudad1, String ciudad2) {
	    ListaGenerica<String> camino = new ListaGenericaEnlazada<>();

	    // Verificar si ciudad1 y ciudad2 existen en el grafo de ciudades
	    if (!grafo.existeVertice(new Vertice<>(ciudad1)) || !grafo.existeVertice(new Vertice<>(ciudad2))) {
	        return camino; // Retorna lista vacía si alguna ciudad no existe
	    }

	    // Realizar un recorrido en profundidad (DFS) desde ciudad1 hasta encontrar ciudad2
	    boolean[] visitado = new boolean[grafo.listaDeVertices().tamanio()];
	    dfs(ciudad1, ciudad2, camino, visitado);

	    return camino;
	}

	private void dfs(String ciudadActual, String ciudadDestino, ListaGenerica<String> camino, boolean[] visitado) {
	    visitado[grafo.vertice(ciudadActual).posicion()] = true;
	    camino.agregarFinal(ciudadActual);

	    if (ciudadActual.equals(ciudadDestino)) {
	        return; // Se llegó a la ciudad destino, se termina el recorrido
	    }

	    ListaGenerica<Arista<String>> adyacentes = grafo.listaDeAdyacentes(grafo.vertice(ciudadActual));
	    adyacentes.comenzar();
	    while (!adyacentes.fin()) {
	        String ciudadAdyacente = adyacentes.proximo().verticeDestino().dato();
	        if (!visitado[grafo.vertice(ciudadAdyacente).posicion()]) {
	            dfs(ciudadAdyacente, ciudadDestino, camino, visitado);
	            if (!camino.estaVacia() && camino.elemento(camino.tamanio() - 1).equals(ciudadDestino)) {
	                return; // Se encontró el camino, se termina el recorrido
	            }
	        }
	    }

	    // Si no se encontró el camino, se retrocede y se elimina la ciudad actual del camino
	    if (!camino.estaVacia() && !camino.elemento(camino.tamanio() - 1).equals(ciudadDestino)) {
	        camino.eliminarEn(camino.tamanio());
	    }
	}

}
