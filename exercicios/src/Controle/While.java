package Controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int QuantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while ( nota != -1) {
			System.out.print("Digite uma nota Válida:");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total+= nota;
				QuantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota invalida");
			}
		}
		double media = total / QuantidadeDeNotas;
		System.out.println("Média =" + media);
		
		entrada.close();
		
	}

}
