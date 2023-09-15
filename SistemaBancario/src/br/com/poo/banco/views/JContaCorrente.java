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
//Linkar as telas de: saque, deposito e transferencia
	private JPanel telaContaCorrente;

	/**
	 * Launch the application.
	 */
	
	public JContaCorrente(String nome) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		telaContaCorrente = new JPanel();
		telaContaCorrente.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(telaContaCorrente);
		telaContaCorrente.setLayout(null);
		
		JButton ButtonImpExt = new JButton("Imprimir Extrato");
		ButtonImpExt.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonImpExt.setBounds(104, 263, 127, 23);
		telaContaCorrente.add(ButtonImpExt);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(104, 297, 127, 23);
		telaContaCorrente.add(btnNewButton);
		
		JLabel textChequeEspecial = new JLabel("Limite Cheque Especial:");
		textChequeEspecial.setFont(new Font("Tahoma", Font.BOLD, 11));
		textChequeEspecial.setBounds(32, 198, 141, 14);
		telaContaCorrente.add(textChequeEspecial);
		
		JLabel textContaCorrente = new JLabel("Conta Corrente");
		textContaCorrente.setForeground(new Color(0, 0, 128));
		textContaCorrente.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		textContaCorrente.setBounds(189, 32, 276, 37);
		telaContaCorrente.add(textContaCorrente);
		
		JLabel TextCC = new JLabel("Seja Bem-Vindo(a) : " + nome);
		TextCC.setFont(new Font("Tahoma", Font.BOLD, 11));
		TextCC.setBounds(32, 82, 141, 14);
		telaContaCorrente.add(TextCC);
		
		JButton btnNewButton_1 = new JButton("Deposito");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(304, 263, 111, 23);
		telaContaCorrente.add(btnNewButton_1);
		
		JLabel textAgencia = new JLabel("Agencia:");
		textAgencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		textAgencia.setBounds(254, 122, 89, 14);
		telaContaCorrente.add(textAgencia);
		
		JButton btnNewButton_2 = new JButton("Transferencia");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(304, 297, 111, 23);
		telaContaCorrente.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Saldo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(451, 122, 46, 14);
		telaContaCorrente.add(lblNewLabel_2);
		
		JLabel textNumeroCc = new JLabel("Número Conta Corrente: ");
		textNumeroCc.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumeroCc.setBounds(31, 117, 141, 25);
		telaContaCorrente.add(textNumeroCc);
		
		JLabel TextLogo = new JLabel("Logo");
		TextLogo.setIcon(new ImageIcon("./imagens/logo.png"));
		TextLogo.setBounds(533, 360, 72, 61);
		telaContaCorrente.add(TextLogo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, 0, 615, 432);
		telaContaCorrente.add(lblNewLabel);
	}
}