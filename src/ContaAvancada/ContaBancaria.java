package ContaAvancada;

public class ContaBancaria {
	protected Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	protected Pessoa correntista;
	
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Pessoa getCorrentista() {
		return correntista;
	}
	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	
	
	
	public boolean deposito(double valor) {
		if(saldo > 0) {
			boolean podeDepositar = true;
			saldo = saldo + valor;
			System.out.println("Deposito realizado com sucesso");
			return podeDepositar;
		}else {
			boolean podeDepositar = false;
			saldo= saldo+ valor;
			if (saldo< 0) {
				System.out.println("Você ainda está nos devendo: R$:" + saldo);
				return podeDepositar;
			}else {
				podeDepositar = true;
				System.out.println("Você não está nos devendo: R$:" + saldo);
				return podeDepositar;
			}
		}
	}
	
	public boolean saque(double valor) {
		if(saldo> 0) {
			boolean podeSacar = true;
			saldo= saldo- valor;
			System.out.println("Saque realizado com sucesso");
			return podeSacar;
		}else {
			boolean podeSacar = false;
			saldo= saldo- valor;
			System.out.println("Você está nos devendo: R$:" + saldo);
			return podeSacar;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}
	
}
