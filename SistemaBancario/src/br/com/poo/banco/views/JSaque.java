package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JSaque extends JFrame {
//Mensagem de saldo na tela 
	//tela de aviso: saque efetuado com sucesso ou não e por que?
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSaque frame = new JSaque();
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
	public JSaque() {
		setTitle("STBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\FACC\\Pictures\\Camera Roll\\logo-tsbank3.png"));
		lblNewLabel_4.setBounds(546, 376, 61, 48);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBounds(159, 303, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(355, 303, 113, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(159, 225, 113, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione o tipo de conta:", "Conta Corrente", "Conta Poupança"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(159, 102, 309, 31);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Valor do saque");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(73, 228, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Seu saldo ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(73, 166, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Saque");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 31));
		lblNewLabel_1.setBounds(263, 43, 128, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\RamonECintia\\Downloads\\WhatsApp Image 2023-09-13 at 17.09.35.jpeg"));
		lblNewLabel.setBounds(0, -20, 625, 452);
		contentPane.add(lblNewLabel);
	}
}
