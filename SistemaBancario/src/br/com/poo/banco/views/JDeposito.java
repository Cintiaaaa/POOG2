package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class JDeposito extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFieldContaId;
	private JTextField textField_1VDep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDeposito frame = new JDeposito();
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
	public JDeposito() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel tarifa = new JLabel("Tarifa para Depósito em Conta Corrente: R$0,10 por depósito.");
		tarifa.setForeground(new Color(255, 0, 0));
		tarifa.setFont(new Font("Tahoma", Font.BOLD, 11));
		tarifa.setBounds(72, 243, 355, 14);
		contentPane.add(tarifa);
		
		JLabel textImpComprov = new JLabel("depósito ao finalizar a transação?");
		textImpComprov.setFont(new Font("Tahoma", Font.BOLD, 11));
		textImpComprov.setBounds(72, 298, 232, 14);
		contentPane.add(textImpComprov);
		
		JLabel textImpComp = new JLabel("Deseja imprimir o comprovante de");
		textImpComp.setFont(new Font("Tahoma", Font.BOLD, 11));
		textImpComp.setBounds(72, 279, 218, 14);
		contentPane.add(textImpComp);
		
		JComboBox comboBoxDeposito = new JComboBox();
		comboBoxDeposito.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxDeposito.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Opção:", "Sim", "Não"}));
		comboBoxDeposito.setBounds(285, 279, 200, 33);
		contentPane.add(comboBoxDeposito);
		
		textField_1VDep = new JTextField();
		textField_1VDep.setColumns(10);
		textField_1VDep.setBounds(191, 207, 144, 19);
		contentPane.add(textField_1VDep);
		
		JLabel ValorDep = new JLabel("Valor para depósito:");
		ValorDep.setFont(new Font("Tahoma", Font.BOLD, 11));
		ValorDep.setBounds(72, 210, 127, 14);
		contentPane.add(ValorDep);
		
		JLabel NConta = new JLabel("Número Conta:");
		NConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		NConta.setBounds(72, 176, 88, 14);
		contentPane.add(NConta);
		
		textFieldContaId = new JTextField();
		textFieldContaId.setColumns(10);
		textFieldContaId.setBounds(160, 173, 144, 19);
		contentPane.add(textFieldContaId);
		
		JLabel Agencia = new JLabel("Agência:");
		Agencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		Agencia.setBounds(72, 146, 65, 14);
		contentPane.add(Agencia);
		btnNewButton_1.setBounds(314, 345, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(132, 345, 113, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(132, 143, 99, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione o tipo de conta:", "Conta Corrente", "Conta Poupança"}));
		comboBox.setBounds(160, 90, 285, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Logo");
		lblNewLabel_4.setIcon(new ImageIcon("./imagens/logo.png"));
		lblNewLabel_4.setBounds(528, 357, 75, 63);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, 0, 631, 447);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Depósito");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		lblNewLabel_1.setBounds(239, 25, 134, 30);
		contentPane.add(lblNewLabel_1);
	}
}
