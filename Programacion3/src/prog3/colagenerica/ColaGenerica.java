package prog3.colagenerica;

import prog3.listagenerica.ListaGenericaEnlazada;

public class ColaGenerica<T> {
    private ListaGenericaEnlazada<T> pila;
    
    public ColaGenerica(){
        pila = new ListaGenericaEnlazada<T>();
    }

    public void encolar(T elem){
        this.pila.agregarFinal(elem);
    }

    public T desencolar(){
        T aux = this.pila.elemento(0);
        this.pila.eliminarEn(0);
        return aux;
    }

    public T tope(){
        return this.pila.elemento(0);
    }

    public boolean esVacia(){
        return this.pila.esVacia();
    }

    @Override
    public String toString() {
        return this.pila.toString();
    }
}
