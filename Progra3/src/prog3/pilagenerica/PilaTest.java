package prog3.pilagenerica;

public class PilaTest {

	public static void main(String[] args) {
		PilaGenerica<String> pila = new PilaGenerica<String>();
		pila.apilar("a");
		pila.apilar("b");
		pila.apilar("c");
		pila.apilar("d");
		pila.apilar("e");
		System.out.println(pila.toString());
		pila.desapilar();
		System.out.println(pila.toString());
		pila.desapilar();
		System.out.println(pila.toString());
		pila.desapilar();
		System.out.println(pila.toString());
		pila.desapilar();
		System.out.println(pila.toString());
		System.out.println("El elemento en el tope de la pila es: " + pila.tope());
	}

}
