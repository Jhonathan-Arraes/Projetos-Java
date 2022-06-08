package classe;

public class DataAtr {
	int dia;
	int mes;
	int ano;
	
	DataAtr () {
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	DataAtr (int dia1, int mes1, int ano1){
		dia = dia1;
		mes = mes1;
		ano = ano1;
				
	}
	String obterDataFormatada() {
	return String.format("%d/%d/%d", dia, mes, ano);
	}
	
}
