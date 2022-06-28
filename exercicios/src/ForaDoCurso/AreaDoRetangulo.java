package ForaDoCurso;

import java.util.Scanner;

public class AreaDoRetangulo {
	
	public static void main(String[] args) {
	
		double area = 0;
		double altura = 0;
		double largura = 0;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite a altura do retângulo");
		altura = valor.nextDouble();
		
		System.out.println("Digite a largura do retângulo");
		largura =  valor.nextDouble();
		
		area = largura * altura;
		
		System.out.println(" a Área do retângulo é " + area);
		
		valor.close();
	}
	

}
