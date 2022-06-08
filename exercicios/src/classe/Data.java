package classe;

import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		
		DataAtr data = new DataAtr();
		var data2 = new DataAtr();
		
		System.out.println(data2.obterDataFormatada());
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as data");
		data.dia = entrada.nextInt();
		data.mes = entrada.nextInt();
		data.ano = entrada.nextInt();
		
		
		System.out.println("A data é = " + data.obterDataFormatada());
		
		
		
		
		entrada.close();
	}

}
