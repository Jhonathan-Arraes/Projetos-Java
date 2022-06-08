package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Quantas notas? ");
		int quantidade = entrada.nextInt();
		
		double nota[] = new double [quantidade];
		
		for (int i  = 0; i < nota.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ":");
			nota[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for (double notap : nota ) {
			total += notap;
		}
		
		System.out.println("A médida é " + total / nota.length + "!");
		entrada.close();
	}

}
