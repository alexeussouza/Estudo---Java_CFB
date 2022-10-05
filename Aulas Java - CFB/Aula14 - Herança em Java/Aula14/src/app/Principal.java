package app;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Carro c1 = new Carro("Ferrari");
		Carro c2 = new Carro("Porche");
		
		CarroCombate c3 = new CarroCombate("Leopardo", 100);
		CarroCombate c4 = new CarroCombate("Pantera", 50);
		
		c4.Atirar();
		c4.Atirar();
		c4.Atirar();
		c4.Atirar();
		c4.Atirar();
		c4.Atirar();
		c3.sofrerDano(30);
		c1.sofrerDano(5);
		
		c1.info();
		c2.info();
		c3.info();
		c4.info();
		

	}

}
