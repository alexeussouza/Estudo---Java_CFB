package app;

public class CarroCombate extends Carro{

	private final int MAX_ARMAMENTO = 100;
	private final int MIN_ARMAMENTO = 0;
	private int qtdArmamento;
	
	
	public CarroCombate(String nome, int blindagem) {
		super(nome); // passa o paramento nome para o construtor da classe pai
		setArmamento(true);
		setBlindagem(blindagem);
		this.qtdArmamento = 100;
		
	}
	
	public void setQtdArmamento(int qtdArmamento) {
		this.qtdArmamento += qtdArmamento;
		
		if(this.qtdArmamento > MAX_ARMAMENTO) { // verifica se qtdArmamento respeita limite maximo
			this.qtdArmamento = MAX_ARMAMENTO;
		}
		if(this.qtdArmamento < MIN_ARMAMENTO) {
			this.qtdArmamento = MIN_ARMAMENTO;
		}
	}
	
	public int getQtdArmamento() {
		return this.qtdArmamento;
	}
	
	public void Atirar() {
		
		if(this.qtdArmamento > MIN_ARMAMENTO) {
			setQtdArmamento(-1);
		}
		else {
			System.out.println("Sem munição");
		}
	}
	
	public void info() {
		super.info();
		System.out.printf("Qtd. Arm..........:%s%n", this.qtdArmamento);
		
	}


}
