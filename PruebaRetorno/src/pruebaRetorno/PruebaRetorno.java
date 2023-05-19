package pruebaRetorno;
import java.util.Scanner;

public class PruebaRetorno {
	
	public static void main(String[]args) {
		int[] arreglo = new int[10];
		cargarArreglo(arreglo);
		Resultado resultado = new Resultado();
		procesarArreglo(arreglo,resultado);
		System.out.println("El mayor numero es: " + resultado.getMax());
		System.out.println("El menor numero es: " + resultado.getMin());
		System.out.println("El promedio es: " + resultado.getPromedio());
		
	}
	
	
	public static void procesarArreglo(int arreglo[], Resultado resultado) {
		int tot = 0;
		int elementos = 0;
		resultado.setMin(999999);
		resultado.setMax(-1);
		for (int elemento : arreglo) {
			elementos++;
			tot+=elemento;
			if (elemento < resultado.getMin()) resultado.setMin(elemento);
			if (elemento > resultado.getMax()) resultado.setMax(elemento);
		}
		resultado.setPromedio(tot / elementos);
		
	}
	
	public static void cargarArreglo(int[] arreglo) {
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i < arreglo.length; i++) {
			System.out.print("Ingrese un numero: ");
			arreglo[i] = scanner.nextInt();
		}
		scanner.close();
	}

}
