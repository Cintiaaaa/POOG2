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
		setTitle("STbank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Logo");
		lblNewLabel_1.setIcon(new ImageIcon("./imagens/logo.png"));
		lblNewLabel_1.setBounds(682, 483, 75, 63);
		contentPane.add(lblNewLabel_1);
		
		JButton textVoltar = new JButton("Voltar");
		textVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		textVoltar.setBounds(377, 483, 89, 23);
		contentPane.add(textVoltar);
		
		JButton cadCadastrar = new JButton("Cadastrar");
		cadCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		cadCadastrar.setBounds(238, 483, 89, 23);
		contentPane.add(cadCadastrar);
		
		JLabel newCadastro = new JLabel("Cadastro - Funcionário");
		newCadastro.setFont(new Font("Bauhaus 93", Font.BOLD, 36));
		newCadastro.setForeground(new Color(0, 0, 128));
		newCadastro.setBounds(205, 11, 390, 44);
		contentPane.add(newCadastro);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 95, 46, 14);
		contentPane.add(lblNewLabel);
		
		cadNome = new JTextField();
		cadNome.setBounds(65, 88, 450, 32);
		contentPane.add(cadNome);
		cadNome.setColumns(10);
		
		JLabel textCpf = new JLabel("CPF:");
		textCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		textCpf.setBounds(10, 152, 46, 14);
		contentPane.add(textCpf);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		    cadCpf = new JFormattedTextField(mascaraCpf);
		    cadCpf.setColumns(10);
		    cadCpf.setBounds(65, 145, 200, 32);
		    contentPane.add(cadCpf);				
		} catch (ParseException e) {
			e.printStackTrace();
			
		}
			
		JLabel textDataNasc = new JLabel("Data de Nascimento:");
		textDataNasc.setVerticalAlignment(SwingConstants.TOP);
		textDataNasc.setFont(new Font("Tahoma", Font.BOLD, 14));
		textDataNasc.setBounds(10, 271, 156, 14);
		contentPane.add(textDataNasc);
		try {
			MaskFormatter mascaraData = new MaskFormatter("##/##/####");
			cadDataNasc = new JFormattedTextField(mascaraData);
		    cadDataNasc.setColumns(10);
		    cadDataNasc.setBounds(159, 265, 100, 32);
		    contentPane.add(cadDataNasc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		JLabel textEmail = new JLabel("E-mail:");
		textEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		textEmail.setBounds(10, 219, 66, 14);
		contentPane.add(textEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(65, 212, 450, 32);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Cargo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 322, 66, 25);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção:", "Gerente", "Diretor", "Presidente"}));
		comboBox.setBounds(65, 320, 170, 32);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Salário:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 380, 66, 23);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 377, 115, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Senha:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 435, 66, 23);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(65, 432, 139, 32);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("Confirme sua senha:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(238, 431, 156, 31);
		contentPane.add(lblNewLabel_5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(388, 432, 139, 32);
		contentPane.add(passwordField_1);
		
		JLabel imagemFundo = new JLabel("");
		imagemFundo.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		imagemFundo.setBounds(0, 0, 784, 561);
		contentPane.add(imagemFundo);
	}
}
