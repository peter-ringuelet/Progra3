package DispositivosMoviles;

public class SmartPhone extends Movile {	
	private int numero;

	public SmartPhone() {};

	public SmartPhone(String marca, String sistemaOperativo, String modelo, int costo, int numero) {
		super(marca, sistemaOperativo, modelo, costo);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() +" SmartPhone [numero=" + numero + "]";
	}
	
	
	
	

}
