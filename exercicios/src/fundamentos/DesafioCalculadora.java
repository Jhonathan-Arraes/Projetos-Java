package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os números desejados");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		
		System.out.println("Qual operação?");
		String oper = entrada.next();
		
		double resultado = "+".equals(oper) ? num1 + num2 : 0;
		resultado = "-".equals(oper) ? num1 - num2 : resultado;
		resultado = "*".equals(oper) ? num1 * num2 : resultado;
		resultado = "/".equals(oper) ? num1 / num2 : resultado;
		resultado = "%".equals(oper) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, oper, num2, resultado);
		entrada.close();
		
	}

}
