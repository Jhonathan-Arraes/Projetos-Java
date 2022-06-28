package ForaDoCurso;

import java.util.Scanner;

public class ConversaoTemperaturaCParaF {
	
	public static void main(String[] args) {
	
		double  c = 0;
		
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celsius?");
		c = temp.nextDouble();
		
		System.out.println("A temperatura em Fahrenheit é: " + (9 * c + 160 ) / 5);
		
		temp.close();

	}
}
