package Herança;

public class AcelerarCarro {
	public static void main(String[] args) {
	
		Carro carro1 = new Prisma();
		
		carro1.acelerar();
		System.out.println(carro1);
		
		carro1.acelerar();
		System.out.println(carro1);
		
		carro1.acelerar();
		System.out.println(carro1);
		
	}
}