package br.com.poo.banco.views;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class JGerente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCpf;
	private JTextField textFieldEmail;
	private JTextField textFieldAg;
	private JPasswordField passwordFieldGer;
	private JPasswordField passwordFieldCSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JGerente frame = new JGerente();
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
	public JGerente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelSenha = new JLabel("Senha:");
		lblNewLabelSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelSenha.setBounds(10, 282, 46, 14);
		contentPane.add(lblNewLabelSenha);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon("imagens/logo.png"));
		Logo.setBounds(541, 371, 64, 50);
		contentPane.add(Logo);
		
		JButton ButtonVoltar = new JButton("Voltar");
		ButtonVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonVoltar.setBounds(304, 340, 116, 23);
		contentPane.add(ButtonVoltar);
		
		JButton FinalizarCadastro = new JButton("Finalizar Cadastro");
		FinalizarCadastro.setFont(new Font("Tahoma", Font.BOLD, 11));
		FinalizarCadastro.setBounds(107, 340, 162, 23);
		contentPane.add(FinalizarCadastro);
		
		passwordFieldCSenha = new JPasswordField();
		passwordFieldCSenha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordFieldCSenha.setBounds(343, 279, 116, 20);
		contentPane.add(passwordFieldCSenha);
		
		JLabel lblNewLabelCSenha = new JLabel("Confirme sua senha:");
		lblNewLabelCSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelCSenha.setBounds(217, 282, 116, 14);
		contentPane.add(lblNewLabelCSenha);
		
		passwordFieldGer = new JPasswordField();
		passwordFieldGer.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordFieldGer.setBounds(53, 279, 116, 20);
		contentPane.add(passwordFieldGer);
		
		textFieldAg = new JTextField();
		textFieldAg.setBounds(64, 239, 105, 20);
		contentPane.add(textFieldAg);
		textFieldAg.setColumns(10);
		
		JLabel lblNewLabelAg = new JLabel("Agência:");
		lblNewLabelAg.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelAg.setBounds(10, 242, 57, 14);
		contentPane.add(lblNewLabelAg);
		
		JLabel lblNewLabelEmail = new JLabel("Email:");
		lblNewLabelEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelEmail.setBounds(10, 160, 46, 14);
		contentPane.add(lblNewLabelEmail);
		
		JLabel textCpf = new JLabel("CPF:");
		textCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		textCpf.setBounds(10, 116, 34, 14);
		contentPane.add(textCpf);
		
		JLabel lblNewLabel_1 = new JLabel("Gerente");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		lblNewLabel_1.setBounds(246, 11, 126, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel textNome = new JLabel("Nome:");
		textNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNome.setBounds(10, 76, 46, 14);
		contentPane.add(textNome);
		
		JComboBox comboBoxTipoConta = new JComboBox();
		comboBoxTipoConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxTipoConta.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Tipo", "Conta Corrente", "Conta Poupança", "Conta Corrente e Conta Poupança"}));
		comboBoxTipoConta.setBounds(100, 201, 228, 22);
		contentPane.add(comboBoxTipoConta);
		
		JLabel lblNewLabelTipodeConta = new JLabel("Tipo de Conta:");
		lblNewLabelTipodeConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelTipodeConta.setBounds(10, 205, 80, 14);
		contentPane.add(lblNewLabelTipodeConta);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(53, 157, 251, 20);
		contentPane.add(textFieldEmail);
		
		
		MaskFormatter mascaraCpf;
		try {
			mascaraCpf = new MaskFormatter ("###.###.###-##");
		
		textFieldCpf = new JFormattedTextField(mascaraCpf);
		textFieldCpf.setColumns(10);
		textFieldCpf.setBounds(53, 113, 251, 20);
		contentPane.add(textFieldCpf);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(53, 73, 251, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, 0, 628, 446);
		contentPane.add(lblNewLabel);
	}
}
