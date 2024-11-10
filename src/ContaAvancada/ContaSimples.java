package ContaAvancada;

public class ContaSimples extends ContaBancaria{
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPoupanca(double valor) {
		if(saldoPoupanca > 0) {
			boolean podeDepositar = true;
			saldoPoupanca = saldoPoupanca + valor;
			System.out.println("Deposito realizado com sucesso");
			return podeDepositar;
		}else {
			boolean podeDepositar = false;
			saldoPoupanca = saldoPoupanca + valor;
			if (saldoPoupanca < 0) {
				System.out.println("Você ainda está nos devendo: R$:" + saldoPoupanca);
				return podeDepositar;
			}else {
				podeDepositar = true;
				System.out.println("Você não está nos devendo: R$:" + saldoPoupanca);
				return podeDepositar;
			}
		}
	}
	
	public boolean saquePoupanca(double valor) {
		if(saldoPoupanca > 0) {
			boolean podeSacar = true;
			saldoPoupanca = saldoPoupanca - valor;
			System.out.println("Saque realizado com sucesso");
			return podeSacar;
		}else {
			boolean podeSacar = false;
			saldoPoupanca = saldoPoupanca - valor;
			System.out.println("Você está nos devendo: R$:" + saldoPoupanca);
			return podeSacar;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
