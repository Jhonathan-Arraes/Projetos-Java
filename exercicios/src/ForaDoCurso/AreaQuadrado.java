package ForaDoCurso;

import java.util.Scanner;

public class AreaQuadrado {
	
	public static void main(String[] args) {
		
		double lado = 0;
		//double area = 0;		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual a medida do lado do quadrado? ");
		lado = valor.nextDouble();
		
		//area = lado * lado;
		
		System.out.println("A área do quadrado é " + lado * lado + "cm2");
		
		valor.close();
	}

}
