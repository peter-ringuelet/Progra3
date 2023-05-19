package DispositivosMoviles;

public class Movile {
	private String marca;
	private String sistemaOperativo;
	private String modelo;
	private int costo;
	
	public Movile() {};
	
	public Movile(String marca, String sistemaOperativo, String modelo, int costo) {
		super();
		this.marca = marca;
		this.sistemaOperativo = sistemaOperativo;
		this.modelo = modelo;
		this.costo = costo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	public boolean equals(Object o) {
		boolean result=false;
		if ((o!=null) && (o instanceof Movile)){
			Movile m=(Movile)o;
			if ((m.getMarca()==this.getMarca())
			&&(m.getSistemaOperativo() ==this.getSistemaOperativo())
			&&(m.getModelo()==this.getModelo())
			&&(m.getCosto()==this.getCosto()))result=true; 
			}
		return result; 
	}

	@Override
	public String toString() {
		return "Movile [marca=" + marca + ", sistemaOperativo=" + sistemaOperativo + ", modelo=" + modelo + ", costo="
				+ costo + "]";
	}
	
	
	
	
	
}
