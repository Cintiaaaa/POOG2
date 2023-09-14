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

	private JPanel JContaPoupança;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JContaPoupanca frame = new JContaPoupanca();
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
	public JContaPoupanca() {
		setTitle("STBank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		JContaPoupança = new JPanel();
		JContaPoupança.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(JContaPoupança);
		JContaPoupança.setLayout(null);
		
		JLabel textContaPoupança = new JLabel("Conta Poupança");
		textContaPoupança.setForeground(new Color(0, 0, 128));
		textContaPoupança.setFont(new Font("Bauhaus 93", Font.BOLD, 31));
		textContaPoupança.setBounds(181, 11, 255, 46);
		JContaPoupança.add(textContaPoupança);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon("./imagens//logo.png"));
		Logo.setBounds(527, 375, 78, 46);
		JContaPoupança.add(Logo);
		
		JButton buttonExtrato = new JButton("Imprimir Extrato");
		buttonExtrato.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonExtrato.setBounds(121, 225, 154, 23);
		JContaPoupança.add(buttonExtrato);
		
		JButton ButtonRendimentos = new JButton("Rendimentos");
		ButtonRendimentos.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonRendimentos.setBounds(358, 261, 121, 23);
		JContaPoupança.add(ButtonRendimentos);
		
		JButton ButtonDepósito = new JButton("Depósito");
		ButtonDepósito.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonDepósito.setBounds(358, 225, 121, 23);
		JContaPoupança.add(ButtonDepósito);
		
		JButton ButtonSaque = new JButton("Saque");
		ButtonSaque.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonSaque.setBounds(121, 261, 154, 23);
		JContaPoupança.add(ButtonSaque);
		
		JLabel textSaldoCp = new JLabel("Saldo");
		textSaldoCp.setFont(new Font("Tahoma", Font.BOLD, 11));
		textSaldoCp.setBounds(434, 118, 46, 14);
		JContaPoupança.add(textSaldoCp);
		
		JLabel textNumeroAgenciaCp = new JLabel("Agência");
		textNumeroAgenciaCp.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumeroAgenciaCp.setBounds(250, 118, 78, 14);
		JContaPoupança.add(textNumeroAgenciaCp);
		
		JLabel textNumContaPoupança = new JLabel("Número Conta Poupança");
		textNumContaPoupança.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumContaPoupança.setBounds(20, 118, 150, 14);
		JContaPoupança.add(textNumContaPoupança);
		
		JLabel textContaPoupanca = new JLabel("Seja Bem-vindo(a):");
		textContaPoupanca.setFont(new Font("Tahoma", Font.BOLD, 11));
		textContaPoupanca.setBounds(10, 70, 116, 14);
		JContaPoupança.add(textContaPoupanca);
		
		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon("./imagens//imagemFundo.jpeg"));
		Fundo.setBounds(0, 0, 615, 432);
		JContaPoupança.add(Fundo);
	}
}
