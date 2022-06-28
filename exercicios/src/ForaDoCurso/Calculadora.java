package ForaDoCurso;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		double v1 = 0;
		double v2 = 0;
		String op = "";
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Quais os valores?");
		v1 = imput.nextDouble();
		v2 = imput.nextDouble();
		
		System.out.println("Qual a operação?");
		op = imput.next();
		
		if("+".equals(op)) {
			System.out.println(v1 + v2);
		} else if ("-".equals(op)) {
			System.out.println(v1 - v2);
		} else if ("/".equals(op)) {
			if (v1 != 0 && v2 != 0 ) {
				System.out.println(v1 / v2);
			} else {
				System.out.println("Operação inválida");
			}
			
		} else if ("*".equals(op)) {
			System.out.println(v1 * v2);
		} else {
			System.out.println("Sinal invalido!");
		}
		
		imput.close();
		
	}

}
