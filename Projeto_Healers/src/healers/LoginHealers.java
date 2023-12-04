package healers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginHealers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField logEmail;
	private JTextField logSenha;
	private final JButton logar = new JButton("LOGAR");

	/**
	 * Launch the application.
	 */
	public boolean escolhaLoginH=false;
	public boolean escolhaLoginF=false;
	public boolean escolhaLoginG=false;
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginHealers frame = new LoginHealers();
					
					frame.setVisible(true);
					
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginHealers() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(162, 11, 73, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(188, 126, 63, 24);
		contentPane.add(lblNewLabel_1);
		
		logEmail = new JTextField();
		logEmail.setBounds(101, 151, 205, 20);
		contentPane.add(logEmail);
		logEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SENHA:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(183, 182, 52, 14);
		contentPane.add(lblNewLabel_2);
		
		logSenha = new JTextField();
		logSenha.setBounds(101, 207, 205, 20);
		contentPane.add(logSenha);
		logSenha.setColumns(10);
		
		JButton escolhaLH = new JButton("HEALER");
		escolhaLH.setFont(new Font("Times New Roman", Font.BOLD, 12));
		escolhaLH.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				escolhaLoginH=true;
				
			}
		});
		escolhaLH.setBounds(36, 92, 89, 23);
		contentPane.add(escolhaLH);
		
		JButton escolhaF = new JButton("FALLEN");
		escolhaF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escolhaLoginF=true;
			}
		});
		escolhaF.setFont(new Font("Times New Roman", Font.BOLD, 12));
		escolhaF.setBounds(162, 92, 89, 23);
		contentPane.add(escolhaF);
		
		JButton escolhaG = new JButton("GUARDIAN");
		escolhaG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				escolhaLoginG=true;
			}
		});
		escolhaG.setFont(new Font("Times New Roman", Font.BOLD, 12));
		escolhaG.setBounds(278, 92, 101, 23);
		contentPane.add(escolhaG);
		
		JLabel lblNewLabel_3 = new JLabel("QUAL SUA FUNÇÂO?");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(140, 67, 128, 14);
		contentPane.add(lblNewLabel_3);
		logar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(escolhaLoginH!=false){
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("select * from healer where e_mail=? and senha=?");
					
					faz.setString(1,logEmail.getText());
					faz.setString(2,logSenha.getText());
					
					ResultSet rsltset=faz.executeQuery();
					
					if(rsltset.next()) {
						JOptionPane.showMessageDialog(null,"login realizado com sucesso!");
						MenuHealer mh;
						mh= new MenuHealer();
						MenuHealer.main(null);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Dados de login inválidos!");
					}
					
				}else if(escolhaLoginF!=false) {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("select * from fallen where e_mail=? and senha=?");
					
					faz.setString(1,logEmail.getText());
					faz.setString(2,logSenha.getText());
					
					ResultSet rsltset=faz.executeQuery();
					
					if(rsltset.next()) {
						JOptionPane.showMessageDialog(null,"login realizado com sucesso!");
						MenuFallen mf;
						mf=new MenuFallen();
						MenuFallen.main(null);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Dados de login inválidos!");
					}
					
					
				}else if(escolhaLoginG!=false) {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("select * from guardian where e_mail=? and senha=?");
					
					faz.setString(1,logEmail.getText());
					faz.setString(2,logSenha.getText());
					
					ResultSet rsltset=faz.executeQuery();
					
					if(rsltset.next()) {
						JOptionPane.showMessageDialog(null,"login realizado com sucesso!");
						MenuGuardian cg;
						   cg=new MenuGuardian();
						   MenuGuardian.main(null);
						   dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Dados de login inválidos!");
					}
					
					
				}
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
						
			}
				
		});
		logar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		logar.setBounds(131, 253, 137, 31);
		contentPane.add(logar);
		
		JButton limpar = new JButton("LIMPAR");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logEmail.setText(null);
				logSenha.setText(null);
			}
		});
		limpar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		limpar.setBounds(131, 295, 137, 31);
		contentPane.add(limpar);
		
		JButton btnNewButton = new JButton("VOLTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Presents prsnts=new Presents();
				prsnts.main(null);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(131, 348, 137, 24);
		contentPane.add(btnNewButton);
	}
}
	
