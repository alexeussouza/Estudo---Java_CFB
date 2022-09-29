package app;

public class Professor {
	
	private String Cargo;
	private int CargaHoraria;
	private double salarioHora;
	
	public String getCargo() {
		return Cargo;
	}
	
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	
	public int getCargaHoraria() {
		return CargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	
	public double getSalarioHora() {
		return salarioHora;
	}
	
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
}
