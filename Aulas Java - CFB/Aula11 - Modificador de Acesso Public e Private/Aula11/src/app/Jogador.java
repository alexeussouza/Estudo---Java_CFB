package app;

public class Jogador extends Pessoa{
	
	protected int Idade;
	protected int salario;
	
	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public  void Info(Jogador j) {
		
		System.out.println("\n\n::......  Dados Jogador  .....::");
		System.out.printf("Idade: %d", j.Idade );
		System.out.printf("\nSalario: %d", j.salario);
	}	
}
