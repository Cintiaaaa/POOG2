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

public class JSaqPou extends JFrame {
//Mensagem de saldo na tela 
	//tela de aviso: saque efetuado com sucesso ou não e por que?
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JSaque frame = new JSaqPou();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public JSaqPou() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(319, 309, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(136, 309, 113, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Saque Conta Poupança");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		lblNewLabel_1.setBounds(148, 11, 371, 40);
		contentPane.add(lblNewLabel_1);
		
		JButton buttonNao = new JButton("Não");
		buttonNao.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonNao.setBounds(395, 218, 69, 23);
		contentPane.add(buttonNao);
		
		JButton buttonSim = new JButton("Sim");
		buttonSim.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonSim.setBounds(301, 218, 69, 23);
		contentPane.add(buttonSim);
		
		JLabel lmpComp = new JLabel("Deseja imprimir o comprovante de");
		lmpComp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lmpComp.setBounds(85, 213, 212, 14);
		contentPane.add(lmpComp);
		
		JLabel ImpComprov = new JLabel("saque ao finalizar a transação?");
		ImpComprov.setFont(new Font("Tahoma", Font.BOLD, 12));
		ImpComprov.setBounds(85, 227, 212, 14);
		contentPane.add(ImpComprov);
		
		JLabel lblNewLabel_3 = new JLabel("Valor do saque:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(85, 152, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(184, 150, 113, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Seu saldo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(85, 109, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, -28, 625, 452);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Logo");
		lblNewLabel_4.setIcon(new ImageIcon("./imagens/logo.png"));
		lblNewLabel_4.setBounds(538, 365, 69, 59);
		contentPane.add(lblNewLabel_4);
	}
}
