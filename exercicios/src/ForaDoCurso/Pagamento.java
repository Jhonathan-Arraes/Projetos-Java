package ForaDoCurso;

import java.util.Scanner;

public class Pagamento {
	public static void main(String[] args) {
		
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double p4 = 0;
		double p5 = 0;
		double soma = 0;
		double troco = 0;
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Qual o valor do 5 produtos?");
		p1 = imput.nextDouble();
		p2 = imput.nextDouble();
		p3 = imput.nextDouble();
		p4 = imput.nextDouble();
		p5 = imput.nextDouble();
		
		soma = p1 + p2 + p3 + p4 + p5;
		
		System.out.println("Qual o valor a ser pago?");
		troco = imput.nextDouble();
		
		System.out.println("O troco é : R$" + (troco - soma));
		
		imput.close();
	}

}
