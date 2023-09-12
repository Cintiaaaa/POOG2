package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class JLogin extends JFrame {

	private JPanel contentPane;
	private JTextField inputCpf;
	private JPasswordField inputPassword;

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
		setTitle("STBank");
		Date data = new Date();
		Cliente cliente1 = new Cliente("Maria", "12345678910", "maria@mail.com", data);
		Conta contaCliente1 = new Conta("Corrente", "990", "5454-3", "12345678910", "123",20000.00);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Logo");
		lblNewLabel_4.setIcon(new ImageIcon("./imagens/logo.png"));
		lblNewLabel_4.setBounds(682, 483, 75, 63);
		contentPane.add(lblNewLabel_4);

		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSair.setBounds(216, 458, 95, 29);
		contentPane.add(btnSair);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(322, 73, 118, 54);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 36));
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logica do Login
				String cpf = inputCpf.getText();
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
		btnNewButton.setBounds(444, 458, 95, 29);
		contentPane.add(btnNewButton);

		inputCpf = new JTextField();
		inputCpf.setBounds(198, 275, 368, 35);
		contentPane.add(inputCpf);
		inputCpf.setColumns(10);

		inputPassword = new JPasswordField();
		inputPassword.setBounds(198, 358, 368, 35);
		contentPane.add(inputPassword);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 21));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Selecione um tipo:", "Cliente", "Gerente", "Diretor", "Presidente" }));
		comboBox.setToolTipText("");
		comboBox.setBounds(198, 191, 368, 35);
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Usuário");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(198, 176, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(198, 263, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(198, 344, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel enterButton = new JLabel("");
		enterButton.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		enterButton.setBounds(0, 0, 787, 573);
		contentPane.add(enterButton);
	}
}
