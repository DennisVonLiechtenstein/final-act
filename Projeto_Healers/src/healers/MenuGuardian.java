package healers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MenuGuardian extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGuardian frame = new MenuGuardian();
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
	public MenuGuardian() {
		setTitle("MENU GUARDIAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU GUARDIAN");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(123, 11, 177, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("O QUE DESEJA?");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(163, 69, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("DADOS DO FALLEN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DadosFallenG dsf=new DadosFallenG();
				dsf.main(null);
				dispose();
			}
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(130, 113, 170, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TERMO DE RESPONSABILIDADE");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guardian g;
				g=new Guardian();
				try {
					g.TG();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Termo de responsabilidade enviado com sucesso!");
			}
		});
		btnNewButton_1.setBounds(101, 147, 228, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("AVALIAÇÂO");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guardian g;
				g=new Guardian();
				try {
					g.AG();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Avaliação enviada com sucesso!");
			}
		});
		btnNewButton_2.setBounds(163, 181, 113, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("VOLTAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Presents psts;
				psts=new Presents();
				psts.main(null);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setBounds(175, 215, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
