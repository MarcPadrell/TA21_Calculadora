package com.uda20.TA20_Ex07.CalculadoraDivisas.Interficie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Frame extends JFrame {

	private JPanel contentPane;

	//Lanzar la aplicación
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Crear el Frame
	
	@SuppressWarnings("unchecked")
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMoneda = new JLabel("Moneda");
		lblMoneda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMoneda.setBounds(10, 10, 90, 32);
		contentPane.add(lblMoneda);
		
		JLabel lblDivisa1 = new JLabel("Divisa 1");
		lblDivisa1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDivisa1.setBounds(100, 113, 70, 32);
		contentPane.add(lblDivisa1);
		
		JLabel lblDivisa2 = new JLabel("Divisa 2");
		lblDivisa2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDivisa2.setBounds(100, 276, 70, 32);
		contentPane.add(lblDivisa2);
		
		JComboBox desplegableDivisa1 = new JComboBox();
		desplegableDivisa1.setBounds(96, 155, 165, 21);
		contentPane.add(desplegableDivisa1);
		desplegableDivisa1.addItem("Europa - Euro");
		desplegableDivisa1.addItem("America - Dolar");
		desplegableDivisa1.addItem("UK - Libras");
		desplegableDivisa1.addItem("Argentina - Peso");
		desplegableDivisa1.addItem("Rusia - Rublo");
		
		JComboBox desplegableDivisa2 = new JComboBox();
		desplegableDivisa2.setBounds(96, 318, 165, 21);
		contentPane.add(desplegableDivisa2);
		desplegableDivisa2.addItem("Europa - Euro");
		desplegableDivisa2.addItem("America - Dolar");
		desplegableDivisa2.addItem("UK - Libras");
		desplegableDivisa2.addItem("Argentina - Peso");
		desplegableDivisa2.addItem("Rusia - Rublo");
		
		JLabel lblMostrarCambioDivisas = new JLabel("IgualaciÃ³n \"=\"");
		lblMostrarCambioDivisas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMostrarCambioDivisas.setBounds(100, 430, 99, 21);
		contentPane.add(lblMostrarCambioDivisas);
		
		JLabel lblActualizado = new JLabel("Actualizado el \"fecha\" a las \"hora\"");
		lblActualizado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblActualizado.setBounds(100, 461, 264, 21);
		contentPane.add(lblActualizado);
		
		JLabel lblActualizarTipos = new JLabel("Actualizar tipos");
		lblActualizarTipos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblActualizarTipos.setBounds(100, 492, 140, 21);
		contentPane.add(lblActualizarTipos);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBounds(858, 45, 99, 60);
		contentPane.add(btnDelete);
		
		JButton btnCE = new JButton("CE");
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCE.setBounds(758, 45, 99, 60);
		contentPane.add(btnCE);
		
		JButton btn_8 = new JButton("8");
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_8.setBounds(758, 116, 99, 60);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_9.setBounds(858, 116, 99, 60);
		contentPane.add(btn_9);
		
		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_7.setBounds(657, 116, 99, 60);
		contentPane.add(btn_7);
		
		JButton btn_6 = new JButton("6");
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_6.setBounds(858, 186, 99, 60);
		contentPane.add(btn_6);
		
		JButton btn_5 = new JButton("5");
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_5.setBounds(758, 186, 99, 60);
		contentPane.add(btn_5);
		
		JButton btn_4 = new JButton("4");
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_4.setBounds(657, 186, 99, 60);
		contentPane.add(btn_4);
		
		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_3.setBounds(858, 256, 99, 60);
		contentPane.add(btn_3);
		
		JButton btn_2 = new JButton("2");
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_2.setBounds(758, 256, 99, 60);
		contentPane.add(btn_2);
		
		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_1.setBounds(657, 256, 99, 60);
		contentPane.add(btn_1);
		
		JButton btn_0 = new JButton("0");
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_0.setBounds(758, 324, 99, 60);
		contentPane.add(btn_0);
		
		JButton btn_coma = new JButton(",");
		btn_coma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_coma.setBounds(858, 324, 99, 60);
		contentPane.add(btn_coma);
	}
}
