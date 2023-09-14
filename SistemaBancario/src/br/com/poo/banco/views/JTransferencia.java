package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JTransferencia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFieldDest;
	private JTextField textFieldAg;
	private JTextField textFieldNConta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTransferencia frame = new JTransferencia();
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
	public JTransferencia() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tarifa para Transferência em Conta Corrente: R$0,20 por transferência.");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(27, 250, 466, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBoxOpcao = new JComboBox();
		comboBoxOpcao.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxOpcao.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção", "Sim", "Não"}));
		comboBoxOpcao.setBounds(251, 283, 189, 22);
		contentPane.add(comboBoxOpcao);
		
		JLabel textComprov = new JLabel("transferência ao finalizar a transação?");
		textComprov.setFont(new Font("Tahoma", Font.BOLD, 11));
		textComprov.setBounds(26, 303, 230, 14);
		contentPane.add(textComprov);
		
		JLabel textComp = new JLabel("Deseja imprimir o comprovante de");
		textComp.setFont(new Font("Tahoma", Font.BOLD, 11));
		textComp.setBounds(26, 284, 204, 14);
		contentPane.add(textComp);
		
		JLabel textNConta = new JLabel("Número Conta: ");
		textNConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNConta.setBounds(26, 162, 113, 14);
		contentPane.add(textNConta);
		
		textFieldNConta = new JTextField();
		textFieldNConta.setColumns(10);
		textFieldNConta.setBounds(142, 162, 134, 20);
		contentPane.add(textFieldNConta);
		
		JComboBox comboBoxTipoCont = new JComboBox();
		comboBoxTipoCont.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxTipoCont.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção:", "Conta Corrente", "Conta Poupança"}));
		comboBoxTipoCont.setBounds(142, 105, 217, 22);
		contentPane.add(comboBoxTipoCont);
		
		textFieldAg = new JTextField();
		textFieldAg.setColumns(10);
		textFieldAg.setBounds(142, 134, 134, 20);
		contentPane.add(textFieldAg);
		
		JLabel textTipoCont = new JLabel("Tipo de Conta:");
		textTipoCont.setFont(new Font("Tahoma", Font.BOLD, 11));
		textTipoCont.setBounds(25, 109, 113, 14);
		contentPane.add(textTipoCont);
		
		JLabel textAgDest = new JLabel("Agência:");
		textAgDest.setFont(new Font("Tahoma", Font.BOLD, 11));
		textAgDest.setBounds(27, 137, 113, 14);
		contentPane.add(textAgDest);
		
		textFieldDest = new JTextField();
		textFieldDest.setBounds(141, 77, 271, 20);
		contentPane.add(textFieldDest);
		textFieldDest.setColumns(10);
		
		JLabel textDest = new JLabel("Nome destinatário:");
		textDest.setFont(new Font("Tahoma", Font.BOLD, 11));
		textDest.setBounds(26, 80, 113, 14);
		contentPane.add(textDest);
		
		JLabel lblNewLabel_4 = new JLabel("Logo");
		lblNewLabel_4.setIcon(new ImageIcon("./imagens/logo.png"));
		lblNewLabel_4.setBounds(539, 355, 69, 69);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(163, 362, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(353, 362, 113, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(163, 205, 115, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor da Transferência:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(26, 206, 146, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel Transf = new JLabel("Transferência");
		Transf.setForeground(new Color(0, 0, 128));
		Transf.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		Transf.setBounds(197, 14, 204, 39);
		contentPane.add(Transf);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, 0, 629, 445);
		contentPane.add(lblNewLabel);
	}
}
