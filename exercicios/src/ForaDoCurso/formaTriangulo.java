package ForaDoCurso;

import java.util.Scanner;

public class formaTriangulo {
	
	public static void main(String[] args) {
		
		double l1 = 0;
		double l2 = 0;
		double l3 = 0;
		Scanner imput = new Scanner(System.in);
				
		System.out.println("digite os tres lados:");
		l1 = imput.nextDouble();
		l2 = imput.nextDouble();
		l3 = imput.nextDouble();
		
		if ( l1 < l2 + l3 || l2 < l1 + l3 || l3 < l1 + l2) {
			
			if ( l1 == l2 && l1 == l3) {
				System.out.println("Triângulo equilátero!"); 
			} else if (l1 != l2 && l1 != l3 && l2 != l3) {
				System.out.println("Triângulo escaleno");
			} else {
				System.out.println("Triângulo retângulo");
			}
			
		} else {
			System.out.println("Não é um triângulo!");
		}
		
		imput.close();
		
	}

}
