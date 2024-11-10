package Computador;

public class Processador {
	private String modelo;
	private String marca;
	private float clock;
	private float cache;
	
	public Processador() {
		
	}
	
	public Processador(String modelo, String marca, float clock, float cache) {
		this.modelo = modelo;
		this.marca = marca;
		this.clock = clock;
		this.cache = cache;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getClock() {
		return clock;
	}
	public void setClock(float clock) {
		this.clock = clock;
	}
	public float getCache() {
		return cache;
	}
	public void setCache(float cache) {
		this.cache = cache;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Processador [modelo=");
		builder.append(modelo);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", clock=");
		builder.append(clock);
		builder.append(", cache=");
		builder.append(cache);
		builder.append("]");
		return builder.toString();
	}
	
}
