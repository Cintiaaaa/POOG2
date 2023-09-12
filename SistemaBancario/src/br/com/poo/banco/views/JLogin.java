package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.pessoas.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class JLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField inputPassword;
	private JTextField formattedCpf;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();

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
	public JLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\dev\\POO\\Workspace\\POOG2\\SistemaBancario\\imagens\\logo.png"));
		setTitle("STBank");
		Date data = new Date();
		Cliente cliente1 = new Cliente("Maria", "12345678910", "maria@mail.com", data);
		Conta contaCliente1 = new Conta("Corrente", "990", "5454-3", "12345678910", "123",20000.00);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textTipoConta = new JLabel("Tipo de Conta:");
		textTipoConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		textTipoConta.setBounds(120, 301, 182, 14);
		contentPane.add(textTipoConta);
		
		JLabel lblNewLabel_4 = new JLabel("Logo");
		lblNewLabel_4.setIcon(new ImageIcon("./imagens/logo.png"));
		lblNewLabel_4.setBounds(528, 357, 75, 63);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(240, 23, 118, 54);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 36));
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logica do Login
				String cpf = formattedCpf.getText();
				String senha = new String(inputPassword.getPassword());
				if (contaCliente1.getCpf().equals(cpf) && contaCliente1.getSenha().equals(senha)) {
					System.out.println("Acesso Permitido!");
					JOptionPane.showMessageDialog(btnNewButton, "Acesso Permitido!");
				} else {
					System.out.println("Acesso Negado!" + " " + contaCliente1.getCpf() + " " + contaCliente1.getSenha() + " " + cpf + " " + senha);
					JOptionPane.showMessageDialog(btnNewButton, "Acesso Negado!", "AVISO!", JOptionPane.ERROR_MESSAGE);
				}
								}
		});
		btnNewButton.setBounds(240, 374, 95, 29);
		contentPane.add(btnNewButton);

		inputPassword = new JPasswordField();
		inputPassword.setBounds(120, 243, 368, 35);
		contentPane.add(inputPassword);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Selecione um tipo:", "Cliente", "Gerente", "Diretor", "Presidente" }));
		comboBox.setToolTipText("");
		comboBox.setBounds(120, 108, 368, 35);
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Usuário");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(120, 93, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel textcpf = new JLabel("CPF");
		textcpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		textcpf.setBounds(120, 163, 46, 14);
		contentPane.add(textcpf);
		
		try {
		    MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		    JFormattedTextField formattedCpf = new JFormattedTextField(mascaraCpf);
		    formattedCpf.setColumns(10);
		    formattedCpf.setBounds(120, 177, 200, 32);
		    contentPane.add(formattedCpf);
		} catch (ParseException e) {
		    e.printStackTrace();
		}

		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(120, 229, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox boxTipoConta = new JComboBox();
		boxTipoConta.setModel(new DefaultComboBoxModel(new String[] {"Selecione um tipo de conta:", "Conta Corrente", "Conta Poupança"}));
		boxTipoConta.setToolTipText("");
		boxTipoConta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boxTipoConta.setBounds(120, 317, 368, 35);
		contentPane.add(boxTipoConta);
		
		JLabel textCPF = new JLabel("");
		textCPF.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		textCPF.setBounds(0, 0, 613, 431);
		contentPane.add(textCPF);
	}
}
