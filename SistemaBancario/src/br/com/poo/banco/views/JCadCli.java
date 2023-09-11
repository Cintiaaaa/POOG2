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
		
		JButton textVoltar = new JButton("Voltar");
		textVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		textVoltar.setBounds(378, 328, 89, 23);
		contentPane.add(textVoltar);
		
		JButton cadCadastrar = new JButton("Cadastrar");
		cadCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		cadCadastrar.setBounds(239, 328, 89, 23);
		contentPane.add(cadCadastrar);
		
		JLabel newCadastro = new JLabel("Cadastro");
		newCadastro.setFont(new Font("Tahoma", Font.BOLD, 28));
		newCadastro.setForeground(new Color(0, 0, 128));
		newCadastro.setBounds(317, 11, 139, 44);
		contentPane.add(newCadastro);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 89, 46, 14);
		contentPane.add(lblNewLabel);
		
		cadNome = new JTextField();
		cadNome.setBounds(65, 88, 484, 20);
		contentPane.add(cadNome);
		cadNome.setColumns(10);
		
		JLabel textCpf = new JLabel("CPF:");
		textCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		textCpf.setBounds(10, 146, 46, 14);
		contentPane.add(textCpf);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		    cadCpf = new JFormattedTextField(mascaraCpf);
		    cadCpf.setColumns(10);
		    cadCpf.setBounds(54, 145, 241, 20);
		    contentPane.add(cadCpf);				
		} catch (ParseException e) {
			e.printStackTrace();
			
		}
			
		JLabel textDataNasc = new JLabel("Data de Nascimento:");
		textDataNasc.setVerticalAlignment(SwingConstants.TOP);
		textDataNasc.setFont(new Font("Tahoma", Font.BOLD, 14));
		textDataNasc.setBounds(10, 265, 156, 14);
		contentPane.add(textDataNasc);
		try {
			MaskFormatter mascaraData = new MaskFormatter("##/##/####");
			cadDataNasc = new JFormattedTextField(mascaraData);
		    cadDataNasc.setColumns(10);
		    cadDataNasc.setBounds(159, 265, 139, 20);
		    contentPane.add(cadDataNasc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		JLabel textEmail = new JLabel("E-mail:");
		textEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		textEmail.setBounds(10, 213, 66, 14);
		contentPane.add(textEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(65, 212, 484, 20);
		contentPane.add(textField);
		
		JLabel imagemFundo = new JLabel("");
		imagemFundo.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		imagemFundo.setBounds(0, 0, 784, 561);
		contentPane.add(imagemFundo);
	}
}
