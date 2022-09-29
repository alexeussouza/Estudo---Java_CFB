package app;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		canal();
		RecebeTexto(":... Curso de JSF ...:");
		RetornaMensagem();
		
		System.out.printf("\n\nResultado Integer: %d", Somar(11,2,7,9,6));
		System.out.printf("\n\nResultado Double: %f", Somar(13.5, 7.1,4.3,9.4,2.3,8.7));

	}
	
	public static void canal() {
		
		System.out.println("\n***:: Aula 09 - Java ::***");
	}
	
	public static void RecebeTexto(String m) {
		
		System.out.printf("%n***:: %s::***", m);
	}
	
	public static void RetornaMensagem() {
		
		System.out.printf("%n\n:.. Flutter com Dart ..:");
	}
	
	public static int Somar(int...numero) { // lista de valores, recebe uma quantidade indefinidade parametros do mesmo tipo.
		
		int cont=0;
		
		for (int n : numero) {
			cont+=n;
		}
		return cont;
	}
	
	public static double Somar(double...numero) { // Sobrecarga metodo Somar()
		
		double cont=0;
		
		for (double n : numero) {
			cont+=n;
		}
		return cont;
	}
}
