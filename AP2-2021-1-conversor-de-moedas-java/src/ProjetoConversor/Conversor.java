package ProjetoConversor;

import java.awt.event.ActionEvent;

public class Conversor {

	
	public static int Op��oEntrada;
	public static int Op��oSaida;
	public static String [] moedas = {"D�lar americano", "Real brasileiro", "Euro", "Yene japon�s", "Yuan chin�s", "Libra esterlina", "D�lar australiano", "D�lar canadense",
			"Franco su��o", "Won coreano", "Peso mexicano", "Rupia indiana", "Rublos russos", "Rand sul africano", "Lira turca"};
	public static Double ValorSaida =0.0 ;
	public static Double ValorEntrada=0.0;
	
	public static Double [] taxas = {1.0,5.60,0.87,113.83,5.40, 0.7412,1.3522,0.9141,0.2996,20.4984,74.5026,71.3629,15.1559,9.7044};

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Inicia��o do m�todo frame
		
		new ConversorFrame();
		
		
		


		
		
		
	}
	//M�todos de c�lculo
	void converterEntrada() {
		ValorEntrada = ValorEntrada/taxas[Op��oEntrada];
	}
	void converterSaida() {
		ValorSaida = ValorEntrada*taxas[Op��oSaida];
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
