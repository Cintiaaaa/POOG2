package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class JContaCorrente extends JFrame {
//Linkar as telas de: saque, depósito e transferência
	private JPanel telaContaCorrente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JContaCorrente frame = new JContaCorrente();
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
	public JContaCorrente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		telaContaCorrente = new JPanel();
		telaContaCorrente.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(telaContaCorrente);
		telaContaCorrente.setLayout(null);
		
		JLabel textChequeEspecial = new JLabel("Cheque Especial");
		textChequeEspecial.setFont(new Font("Tahoma", Font.BOLD, 11));
		textChequeEspecial.setBounds(32, 223, 98, 14);
		telaContaCorrente.add(textChequeEspecial);
		
		JLabel textContaCorrente = new JLabel("Conta Corrente");
		textContaCorrente.setForeground(new Color(0, 0, 128));
		textContaCorrente.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		textContaCorrente.setBounds(189, 32, 276, 37);
		telaContaCorrente.add(textContaCorrente);
		
		JLabel TextCC = new JLabel("Seja Bem-Vindo(a) :");
		TextCC.setFont(new Font("Tahoma", Font.BOLD, 11));
		TextCC.setBounds(32, 82, 141, 14);
		telaContaCorrente.add(TextCC);
		
		JButton btnNewButton_1 = new JButton("Depósito");
		btnNewButton_1.setBounds(230, 315, 111, 23);
		telaContaCorrente.add(btnNewButton_1);
		
		JLabel textAgencia = new JLabel("Agência");
		textAgencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		textAgencia.setBounds(254, 122, 89, 14);
		telaContaCorrente.add(textAgencia);
		
		JLabel lblNewLabel_1 = new JLabel("Limite");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(33, 198, 46, 14);
		telaContaCorrente.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Transferência");
		btnNewButton_2.setBounds(416, 315, 111, 23);
		telaContaCorrente.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Saldo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(451, 122, 46, 14);
		telaContaCorrente.add(lblNewLabel_2);
		
		JLabel textNumeroCc = new JLabel("Número Conta Corrente");
		textNumeroCc.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumeroCc.setBounds(31, 117, 141, 25);
		telaContaCorrente.add(textNumeroCc);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, 0, 615, 432);
		telaContaCorrente.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.setBounds(38, 313, 111, 23);
		telaContaCorrente.add(btnNewButton);
		
		JLabel TextLogo = new JLabel("Logo");
		TextLogo.setIcon(new ImageIcon("./imagens/logo.png"));
		TextLogo.setBounds(533, 360, 72, 61);
		telaContaCorrente.add(TextLogo);
	}
}
