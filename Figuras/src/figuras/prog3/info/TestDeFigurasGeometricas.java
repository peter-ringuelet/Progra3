package figuras.prog3.info;

public class TestDeFigurasGeometricas {

	public static void main(String[] args) {
		Figura [] arreglo = new Figura[3];
		arreglo[0] = new Circulo("Rojo", true, 5);
		arreglo[1] = new Rectangulo("Verde", false, 1, 3);
		arreglo[2] = new Cuadrado("Amarillo",false,6);
		for(Figura figura : arreglo) {
			System.out.println(figura.toString());
		}
		

	}

}
