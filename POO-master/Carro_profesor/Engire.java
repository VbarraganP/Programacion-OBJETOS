import java.util.Arrays;

public class Engire {
	private Wheel[] axle;
	private String marca;
	private double potencia;
	
	public Engire(String marca, double potencia) {
		this.marca = marca;
		this.potencia = potencia;
	}

	public Wheel[] getAxle() {
		return axle;
	}

	public void setAxle(Wheel[] axle) {
		this.axle = axle;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Engire [axle=" + Arrays.toString(axle) + ", marca=" + marca + ", potencia=" + potencia + "]";
	}
	
	
	

}
