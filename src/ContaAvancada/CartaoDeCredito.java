package ContaAvancada;

public class CartaoDeCredito {
	private int numero;
	private String operadora;
	private String tipoDeCartao;
	private double limite;
	
	public CartaoDeCredito() {
		
	}
	
	public CartaoDeCredito(int numero, String operadora, String tipoDeCartao, double limite) {
		this.numero = numero;
		this.operadora = operadora;
		this.tipoDeCartao = tipoDeCartao;
		this.limite = limite;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getTipoDeCartao() {
		return tipoDeCartao;
	}
	public void setTipoDeCartao(String tipoDeCartao) {
		this.tipoDeCartao = tipoDeCartao;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CartaoDeCredito [numero=");
		builder.append(numero);
		builder.append(", operadora=");
		builder.append(operadora);
		builder.append(", tipoDeCartao=");
		builder.append(tipoDeCartao);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}
	
}
