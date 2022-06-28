package ForaDoCurso;

import java.util.Scanner;

public class QualSexo {
	public static void main(String[] args) {
		
		String sexo = "";
		Scanner imput = new Scanner(System.in);
		
		do {
			System.out.println("Qual o sexo?");
			sexo = imput.next();
			
		} while (!sexo.equalsIgnoreCase("m") || !sexo.equalsIgnoreCase("f"));
		
		imput.close();
		
	}

}
