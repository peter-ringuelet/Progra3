package prog3.colagenerica;

public class TestCola {

	public static void main(String[] args) {
		ColaGenerica<Integer> cola = new ColaGenerica<>();
		cola.encolar(1);
		cola.encolar(2);
		cola.encolar(3);
		cola.encolar(4);
		while(!cola.esVacia()) {
			System.out.println(cola.desencolar());
		}
	}

}
