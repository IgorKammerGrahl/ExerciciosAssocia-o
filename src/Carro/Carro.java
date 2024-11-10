package Carro;

public class Carro {
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	protected Motor m;
	protected Pessoa p;
	
	public Carro() {
		m = new Motor();
		p = new Pessoa();
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		if(fabricante.length() > 0)
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length() > 0)
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if(cor.length() > 0)
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano > 1950)
		this.ano = ano;
	}
	public Motor getM() {
		return m;
	}
	public void setM(Motor m) {
		this.m = m;
	}
	public Pessoa getP() {
		return p;
	}
	public void setP(Pessoa p) {
		this.p = p;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [fabricante=");
		builder.append(fabricante);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", m=");
		builder.append(m);
		builder.append(", p=");
		builder.append(p);
		builder.append("]");
		return builder.toString();
	}
	
}
