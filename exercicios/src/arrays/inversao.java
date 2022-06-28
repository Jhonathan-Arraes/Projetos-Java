package arrays;

public class inversao {
	
	public static void main(String[] args) {
		
		int[] valor = new int [5];
		valor[0] = 1;
		valor[1] = 2;
		valor[2] = 3;
		valor[3] = 4;
		valor[4] = 5; 
		
		int resultado = 0;
		for(int i = 0; i <= 4; i ++) {
			resultado = valor[i];
			}
		for(int i = resultado; i > 0; i--) {
			System.out.println(i);
		}
	}

}
