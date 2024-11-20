package CalculadoraEstandar;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculadoraGui {
	Calculadora c;
	String operacion = "", numero1, numero2;
	JFrame ventana; //declarar
	JTextField display;
	JButton bSiete;
	JButton bOcho;
	JButton bNueve;
	JButton bSeis;
	JButton bCinco;
	JButton bCuatro;
	JButton bTres;
	JButton bDos;
	JButton bUno;
	JButton bCero;
	JButton bResta;
	JButton bDivision;
	JButton bProducto;
	JButton bSuma;
	JButton bCalcular;

	//constructor
	public CalculadoraGui() {
		c = new Calculadora();//
		ventana = new JFrame();
		ventana.setTitle("Calculadora 1.0");
		ventana.setLayout(new GridLayout(6,4));
		ventana.setBounds(100, 50, 400, 600);
		//display
		display = new JTextField(60);

		//botones
		bSiete = new JButton("7");
		bOcho = new JButton("8");
		bNueve = new JButton("9");
		bSeis = new JButton("6");
		bCinco = new JButton("5");
		bCuatro = new JButton("4");
		bTres = new JButton("3");
		bDos = new JButton("2");
		bUno = new JButton("1");
		bCero = new JButton("0");
		bResta = new JButton("-");
		bProducto = new JButton("x");
		bDivision = new JButton("/");
		bSuma = new JButton("+");
		bCalcular  =new JButton("=");
		
		//add
		ventana.add(display);
		ventana.add(bSiete);
		ventana.add(bOcho);
		ventana.add(bNueve);
		ventana.add(bSuma);
		ventana.add(bSeis);
		ventana.add(bCinco);
		ventana.add(bCuatro);
		ventana.add(bResta);
		ventana.add(bUno);
		ventana.add(bDos);
		ventana.add(bTres);
		ventana.add(bProducto);
		ventana.add(bCero);
		ventana.add(bResta);
		ventana.add(bCalcular);
		ventana.add(bDivision);
		
		bSiete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("7");
			}
		});
		
		bSuma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operar("+");
			}
		});
		
		bCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operar("=");
			}
		});
		
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
		new CalculadoraGui();
		
	}
	
	private void digitar(String n) {
		String auxDisplay = display.getText();
		auxDisplay = auxDisplay + n;
		display.setText(auxDisplay);
	}
	
	private void operar(String op) {
		
		if(op == "=") {
			numero2 = display.getText();
			if(operacion == "+") {
				//calcular
				float n1 = Float.valueOf(numero1);
				float n2 = Float.valueOf(numero2);
				c.setNumeros(n1, n2);
				String valor = String.valueOf(c.getSuma());
				display.setText(valor);
			}
		}else {
			operacion = op;
			numero1 = display.getText();
			display.setText("");
		}
	}
}
