package prog3.pilagenerica;

import prog3.listagenerica.ListaGenericaEnlazada;

public class PilaGenerica<T> {
    private ListaGenericaEnlazada<T> pila;
    
    public PilaGenerica(){
        pila = new ListaGenericaEnlazada<T>();
    }

    public void apilar(T elem){
        this.pila.agregarInicio(elem);
    }

    public T desapilar(){
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