package app;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa(); // chama o construtor sem parametros
		
		p1.setNome("Alexandre de Souza");
		p1.setTelefone("61-99356-2526");
		p1.setEmail("alex@gmail.com");
		p1.setSexo("Masculino");
		p1.Info(p1);
		/////*********************************************************
		
		Jogador j1 = new Jogador();
		j1.setIdade(45);
		j1.setSalario(1500);
		j1.Info(j1);
		
		//***********************************************************
		
		Titular t1 = new Titular();
		t1.setContrato(25000000);
		t1.setTempoContrato(120);
		t1.setEmprestado(true);
		t1.Info(t1);
		
		//***********************************************************
	}
}
