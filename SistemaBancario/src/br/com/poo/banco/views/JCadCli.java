package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class JCadCli extends JFrame {

	private JPanel contentPane;
	private JTextField cadNome;
	private JTextField cadCpf;
	private JTextField cadDataNasc;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadCli frame = new JCadCli();
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
	public JCadCli() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\dev\\POO\\Workspace\\POOG2\\SistemaBancario\\imagens\\logo.png"));
		setTitle("STbank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Logo");
		lblNewLabel_1.setIcon(new ImageIcon("./imagens/logo.png"));
		lblNewLabel_1.setBounds(530, 358, 75, 63);
		contentPane.add(lblNewLabel_1);
		
		JButton textVoltar = new JButton("Voltar");
		textVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		textVoltar.setBounds(270, 309, 110, 23);
		contentPane.add(textVoltar);
		
		JButton cadCadastrar = new JButton("Cadastrar");
		cadCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		cadCadastrar.setBounds(131, 309, 110, 23);
		contentPane.add(cadCadastrar);
		
		JLabel newCadastro = new JLabel("Cadastro - Cliente");
		newCadastro.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		newCadastro.setForeground(new Color(0, 0, 128));
		newCadastro.setBounds(164, 14, 332, 44);
		contentPane.add(newCadastro);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 73, 46, 14);
		contentPane.add(lblNewLabel);
		
		cadNome = new JTextField();
		cadNome.setBounds(54, 69, 450, 23);
		contentPane.add(cadNome);
		cadNome.setColumns(10);
		
		JLabel textCpf = new JLabel("CPF:");
		textCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		textCpf.setBounds(10, 120, 46, 14);
		contentPane.add(textCpf);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		    cadCpf = new JFormattedTextField(mascaraCpf);
		    cadCpf.setColumns(10);
		    cadCpf.setBounds(54, 113, 200, 23);
		    contentPane.add(cadCpf);				
		} catch (ParseException e) {
			e.printStackTrace();
			
		}
			
		JLabel textDataNasc = new JLabel("Data de Nascimento:");
		textDataNasc.setVerticalAlignment(SwingConstants.TOP);
		textDataNasc.setFont(new Font("Tahoma", Font.BOLD, 11));
		textDataNasc.setBounds(10, 207, 156, 14);
		contentPane.add(textDataNasc);
		try {
			MaskFormatter mascaraData = new MaskFormatter("##/##/####");
			cadDataNasc = new JFormattedTextField(mascaraData);
		    cadDataNasc.setColumns(10);
		    cadDataNasc.setBounds(130, 203, 100, 23);
		    contentPane.add(cadDataNasc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		JLabel textEmail = new JLabel("E-mail:");
		textEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		textEmail.setBounds(10, 166, 66, 14);
		contentPane.add(textEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(65, 159, 450, 23);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 242, 66, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Confirme sua senha:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(265, 237, 175, 32);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(65, 239, 150, 23);
		contentPane.add(passwordField);
		
		JLabel imagemFundo = new JLabel("");
		imagemFundo.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		imagemFundo.setBounds(0, 0, 784, 561);
		contentPane.add(imagemFundo);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(389, 240, 150, 23);
		contentPane.add(passwordField_1);
	}
}
