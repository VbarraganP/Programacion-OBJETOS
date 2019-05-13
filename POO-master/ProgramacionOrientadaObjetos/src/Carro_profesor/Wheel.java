
public class Wheel {
	private String marca;
	private int diametro;
	private Engire axle;
	
	public Wheel(String marca, int diametro) {
		this.marca = marca;
		this.diametro = diametro;
	}
	
	public Engire getAxle() {
		return axle;
	}
	public void setAxle(Engire axle) {
		this.axle = axle;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	@Override
	public String toString() {
		return "Wheel [marca=" + marca + ", diametro=" + diametro + "]";
	}

	
	
	
	

}
