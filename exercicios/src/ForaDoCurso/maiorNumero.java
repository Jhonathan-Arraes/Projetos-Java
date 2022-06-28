package ForaDoCurso;

import java.util.Scanner;

public class maiorNumero {
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Digite os dois valores:");
		n1 = imput.nextInt();
		n2 = imput.nextInt();
		
		if (n1>n2) {
			System.out.println("O maior é" + n1);
		} else {
			System.out.println("O maior é" + n2);
		}
		
		imput.close();
	}

}
