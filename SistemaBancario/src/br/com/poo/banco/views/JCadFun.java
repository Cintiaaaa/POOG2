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
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class JCadFun extends JFrame {

	private JPanel contentPane;
	private JTextField cadNome;
	private JTextField cadCpf;
	private JTextField cadDataNasc;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadFun frame = new JCadFun();
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
	public JCadFun() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
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
		textVoltar.setBounds(274, 335, 105, 23);
		contentPane.add(textVoltar);
		
		JButton cadCadastrar = new JButton("Cadastrar");
		cadCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		cadCadastrar.setBounds(135, 335, 113, 23);
		contentPane.add(cadCadastrar);
		
		JLabel newCadastro = new JLabel("Cadastro - Funcionário");
		newCadastro.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		newCadastro.setForeground(new Color(0, 0, 128));
		newCadastro.setBounds(131, 11, 390, 44);
		contentPane.add(newCadastro);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 58, 46, 14);
		contentPane.add(lblNewLabel);
		
		cadNome = new JTextField();
		cadNome.setBounds(57, 54, 379, 23);
		contentPane.add(cadNome);
		cadNome.setColumns(10);
		
		JLabel textCpf = new JLabel("CPF:");
		textCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		textCpf.setBounds(10, 101, 46, 14);
		contentPane.add(textCpf);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		    cadCpf = new JFormattedTextField(mascaraCpf);
		    cadCpf.setColumns(10);
		    cadCpf.setBounds(48, 97, 200, 23);
		    contentPane.add(cadCpf);				
		} catch (ParseException e) {
			e.printStackTrace();
			
		}
			
		JLabel textDataNasc = new JLabel("Data de Nascimento:");
		textDataNasc.setVerticalAlignment(SwingConstants.TOP);
		textDataNasc.setFont(new Font("Tahoma", Font.BOLD, 11));
		textDataNasc.setBounds(10, 177, 156, 14);
		contentPane.add(textDataNasc);
		try {
			MaskFormatter mascaraData = new MaskFormatter("##/##/####");
			cadDataNasc = new JFormattedTextField(mascaraData);
		    cadDataNasc.setColumns(10);
		    cadDataNasc.setBounds(135, 173, 100, 23);
		    contentPane.add(cadDataNasc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		JLabel textEmail = new JLabel("E-mail:");
		textEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		textEmail.setBounds(10, 137, 66, 14);
		contentPane.add(textEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(57, 131, 450, 23);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Cargo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 202, 66, 25);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção:", "Gerente", "Diretor", "Presidente"}));
		comboBox.setBounds(57, 202, 170, 23);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Salário:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 241, 66, 23);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(57, 241, 115, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Senha:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 275, 66, 23);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(57, 275, 139, 23);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("Confirme sua senha:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(207, 271, 156, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel imagemFundo = new JLabel("");
		imagemFundo.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		imagemFundo.setBounds(0, 0, 784, 561);
		contentPane.add(imagemFundo);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(327, 276, 139, 23);
		contentPane.add(passwordField_1);
	}
}
