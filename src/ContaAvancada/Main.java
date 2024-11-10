package ContaAvancada;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Igor", "Boa Vista");
		Banco b = new Banco(1435, "Bradesco", 16785);
		CartaoDeCredito cc = new CartaoDeCredito(144353643, "Visa", "De pagar", 2340);
		
		ContaEspecial ce = new ContaEspecial();
		
		ce.setAgencia(12453222);
		ce.setBanco(b);
		ce.setCartao(cc);
		ce.setCorrentista(p);
		ce.setDiasSemJuros(14);
		ce.setLimite(2444);
		ce.setNumeroDaConta(144353444);
		ce.setSaldo(3450);
		
		System.out.println(ce);

		ContaSimples cs = new ContaSimples();
		
		cs.setAgencia(1452353);
		cs.setBanco(b);
		cs.setCorrentista(p);
		cs.setNumeroDaConta(2453446);
		cs.setSaldo(5000);
		cs.setSaldoPoupanca(2500);
		boolean depositoPoupanca = cs.deposito(15);
		boolean saquePoupanca = cs.saquePoupanca(5000);
		boolean saqueErrado = cs.saquePoupanca(200);
		boolean depositoErrado = cs.depositoPoupanca(120);
		System.out.println(cs);
		System.out.println(depositoPoupanca);
		System.out.println(saquePoupanca);
		System.out.println(saqueErrado);
		System.out.println(depositoErrado);
		
		 ContaBancaria cb = new ContaBancaria();
		 
		 cb.setAgencia(1243);
		 cb.setBanco(b);
		 cb.setCorrentista(p);
		 cb.setNumeroDaConta(62864873);
		 cb.setSaldo(7500);
		 cb.saque(7499);
		 cb.saque(10);
		 boolean saque = cb.saque(20);
		 System.out.println(cb);
		 System.out.println(saque);	 
	}

}
