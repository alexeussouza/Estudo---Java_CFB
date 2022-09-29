package app;

public class Pessoa {
	
	private String Nome;
	private String Sobrenome;
	private int Cpf;
	private String Email;
	private String Telefone;
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getSobrenome() {
		return Sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getTelefone() {
		return Telefone;
	}
	
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
}
