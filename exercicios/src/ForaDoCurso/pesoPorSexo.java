package ForaDoCurso;

import java.util.Scanner;

public class pesoPorSexo {

	public static void main(String[] args) {
		double altura = 0;
		double peso = 0;
		double imc = 0;
		String sexo = "";
		Scanner imput = new Scanner(System.in);

		System.out.println("Qual o sexo?");
		sexo = imput.next();

		System.out.println("Digite o peso:");
		peso = imput.nextDouble();

		System.out.println("Digite a altura:");
		altura = imput.nextDouble();

		imc = peso / (altura * altura);
		
		if ("M".equalsIgnoreCase(sexo)) {
			
			if (imc < 20) {
				System.out.println(" Masculino; Abaixo do peso! " + imc);
			} else if (imc >= 20 && imc < 25) {
				System.out.println("Masculino; Peso ideal! " + imc);
			} else {
				System.out.println("Masculino; Acima do peso! " + imc);
			}
			
		} else if ("F".equalsIgnoreCase(sexo))
		
			if (imc < 19) {
				System.out.println("Feminino; Abaixo do peso! " + imc);
			} else if (imc >= 19 && imc < 24) {
				System.out.println("Feminino; Peso ideal! " + imc);
			} else {
				System.out.println("Feminino; Acima do peso! " + imc);
			}
			
			imput.close();
	}

}
