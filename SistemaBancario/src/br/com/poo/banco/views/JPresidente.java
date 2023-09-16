package br.com.poo.banco.views;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class JPresidente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPresidente frame = new JPresidente();
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
	public JPresidente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imagens/logo.png"));
		setTitle("STBank");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textPresidente = new JLabel("Presidente");
		textPresidente.setForeground(new Color(0, 0, 128));
		textPresidente.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		textPresidente.setBounds(158, 11, 159, 41);
		contentPane.add(textPresidente);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./imagens/imagemFundo.jpeg"));
		lblNewLabel.setBounds(0, 0, 484, 428);
		contentPane.add(lblNewLabel);
	}

}
