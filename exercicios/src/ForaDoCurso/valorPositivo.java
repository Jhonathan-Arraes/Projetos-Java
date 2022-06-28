package ForaDoCurso;

import java.util.Scanner;

public class valorPositivo {

	public static void main(String[] args) {
		
		int valor = 0;
		Scanner imput = new Scanner(System.in);
		
		while (valor >= 0 ){
			System.out.println("Digite um valor positivo:");
			valor = imput.nextInt();
		}
		
		imput.close();
	}
}
 