package ForaDoCurso;

import java.util.Scanner;

public class tabuada1ao20 {
	public static void main(String[] args) {
		
		String enter = "";
		int r = 0;
		
		Scanner imput = new Scanner(System.in);
		
		for (int i = 0; i == 20; i++) {
			for(int j = 0; j == 10; j++) {
				
				r = i * j;
				System.out.println(r);
				enter = imput.next();
				
			}
		}
		
		imput.close();
	}

}
