package ForaDoCurso;

import java.util.Scanner;

public class Peso {
	public static void main(String[] args) {
		
		double altura = 0;
		double peso = 0;
		double imc = 0;
		Scanner imput = new Scanner(System.in);
		
		
		System.out.println("Digite o peso:");
		peso = imput.nextDouble();
		
		System.out.println("Digite a altura:");
		altura = imput.nextDouble();
		
		imc = peso /(altura * altura);
		
//		System.out.println(imc);
		
		if (imc < 20) {
			System.out.println("Abaixo do peso! " + imc); 
		} else if (imc >= 20 && imc < 25) {
			System.out.println("Peso ideal! " + imc);
		} else {
			System.out.println("Acima do peso! " + imc);
		}
		
		imput.close();
	}

}
