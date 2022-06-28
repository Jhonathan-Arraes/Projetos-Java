package ForaDoCurso;

import java.util.Scanner;

public class areaDoRetanguloGrande {
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
		
		if (area > 100) {
			System.out.println("Terreno Grande");
		} else {
			System.out.println(" a Área é " + area);
		}
		
		
		
		valor.close();
	}

}
