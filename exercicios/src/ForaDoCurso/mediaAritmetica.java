package ForaDoCurso;

import java.util.Scanner;

public class mediaAritmetica {
	
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		double numero1 = 0;
		double numero2 = 0;
		double numero3 = 0;
		double numero4 = 0;
		//double media = 0;
		
		System.out.println("Digite os valores das notas:");
		numero1 = valor.nextDouble();
		numero2 = valor.nextDouble();
		numero3 = valor.nextDouble();
		numero4 = valor.nextDouble();
		
		System.out.println("A média é: " + (numero1 + numero2 + numero3 + numero4)/4);

		valor.close();
	}

}
