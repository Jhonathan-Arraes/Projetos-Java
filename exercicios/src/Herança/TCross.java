package Herança;

public class TCross extends Carro {
	
	TCross() {
		this(315);		
	}

	TCross(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
		
	}
	
//	@Oervrride
//	void acelerar() {
//		velocidadeAtual += 15;
//	}

}
