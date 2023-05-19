package figuras.prog3.info;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo() {}

	public Circulo(String color, boolean relleno, double radio) {
		super(color, relleno);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return(3.14159 * this.getRadio() * this.getRadio());
	}
	
	public double getPerimetro() {
		return(2 * 3.14159 * this.getRadio());
	}
	
	public String toString() {
		return(super.toString()+"-"+this.getRadio()+"-"+this.getArea()+"-"+this.getPerimetro());
	}

}
