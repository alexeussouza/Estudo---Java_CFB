package app;

import java.text.DecimalFormat;

public class Aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=80;
		int media=60;
		String res;
		int pos=5;
		double valor = 2.56789;
		
		
		DecimalFormat df = new DecimalFormat("0.##");
		String dx = df.format(valor);
        System.out.print(dx);
		
		
		
		if(n1>media) {
			System.out.print("\n\nAprovado");
		}
		else if(n1 >=50) {
			System.out.print("Recuperacao");
		}else {
			
			System.out.print("Reprovado");
		}
		
		res =(n1 >=media ? "\nAprovado" : "Reprovado"); //Operador ternário em java
		
		System.out.print("\n\nResultado: " + res);
		
		switch (pos) {
		case 1: 
			System.out.print("\nPrimeiro lugar");
			break;
		case 2: 
			System.out.print("\nSegundo lugar");
			break;
		case 3: 
			System.out.print("\nTerceiro lugar");
			break;
		case 4: case 5: case 6:
			System.out.print("\nPremio de participacao");
			break;
		default:
			System.out.print("\nNão foi classificado");
			break;
		}
		
		
	}
}
