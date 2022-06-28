package ForaDoCurso;

import java.util.Scanner;

public class SegundoMaior {
	public static void main(String[] args) {
		
		int v1 = 0;
		int v2 = 0;
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número;");
		v1 = imput.nextInt();
		
		while ( v1 > v2) {
			System.out.println("Digite o segundo numero maior que o primeiro:");
			v2 = imput.nextInt();
		}
		
		System.out.println("Voce digitou o segundo numero maior, sessão encerrada!");
		
		imput.close();
	}
	

}
