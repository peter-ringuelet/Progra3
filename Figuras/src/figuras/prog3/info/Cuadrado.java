package figuras.prog3.info;

public class Cuadrado extends Rectangulo {

	public Cuadrado() {}
	
	public Cuadrado(double lado) {
		super(lado,lado);
	}

	public Cuadrado(String color, boolean relleno, double lado) {
		super(color, relleno, lado, lado);
	}
	
	public double getLado() {
		return super.getAncho();
	}
	public void setLado(double lado) {
		super.setAncho(lado);
		super.setLargo(lado);
	}
	public void setAncho(double lado) {
		super.setAncho(lado);
	}
	public void setLargo(double lado) {
		super.setLargo(lado);
	}
	public String toString() {
		return super.toString();
	}
	

}
