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

public class JCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField cadNome;
	private JTextField cadCpf;
	private JTextField cadDataNasc;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadastro frame = new JCadastro();
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
	public JCadastro() {
		setTitle("STbank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel newCadastro = new JLabel("Cadastro");
		newCadastro.setFont(new Font("Tahoma", Font.PLAIN, 28));
		newCadastro.setForeground(new Color(0, 0, 128));
		newCadastro.setBounds(10, 11, 139, 44);
		contentPane.add(newCadastro);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 89, 46, 14);
		contentPane.add(lblNewLabel);
		
		cadNome = new JTextField();
		cadNome.setBounds(54, 88, 484, 20);
		contentPane.add(cadNome);
		cadNome.setColumns(10);
		
		JLabel textCpf = new JLabel("CPF:");
		textCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCpf.setBounds(10, 146, 46, 14);
		contentPane.add(textCpf);
		
		cadCpf = new JTextField();
		cadCpf.setColumns(10);
		cadCpf.setBounds(54, 145, 241, 20);
		contentPane.add(cadCpf);
		try {
			MaskFormatter mascaraCpf = null;
			mascaraCpf = new MaskFormatter ("###.###.###-##");
			mascaraCpf.setPlaceholderCharacter('_');					
		} catch (ParseException e) {
			System.err.println(" Erro na formatação!" + e.getMessage());
			System.exit(-1);
			
		}
			
		
		JLabel textDataNasc = new JLabel("Data de Nascimento:");
		textDataNasc.setVerticalAlignment(SwingConstants.TOP);
		textDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDataNasc.setBounds(10, 265, 139, 14);
		contentPane.add(textDataNasc);
		
		cadDataNasc = new JTextField();
		cadDataNasc.setColumns(10);
		cadDataNasc.setBounds(145, 265, 200, 20);
		contentPane.add(cadDataNasc);
		try {
			MaskFormatter mascaraData = new MaskFormatter("##/##/####");
			cadDataNasc = new JFormattedTextField(mascaraData);
		    cadDataNasc.setColumns(10);
		    cadDataNasc.setBounds(145, 265, 200, 20);
		    contentPane.add(cadDataNasc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		JLabel textEmail = new JLabel("E-mail:");
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textEmail.setBounds(10, 213, 46, 14);
		contentPane.add(textEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(54, 212, 484, 20);
		contentPane.add(textField);
	}
}
