package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.poo.Enums.ContaEnum;
import br.com.poo.Enums.PessoaEnum;
import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Funcionario;

public class JLogin extends JFrame {

	private JPanel contentPane;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		Date data = new Date();

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

		JComboBox boxTipoConta = new JComboBox();
		boxTipoConta.setEnabled(false);
		boxTipoConta.setModel(new DefaultComboBoxModel(
				new String[] { "Selecione um tipo de conta:", "Conta Corrente", "Conta Poupança" }));
		boxTipoConta.setToolTipText("");
		boxTipoConta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boxTipoConta.setBounds(120, 317, 368, 35);
		contentPane.add(boxTipoConta);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String selecao = comboBox.getSelectedItem().toString();
				if (selecao.equalsIgnoreCase(PessoaEnum.CLIENTE.getTipoPessoa())) {
					boxTipoConta.setEnabled(true);
				} else {
					boxTipoConta.setEnabled(false);
				}
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Selecione um tipo:", "Cliente", "Gerente", "Diretor", "Presidente" }));
		comboBox.setToolTipText("");
		comboBox.setBounds(120, 108, 368, 35);
		contentPane.add(comboBox);

		try {
			MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
			JTextField inputCpf = new JFormattedTextField(mascaraCpf);
//			System.out.println(mascaraCpf + " " + inputCpf);
			inputCpf.setColumns(10);
			inputCpf.setBounds(120, 177, 200, 32);
			contentPane.add(inputCpf);

			JButton btnNewButton = new JButton("Entrar");
			btnNewButton.addActionListener(e -> {
//			public void actionPerformed(ActionEvent e) {

				mascaraCpf.setValueContainsLiteralCharacters(true);
				String cpf;
				try {
					cpf = mascaraCpf.valueToString(inputCpf.getText());

				String senha = new String(inputPassword.getPassword());

				Cliente c = Cliente.mapaClientes.get(cpf);
				Funcionario f = Funcionario.mapaFuncionario.get(cpf);
				Conta c1 = Conta.mapaContas.get(cpf);

				System.out.println(c.getCpf() + " " + c.getSenha() + " " + cpf + " " + senha);

				// validação de cpf e senha
				if ((c.getCpf().equals(cpf) && c.getSenha().equals(senha))
						|| (f.getCpf().equals(cpf) && f.getSenha().equals(senha))) {
					// quem está logando
					// cliente
					if (comboBox.getSelectedItem().toString().equalsIgnoreCase(PessoaEnum.CLIENTE.getTipoPessoa())) {
						// verificação de tipo de conta
						if (c1.getTipo().equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
							dispose();
							JContaCorrente jConCor = new JContaCorrente();
							jConCor.setLocationRelativeTo(jConCor);
							jConCor.setVisible(true);
						} else {
							dispose();
							JContaPoupanca jConPou = new JContaPoupanca();
							jConPou.setLocationRelativeTo(jConPou);
							jConPou.setVisible(true);
						}
					}
					// gerente
					else if (comboBox.getSelectedItem().toString().equals(PessoaEnum.GERENTE.getTipoPessoa())) {
//						dispose();
//						JGerente jGer = new JGerente();
//						jGer.setLocationRelativeTo(jGer);
//						jGer.setVisible(true);
					}
					// diretor
					else if (comboBox.getSelectedItem().toString().equals(PessoaEnum.DIRETOR.getTipoPessoa())) {
//						dispose();
//						JGerente jGer = new JGerente();
//						jGer.setLocationRelativeTo(jGer);
//						jGer.setVisible(true);
					}
					// presidente
					else if (comboBox.getSelectedItem().toString().equals(PessoaEnum.PRESIDENTE.getTipoPessoa())) {
//						dispose();
//						JGerente jGer = new JGerente();
//						jGer.setLocationRelativeTo(jGer);
//						jGer.setVisible(true);
					}
				}
				// }
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnNewButton.setBounds(240, 374, 95, 29);
			contentPane.add(btnNewButton);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		inputPassword = new JPasswordField();
		inputPassword.setBounds(120, 243, 368, 35);
		contentPane.add(inputPassword);

		JLabel lblNewLabel_1 = new JLabel("Usuário");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(120, 93, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel textcpf = new JLabel("CPF");
		textcpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		textcpf.setBounds(120, 163, 46, 14);
		contentPane.add(textcpf);

		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(120, 229, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel textCPF = new JLabel("");
		textCPF.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		textCPF.setBounds(0, 0, 613, 431);
		contentPane.add(textCPF);
	}
}