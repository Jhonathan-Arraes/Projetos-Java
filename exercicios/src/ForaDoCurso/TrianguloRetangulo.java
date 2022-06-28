package ForaDoCurso;

import java.util.Scanner;

public class TrianguloRetangulo {
	public static void main(String[] args) {
		
		double h = 0;
		double c1 = 0;
		double c2 = 0;
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Digite a hipotenusa;");
		h = imput.nextDouble();
		System.out.println("Digite os catetos:");
		c1 = imput.nextDouble();
		c2 = imput.nextDouble();
		
		if ( h * h == (c1 * c1) + (c2 * c2)) {
			System.out.println("Triangulo retângulo");
		} else {
			System.out.println("Não é um triangulo retângulo");
		}
		
		imput.close();
	}

}
