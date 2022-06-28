package ForaDoCurso;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
	
		//double area = 0;
		double base = 0;
		double altura = 0;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual a altura do triângulo? ");
		altura = valor.nextDouble();
		
		System.out.println("Qual a base do triângulo? ");
		base = valor.nextDouble();
		
		System.out.println("A área do triângulo é: " + (base * altura) / 2 + "cm2");
		
		valor.close();

		
	}
	
	
}
