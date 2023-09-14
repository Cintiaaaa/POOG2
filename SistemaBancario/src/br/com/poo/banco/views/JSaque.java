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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class JSaque extends JFrame {
//Mensagem de saldo na tela 
	//tela de aviso: saque efetuado com sucesso ou não e por que?
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSaque frame = new JSaque();
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
	public JSaque() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TarifaSaque = new JLabel("Tarifa para Saque em Conta Corrente: R$0,10 por saque.");
		TarifaSaque.setFont(new Font("Tahoma", Font.BOLD, 11));
		TarifaSaque.setForeground(new Color(255, 0, 0));
		TarifaSaque.setBounds(85, 196, 420, 14);
		contentPane.add(TarifaSaque);
		
		JComboBox comboBoxImpComp = new JComboBox();
		comboBoxImpComp.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxImpComp.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção:", "Sim", "Não"}));
		comboBoxImpComp.setBounds(287, 238, 181, 35);
		contentPane.add(comboBoxImpComp);
		
		JLabel ImpComprov = new JLabel("saque ao finalizar a transação?");
		ImpComprov.setFont(new Font("Tahoma", Font.BOLD, 11));
		ImpComprov.setBounds(85, 252, 212, 14);
		contentPane.add(ImpComprov);
		
		JLabel lmpComp = new JLabel("Deseja imprimir o comprovante de");
		lmpComp.setFont(new Font("Tahoma", Font.BOLD, 11));
		lmpComp.setBounds(85, 238, 212, 14);
		contentPane.add(lmpComp);
		
		JLabel lblNewLabel_2 = new JLabel("Seu saldo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(85, 126, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Logo");
		lblNewLabel_4.setIcon(new ImageIcon("./imagens/logo.png"));
		lblNewLabel_4.setBounds(538, 365, 69, 59);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(343, 309, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(136, 309, 113, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(184, 151, 113, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione o tipo de conta:", "Conta Corrente", "Conta Poupança"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(159, 74, 309, 31);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Valor do saque:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(85, 157, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Saque");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		lblNewLabel_1.setBounds(264, 11, 104, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, -20, 625, 452);
		contentPane.add(lblNewLabel);
	}
}
