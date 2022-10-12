package app;

public class Formiga extends Animal{
	public boolean vivo;
	
	public Formiga() {
		// TODO Auto-generated constructor stub
		this.vivo = true;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer(int massa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.printf("Vivo...........: %s", this.vivo ? "Sim" : "Não");
	}

}
