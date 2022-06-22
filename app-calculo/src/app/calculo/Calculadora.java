package app.calculo;

import app.calculo.interno.OperacoesAritmeticas;
import app.logging.Logger;

public class Calculadora {
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando");
		return opAritmeticas.soma(nums);
	}
	
	public Class<Logger> getLoggerClass() {
		return Logger.class;
	}

}
