package Carro;

public class Motor {
	private String motor;
	private float potencia;
	private int cilindros;
	private String combustivel;
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		if(motor.length() > 0)
		this.motor = motor;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		if(potencia > 0)
		this.potencia = potencia;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		if(cilindros > 0)
		this.cilindros = cilindros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		if(combustivel.length() > 0)
		this.combustivel = combustivel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [motor=");
		builder.append(motor);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", cilindros=");
		builder.append(cilindros);
		builder.append(", combustivel=");
		builder.append(combustivel);
		builder.append("]");
		return builder.toString();
	}

}
