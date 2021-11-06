package ProjetoConversor;

import java.awt.event.ActionEvent;

public class Conversor {

	
	public static int OpçãoEntrada;
	public static int OpçãoSaida;
	public static String [] moedas = {"Dólar americano", "Real brasileiro", "Euro", "Yene japonês", "Yuan chinês", "Libra esterlina", "Dólar australiano", "Dólar canadense",
			"Franco suíço", "Won coreano", "Peso mexicano", "Rupia indiana", "Rublos russos", "Rand sul africano", "Lira turca"};
	public static Double ValorSaida =0.0 ;
	public static Double ValorEntrada=0.0;
	
	public static Double [] taxas = {1.0,5.60,0.87,113.83,5.40, 0.7412,1.3522,0.9141,0.2996,20.4984,74.5026,71.3629,15.1559,9.7044};

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Iniciação do método frame
		
		new ConversorFrame();
		
		
		


		
		
		
	}
	//Métodos de cálculo
	void converterEntrada() {
		ValorEntrada = ValorEntrada/taxas[OpçãoEntrada];
	}
	void converterSaida() {
		ValorSaida = ValorEntrada*taxas[OpçãoSaida];
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
