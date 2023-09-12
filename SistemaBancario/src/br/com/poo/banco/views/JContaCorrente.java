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

public class JContaCorrente extends JFrame {

	private JPanel telaContaCorrente;
	private JTextField textFieldAg;
	private JTextField textField_1;
	private JTextField textFieldSaldo;
	private JTextField textFieldChequeEsp;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\dev\\POO\\Workspace\\POOG2\\SistemaBancario\\imagens\\logo.png"));
		setTitle("STBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		telaContaCorrente = new JPanel();
		telaContaCorrente.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(telaContaCorrente);
		telaContaCorrente.setLayout(null);
		
		JLabel textChequeEsp = new JLabel("Cheque Especial");
		textChequeEsp.setFont(new Font("Tahoma", Font.BOLD, 15));
		textChequeEsp.setBounds(21, 238, 140, 20);
		telaContaCorrente.add(textChequeEsp);
		
		textFieldSaldo = new JTextField();
		textFieldSaldo.setColumns(10);
		textFieldSaldo.setBounds(21, 207, 105, 20);
		telaContaCorrente.add(textFieldSaldo);
		
		JLabel textSaldo = new JLabel("Saldo");
		textSaldo.setFont(new Font("Tahoma", Font.BOLD, 15));
		textSaldo.setBounds(21, 182, 52, 14);
		telaContaCorrente.add(textSaldo);
		
		JLabel TextLogo = new JLabel("Logo");
		TextLogo.setIcon(new ImageIcon("C:\\dev\\POO\\Workspace\\POOG2\\SistemaBancario\\imagens\\logo.png"));
		TextLogo.setBounds(533, 360, 72, 61);
		telaContaCorrente.add(TextLogo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(71, 140, 105, 20);
		telaContaCorrente.add(textField_1);
		
		textFieldAg = new JTextField();
		textFieldAg.setBounds(160, 115, 105, 20);
		telaContaCorrente.add(textFieldAg);
		textFieldAg.setColumns(10);
		
		JLabel textAgencia = new JLabel("Agência");
		textAgencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		textAgencia.setBounds(21, 143, 74, 14);
		telaContaCorrente.add(textAgencia);
		
		JLabel textNumeroCc = new JLabel("Número Conta Corrente");
		textNumeroCc.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumeroCc.setBounds(21, 118, 140, 14);
		telaContaCorrente.add(textNumeroCc);
		
		JLabel TextCC = new JLabel("Seja Bem-Vindo(a) :");
		TextCC.setFont(new Font("Tahoma", Font.BOLD, 11));
		TextCC.setBounds(21, 82, 115, 14);
		telaContaCorrente.add(TextCC);
		
		JLabel textContaCorrente = new JLabel("Conta Corrente");
		textContaCorrente.setForeground(new Color(0, 0, 128));
		textContaCorrente.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		textContaCorrente.setBounds(189, 32, 276, 37);
		telaContaCorrente.add(textContaCorrente);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, 0, 615, 432);
		telaContaCorrente.add(lblNewLabel);
		
		textFieldChequeEsp = new JTextField();
		textFieldChequeEsp.setHorizontalAlignment(SwingConstants.TRAILING);
		textFieldChequeEsp.setColumns(10);
		textFieldChequeEsp.setBounds(21, 269, 105, 20);
		telaContaCorrente.add(textFieldChequeEsp);
	}
}
