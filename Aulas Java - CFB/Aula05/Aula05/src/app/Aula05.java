package app;

import java.util.Scanner;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int tam=5; // declaração de uma constante do tipo int
		
		int[] numero = new int[tam];
		
		char[] gabarito = {'a', 'a', 'd', 'b', 'c'};
		
		char[] resposta = new char[tam];
		
		char[] respostaB = new char[tam];
		
		int nota=0, notab=0;
		
		Scanner scan = new Scanner(System.in);
		
		resposta[0]='a';
		resposta[1]='a';
		resposta[2]='d';
		resposta[3]='b';
		resposta[4]='c';
		
		for (int i = 0; i < tam; i++) {
			
			if(resposta[i]==gabarito[i])
				nota++;
			
		}
		
		System.out.printf("\nNota do aluno %d", nota);
		
		for (int i = 0; i < tam; i++) {
			
			System.out.println("Informe sua resposta");
			respostaB[i] = scan.next().charAt(0);
			
		}
		
		for (int i = 0; i < tam; i++) {
			
			if(respostaB[i]==gabarito[i])
				notab++;
			
		}
		
		System.out.printf("\nNotaB do aluno %d", notab);
		
		numero[0] = 1;
		numero[1] = 3;
		numero[2] = 5;
		numero[3] = 7;
		numero[4] = 9;
		
		for (int i = 0; i < tam; i++) {
			
			System.out.printf("\nValor: %d", numero[i]);
			
		}
		
		System.out.printf("\n");
		
		for (int i = 0; i < numero.length; i++) {
			
			System.out.printf("\nValor: %d", numero[i]);
			
		}
		
		
		
		

	}

}
