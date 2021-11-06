package ProjetoConversor;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import javax.swing.SwingConstants;

public class ConversorFrame extends Conversor implements ActionListener{

	JButton bot�oConversor;
	JComboBox moedaEntrada;
	JComboBox moedaSaida;
	JTextField entradaValor;
	JTextField saidaValor;
	String resultado;
	//Declarando as v�ri�veis fora do m�todo de Frame para serem lidas pelo metodo Override
	
	ConversorFrame (){
		
		//Bot�es, entradas e saidas de texto, e comboboxes
		
		bot�oConversor = new JButton();
			bot�oConversor.setBackground(Color.LIGHT_GRAY);
			bot�oConversor.setFont(new Font("Tahoma", Font.PLAIN, 18));
			bot�oConversor.setText("Converter");
			bot�oConversor.setBorder(null);
			bot�oConversor.setBounds(176, 315, 100, 50);
			bot�oConversor.addActionListener(this);
		
		
		moedaEntrada = new JComboBox(moedas);
			moedaEntrada.setBorder(new LineBorder(new Color(30, 144, 255), 1, true));
			moedaEntrada.setBounds(155, 77, 130, 22);
			moedaEntrada.addActionListener(this);
			
		moedaSaida = new JComboBox(moedas);
			moedaSaida.setBounds(155, 180, 130, 22);
			moedaSaida.addActionListener(this);
		
		entradaValor = new JTextField();
			entradaValor.setBorder(new LineBorder(Color.BLACK, 1, true));
			entradaValor.setBounds(155, 254, 130, 22);
		
		saidaValor = new JTextField(resultado);
			saidaValor.setHorizontalAlignment(SwingConstants.CENTER);
			saidaValor.setBackground(Color.WHITE);
			saidaValor.setEditable(false);
			saidaValor.setBorder(null);
			saidaValor.setBounds(94, 493, 253, 22);
			
		//Labels presentes

		JLabel entrada = new JLabel();
			entrada.setLabelFor(moedaEntrada);
			entrada.setBounds(94, 24, 253, 42);
			entrada.setFont(new Font("Myriad Pro SemiCond", Font.BOLD | Font.ITALIC, 34));
			entrada.setText("Moeda de entrada");

		JLabel saida = new JLabel();
			saida.setLabelFor(moedaSaida);
			saida.setBounds(111, 130, 218, 42);
			saida.setFont(new Font("Myriad Pro SemiCond", Font.BOLD | Font.ITALIC, 34));
			saida.setText("Moeda de sa�da");
			
		JLabel valorInserido = new JLabel("Insira a quantia aqui:");
			valorInserido.setFont(new Font("Tahoma", Font.PLAIN, 18));
			valorInserido.setHorizontalAlignment(SwingConstants.CENTER);
			valorInserido.setBounds(108, 221, 224, 22);
			
		JLabel valorResultado = new JLabel("Resultado:");
			valorResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
			valorResultado.setHorizontalAlignment(SwingConstants.CENTER);
			valorResultado.setBounds(164, 444, 112, 22);
			
		JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(ConversorFrame.class.getResource("/Imagens/banking-and-finance-1.jpg")));
			lblNewLabel.setBounds(0, 0, 1600, 1172);
			
			//Painel central
			
		JPanel PainelCentral = new JPanel();
			PainelCentral.setPreferredSize(new Dimension (200, 350));
			PainelCentral.setBounds(new Rectangle(150, 120, 434, 551));
			PainelCentral.setBorder(new LineBorder(new Color(25,128,212), 4, true));
			PainelCentral.setBackground(Color.WHITE);
			PainelCentral.add(valorInserido);
			PainelCentral.add(valorResultado);
			
			//Controle do frame
			
		JFrame frame = new JFrame();
			frame.setBackground(Color.WHITE);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ConversorFrame.class.getResource("/Imagens/IconePrincipal.png")));
			frame.setTitle("Conversor de moedas");
			frame.setSize(750,750);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(true);
			frame.getContentPane().setBackground(new Color(0,0,0,0));
			PainelCentral.setLayout(null);
			PainelCentral.add(entrada);
			PainelCentral.add(bot�oConversor);
			PainelCentral.add(entradaValor);
			PainelCentral.add(saidaValor);
			PainelCentral.add(saida);
			frame.getContentPane().setLayout(null);
			frame.getContentPane().add(PainelCentral);
			PainelCentral.add(moedaEntrada);
			PainelCentral.add(moedaSaida);
			frame.getContentPane().add(lblNewLabel);
			frame.setVisible(true);


	}
	
	
	
		
	//M�todos de a��o

		
		@Override
		public void actionPerformed(ActionEvent e) {
			//Buscando exce��es ao funcionamento
			try {
			if(e.getSource()==moedaEntrada) {
				
				Conversor.Op��oEntrada = moedaEntrada.getSelectedIndex();
				
			
				// Prints para controle interno de desenvolvimento System.out.println(Conversor.Op��oEntrada);
			}
			else if(e.getSource()==moedaSaida) {
				Conversor.Op��oSaida = moedaSaida.getSelectedIndex();
				
				// Prints para controle interno de desenvolvimento System.out.println(Conversor.Op��oSaida);
			}
			
			else if(e.getSource()==bot�oConversor) {
				String novaEntrada = entradaValor.getText().replace(',','.');
				ValorEntrada = Double.valueOf(novaEntrada);
				
				converterEntrada();
				converterSaida ();
				
				resultado= String.format("%.2f", Conversor.ValorSaida)+"   "+Conversor.moedas[Op��oSaida];
				
				saidaValor.setText(resultado);
				// Prints para controle interno de desenvolvimentoSystem.out.println(Conversor.ValorSaida);
				// Prints para controle interno de desenvolvimentoSystem.out.println(resultado);
			}
			}
			catch (NumberFormatException f) {
				JOptionPane.showMessageDialog(null, "Entre um n�mero v�lido", "Erro!", JOptionPane.OK_OPTION);
				
				
			}
			
			}
		}




	
