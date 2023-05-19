package DispositivosMoviles;

public class Tablet extends Movile {
	private int pulgadas;

	public Tablet() {};

	

	public Tablet(String marca, String sistemaOperativo, String modelo, int costo, int pulgadas) {
		super(marca, sistemaOperativo, modelo, costo);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	
	public boolean equals(Object o){
		boolean result=false;
		if ((o!=null) && (o instanceof Tablet)){
				Tablet t=(Tablet)o;
				if ((super.equals(o))&& (t.getPulgadas()==this.getPulgadas()) )result=true; 
		}
		return result; 
	}



	@Override
	public String toString() {
		return super.toString() +" Tablet [pulgadas=" + pulgadas + "]";
	}

	


	
}

