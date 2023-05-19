package figuras.prog3.info;

public class Rectangulo extends Figura{
	private double ancho;
	private double largo;

	public Rectangulo() {}

	public Rectangulo(double ancho, double largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}

	public Rectangulo(String color, boolean relleno, double ancho, double largo) {
		super(color, relleno);
		this.ancho = ancho;
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double getArea() {
		return(this.getAncho()*this.getLargo());
	}
	
	public double getPerimetro() {
		return(this.getAncho() + this.getLargo());
	}
	
	public String toString() {
		return(super.toString()+"-"+this.getAncho()+"-"+this.getLargo()+"-"+this.getArea()+"-"+this.getPerimetro());
	}
	
	

}
