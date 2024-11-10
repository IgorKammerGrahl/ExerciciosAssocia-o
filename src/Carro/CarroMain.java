package Carro;

public class CarroMain {

	public static void main(String[] args) {
		Pessoa pe = new Pessoa();
		Motor mo = new Motor();
		Carro c = new Carro();
		
		pe.setEndereco("Rua Girassol");
		pe.setNome("Giovani");
		mo.setCilindros(2);
		mo.setCombustivel("Etanol");
		mo.setMotor("Motor Bom");
		mo.setPotencia(15);
		
		System.out.println(pe);
		System.out.println(mo);
		
		c.setAno(2004);
		c.setCor("Vermelho");
		c.setFabricante("Toyota");
		c.setM(mo);
		c.setP(pe);
		
		System.out.println(c);
	}

}
