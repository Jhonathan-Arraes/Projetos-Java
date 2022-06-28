package ForaDoCurso;

import java.util.Scanner;

public class ConversaoMoeda {
	public static void main(String[] args) {
		
		double dolar = 0;
		double cotacao = 0;
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Qual o valor do dólar?");
		cotacao = imput.nextDouble();
		
		System.out.println("Qual o valor para conversão?");
		dolar = imput.nextDouble();
		
		System.out.println("O valor em real é: R$" + cotacao * dolar);
		
		imput.close();
	}

}
