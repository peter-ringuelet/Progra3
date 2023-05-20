package prog3.arbolbinario;

import prog3.listagenerica.*;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	

	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	

	public boolean esLleno() {
		return false;
	}

	 boolean esCompleto() {
		return false;
	}

	
	// imprime el árbol en preorden
	public void Preorden() {
	    System.out.print(this.getDato() + " ");
	    if (this.tieneHijoIzquierdo()) {
	        this.hijoIzquierdo.Preorden();
	    }
	    if (this.tieneHijoDerecho()) {
	        this.hijoDerecho.Preorden();
	    }
	}

	/* imprime el árbol en inorden*/
    public void Inorden() {
	    if (this.tieneHijoIzquierdo()) {
	        this.hijoIzquierdo.Inorden();
	    }
	    System.out.print(this.getDato() + " ");
        if (this.tieneHijoDerecho()) {
	        this.hijoDerecho.Inorden();
	    }
    }
	
    // imprime el árbol en postorden
    public void Postorden() {
        if (this.tieneHijoIzquierdo()) {
            this.hijoIzquierdo.Postorden();
        }
        if (this.tieneHijoDerecho()) {
            this.hijoDerecho.Postorden();
        }
        System.out.print(this.getDato() + " ");
    }



	public void recorridoPorNiveles() {
		
	}

	

	
	public ListaGenerica<T> frontera(){
		ListaGenericaEnlazada<T> lista = new ListaGenericaEnlazada<>();
		lista.comenzar();
		fronteraAux(lista);
		return lista;
		
	}
	
	public void fronteraAux(ListaGenerica<T> l) {
		if (this.esHoja()) {
			l.agregarFinal(this.getDato());
		}
		else {
			if(this.tieneHijoIzquierdo()) {
				this.hijoIzquierdo.fronteraAux(l);
			}
			if (this.tieneHijoDerecho()) {
				this.hijoDerecho.fronteraAux(l);
			}
		}
	}
	
	
	
	public int contarHojas(ArbolBinario<T> arbol) {
	    if (arbol.esVacio()) {
	        return 0;
	    }
	    if (arbol.esHoja()) {
	        return 1;
	    } else {
	        return contarHojas(arbol.hijoIzquierdo) + contarHojas(arbol.hijoDerecho);
	    }
	}


	

}
