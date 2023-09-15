package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class JContaPoupanca extends JFrame {

	private JPanel JContaPoupanca;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JContaPoupanca frame = new JContaPoupanca();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public JContaPoupanca(String nome, String contaId, String agencia, String cpf, String senha, Double saldo) {
		setTitle("STBank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		JContaPoupanca = new JPanel();
		JContaPoupanca.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(JContaPoupanca);
		JContaPoupanca.setLayout(null);
		
		JLabel textNumContaPoupanca = new JLabel("Número da conta: " + contaId);
		textNumContaPoupanca.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumContaPoupanca.setBounds(20, 118, 229, 14);
		JContaPoupanca.add(textNumContaPoupanca);
		
		JLabel textContaPoupanca = new JLabel("Conta Poupanca");
		textContaPoupanca.setForeground(new Color(0, 0, 128));
		textContaPoupanca.setFont(new Font("Bauhaus 93", Font.BOLD, 31));
		textContaPoupanca.setBounds(181, 11, 255, 46);
		JContaPoupanca.add(textContaPoupanca);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon("./imagens//logo.png"));
		Logo.setBounds(527, 375, 78, 46);
		JContaPoupanca.add(Logo);
		
		JButton buttonExtrato = new JButton("Imprimir Extrato");
		buttonExtrato.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonExtrato.setBounds(121, 225, 154, 23);
		JContaPoupanca.add(buttonExtrato);
		
		JButton ButtonRendimentos = new JButton("Rendimentos");
		ButtonRendimentos.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonRendimentos.setBounds(358, 261, 121, 23);
		JContaPoupanca.add(ButtonRendimentos);
		
		JButton ButtonDeposito = new JButton("Deposito");
		ButtonDeposito.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonDeposito.setBounds(358, 225, 121, 23);
		JContaPoupanca.add(ButtonDeposito);
		
		JButton ButtonSaque = new JButton("Saque");
		ButtonSaque.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonSaque.setBounds(121, 261, 154, 23);
		JContaPoupanca.add(ButtonSaque);
		
		JLabel textSaldoCp = new JLabel("Saldo : R$ " + saldo);
		textSaldoCp.setFont(new Font("Tahoma", Font.BOLD, 11));
		textSaldoCp.setBounds(20, 151, 177, 14);
		JContaPoupanca.add(textSaldoCp);
		
		JLabel textNumeroAgenciaCp = new JLabel("Agência " + agencia );
		textNumeroAgenciaCp.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumeroAgenciaCp.setBounds(372, 118, 154, 14);
		JContaPoupanca.add(textNumeroAgenciaCp);
		
		textNumContaPoupanca.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumContaPoupanca.setBounds(20, 118, 150, 14);
		JContaPoupanca.add(textNumContaPoupanca);
		
		JLabel textContaPoupanca1 = new JLabel("Seja Bem-vindo(a): " + nome);
		textContaPoupanca1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textContaPoupanca1.setBounds(10, 70, 302, 14);
		JContaPoupanca.add(textContaPoupanca1);
		
		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon("./imagens//imagemFundo.jpeg"));
		Fundo.setBounds(0, 0, 615, 432);
		JContaPoupanca.add(Fundo);
	}
}