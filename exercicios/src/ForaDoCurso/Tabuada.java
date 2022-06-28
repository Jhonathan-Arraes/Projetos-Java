package ForaDoCurso;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

		int n = 0;
		int r = 0;
		int intervalo1 = 0;
		int intervalo2 = 0;

		Scanner imput = new Scanner(System.in);

		System.out.println("Qual o valor para tabuada?");
		n = imput.nextInt();

		if (n >= 0) {

			System.out.println("Qual o valor do primeiro intervalo?");
			intervalo1 = imput.nextInt();

			do {
				System.out.println("Qual o valor do segundo intervalo (precisa ser maior que o primeiro valor)?");
				intervalo2 = imput.nextInt();

			} while (intervalo2 < intervalo1);

			for (int i = intervalo2; i >= intervalo1; i--) {

				r = i * n;
				System.out.println(r);
			}
			
		} else {
			System.out.println("Valor Invalido");
		}

		imput.close();
	}

}
