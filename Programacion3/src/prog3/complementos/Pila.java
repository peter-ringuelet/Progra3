package prog3.complementos;

public class Pila<T> {
    private Nodo<T> tope;

    public Pila() {
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void apilar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(tope);
        tope = nuevo;
    }

    public T desapilar() {
        if (estaVacia()) {
            return null;
        }
        T dato = tope.getDato();
        tope = tope.getSiguiente();
        return dato;
    }

    public T verTope() {
        if (estaVacia()) {
            return null;
        }
        return tope.getDato();
    }
}



