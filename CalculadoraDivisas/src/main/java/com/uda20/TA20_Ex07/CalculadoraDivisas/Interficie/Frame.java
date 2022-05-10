package com.uda20.TA20_Ex07.CalculadoraDivisas.Interficie;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.uda20.TA20_Ex07.CalculadoraDivisas.OperacionesDivisas.Operaciones;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.font.TextAttribute;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField tf_divisa1;
	private JTextField tf_divisa2;
	private boolean divisa1focus;
	private JComboBox desplegableDivisa1;
	private JComboBox desplegableDivisa2;
	private JLabel lblMostrarCambioDivisas;
	private String simbolo_1;
	private String simbolo_2;
	private String numeros_added_div1 = "";
	private String numeros_added_div2 = "";
	//private String numeros_added_combo = "";
	//private String simbolo_ComboBox= "";

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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

		desplegableDivisa1 = new JComboBox();
		desplegableDivisa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*simbolo_ComboBox = simboloMoneda((String) desplegableDivisa1.getSelectedItem());
				
				numeros_added_combo = numeros_added_combo + simbolo_ComboBox + "";
				
				tf_divisa1.setText(numeros_added_combo);*/
				
			}
		});
		desplegableDivisa1.setBounds(96, 155, 165, 21);
		contentPane.add(desplegableDivisa1);
		desplegableDivisa1.addItem("Europa - Euro");
		desplegableDivisa1.addItem("America - Dolar");
		desplegableDivisa1.addItem("UK - Libras");
		desplegableDivisa1.addItem("Argentina - Peso");
		desplegableDivisa1.addItem("Rusia - Rublo");

		desplegableDivisa2 = new JComboBox();
		desplegableDivisa2.setBounds(96, 318, 165, 21);
		contentPane.add(desplegableDivisa2);
		desplegableDivisa2.addItem("Europa - Euro");
		desplegableDivisa2.addItem("America - Dolar");
		desplegableDivisa2.addItem("UK - Libras");
		desplegableDivisa2.addItem("Argentina - Peso");
		desplegableDivisa2.addItem("Rusia - Rublo");
		desplegableDivisa2.setSelectedIndex(1); // America is selected for default

		lblMostrarCambioDivisas = new JLabel("Igualación \"=\"");
		lblMostrarCambioDivisas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMostrarCambioDivisas.setBounds(100, 430, 99, 21);
		contentPane.add(lblMostrarCambioDivisas);

		JLabel lblActualizado = new JLabel("");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // Ponemos la fecha actual
		lblActualizado.setText("Actualizado el " + dtf.format(LocalDateTime.now()));
		lblActualizado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblActualizado.setBounds(100, 461, 264, 21);
		contentPane.add(lblActualizado);

		JLabel lblActualizarTipos = new JLabel("Actualizar tipos");
		Font font = new Font("Tahoma", Font.PLAIN, 15);
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON); // Subrayamos el JLabel
		lblActualizarTipos.setFont(font.deriveFont(attributes));
		lblActualizarTipos.setBounds(100, 492, 140, 21);
		contentPane.add(lblActualizarTipos);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBotonEliminar();
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBounds(858, 45, 99, 60);
		contentPane.add(btnDelete);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarTodo();
			}
		});
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCE.setBounds(758, 45, 99, 60);
		contentPane.add(btnCE);

		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(8);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_8.setBounds(758, 116, 99, 60);
		contentPane.add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(9);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_9.setBounds(858, 116, 99, 60);
		contentPane.add(btn_9);

		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(7);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_7.setBounds(657, 116, 99, 60);
		contentPane.add(btn_7);

		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(6);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_6.setBounds(858, 186, 99, 60);
		contentPane.add(btn_6);

		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(5);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_5.setBounds(758, 186, 99, 60);
		contentPane.add(btn_5);

		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(4);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_4.setBounds(657, 186, 99, 60);
		contentPane.add(btn_4);

		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(3);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_3.setBounds(858, 256, 99, 60);
		contentPane.add(btn_3);

		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(2);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_2.setBounds(758, 256, 99, 60);
		contentPane.add(btn_2);

		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(1);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_1.setBounds(657, 256, 99, 60);
		contentPane.add(btn_1);

		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonNumero(0);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_0.setBounds(758, 324, 99, 60);
		contentPane.add(btn_0);

		JButton btn_coma = new JButton(",");
		btn_coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (divisa1focus) {
					anadirComa(tf_divisa1.getText().toString());
				} else {
					anadirComa(tf_divisa2.getText().toString());
				}
			}
		});
		btn_coma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_coma.setBounds(858, 324, 99, 60);
		contentPane.add(btn_coma);

		tf_divisa1 = new JTextField();
		tf_divisa1.setFont(new Font("Tahoma", Font.BOLD, 22));
		tf_divisa1.setText("0");
		tf_divisa1.setBorder(null);
		tf_divisa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_divisa1.requestFocus();

			}
		});
		tf_divisa1.setEditable(false);
		tf_divisa1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				divisa1focus = true;
			}
		});
		tf_divisa1.setBounds(96, 112, 165, 32);
		contentPane.add(tf_divisa1);
		tf_divisa1.setColumns(10);
		tf_divisa2 = new JTextField();
		tf_divisa2.setFont(new Font("Tahoma", Font.BOLD, 22));
		tf_divisa2.setBorder(null);
		tf_divisa2.setText("0");
		tf_divisa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_divisa2.requestFocus();
				// tf_divisa2.setFont(new Font("Tahoma", Font.BOLD, 22));
				// tf_divisa1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			}
		});
		tf_divisa2.setEditable(false);
		tf_divisa2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				divisa1focus = false;
			}
		});
		tf_divisa2.setColumns(10);
		tf_divisa2.setBounds(96, 272, 165, 32);
		contentPane.add(tf_divisa2);
	}

	public void accionBotonNumero(int numero) {
		controlarSiEs0();

		if (divisa1focus) { // Divisa 1 clicada
			
			tf_divisa1.setText(""); // Eliminamos todo el texto para poder poner la concatenacion de numeros con su simbolo

			numeros_added_div1 = numeros_added_div1 + numero + "";

			String nameDivisa_1 = (String) desplegableDivisa1.getSelectedItem(); // Cogemos el item seleccionado en el combobox

			simbolo_1 = simboloMoneda(nameDivisa_1);

			tf_divisa1.setText(tf_divisa1.getText() + numeros_added_div1 + " " + simbolo_1); // Añadimos la concatenacion con el simbolo

			
		} else {
			
			tf_divisa2.setText("");
			
			numeros_added_div2 = numeros_added_div2 + numero + "";

			String nameDivisa_2 = (String) desplegableDivisa2.getSelectedItem();

			simbolo_2 = simboloMoneda(nameDivisa_2);

			tf_divisa2.setText(tf_divisa2.getText() + numeros_added_div2 + " " + simbolo_2); // Divisa 2 clicada

		}

		lblMostrarCambioDivisas.setText("1" + simbolo_1 + " = " + simbolo_2); // Falta el valor !!!!!!!!!!!!

	}

	public String simboloMoneda(String type) {

		switch (type) {
		case "Europa - Euro":
			return "€";
		case "America - Dolar":
			return "$";
		case "UK - Libras":
			return "£";
		case "Argentina - Peso":
			return "AR $";
		case "Rusia - Rublo":
			return "₽";
		default:
			return "";
		}

	}

	public void accionBotonEliminar() {
		if (divisa1focus) {
			tf_divisa1.setText(borrarUltimoChar(tf_divisa1.getText().toString()));
		} else {
			tf_divisa2.setText(borrarUltimoChar(tf_divisa2.getText().toString()));
		}

	}

	public String borrarUltimoChar(String text) {
		if (text.length() > 1) {
			return text.substring(0, text.length() - 1);
		} else {
			return "0";
		}

	}

	public void anadirComa(String text) {
		boolean tieneComa = false;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '.') {
				tieneComa = true;
			}
		}
		if (!tieneComa) {
			if (divisa1focus) {
				tf_divisa1.setText(tf_divisa1.getText() + '.');
			} else {
				tf_divisa2.setText(tf_divisa2.getText() + '.');
			}
		}
	}

	public void controlarSiEs0() {

		if (divisa1focus) {
			if (tf_divisa1.getText().toString().equals("0")) {
				tf_divisa1.setText("");
			}
		} else {
			if (tf_divisa2.getText().toString().equals("0")) {
				tf_divisa2.setText("");
			}
		}
	}

	public void borrarTodo() {
		tf_divisa1.setText("");
		tf_divisa2.setText("");
	}

}
