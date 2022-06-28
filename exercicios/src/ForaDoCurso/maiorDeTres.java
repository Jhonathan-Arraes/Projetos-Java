package ForaDoCurso;

import java.util.Scanner;

public class maiorDeTres {
	
public static void main(String[] args) {
	
	int n1 = 0;
	int n2 = 0;
	int n3 = 0;
	
	Scanner imput = new Scanner(System.in);
	
	System.out.println("Digite os tres valores:");
	n1 = imput.nextInt();
	n2 = imput.nextInt();
	n3 = imput.nextInt();
	
	if (n1 > n2 && n1 > n3) {
		System.out.println("O maior é" + n1);
	} else if (n2 > n1 && n2 > n3){
		System.out.println("O maior é" + n2);
	} else {
		System.out.println("O maior é" + n3);
	}
	
	imput.close();
}

}
