package healers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CadastroGuardian extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeG;
	private JTextField cpfG;
	private JTextField cidadeG;
	private JTextField estadoG;
	private JTextField ruaG;
	private JTextField bairroG;
	private JTextField telefoneG;
	private JTextField profissaoG;
	private JTextField emailG;
	private JTextField senhaG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroGuardian frame = new CadastroGuardian();
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
	public CadastroGuardian() {
		setTitle("TORNANDO SE UM GUARDIAN!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 534);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(187, 11, 74, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(310, 66, 39, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo:");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 105, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CPF:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(205, 105, 32, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cidade:");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 140, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Estado:");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setBounds(289, 140, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Rua:");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 185, 32, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Bairro:");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 224, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Numero:");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_9.setBounds(10, 260, 56, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Telefone:");
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_10.setBounds(205, 260, 56, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Profissão:");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_11.setBounds(10, 298, 66, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Disponibilidade:");
		lblNewLabel_12.setForeground(new Color(255, 0, 0));
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_12.setBounds(10, 373, 87, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Suporte:");
		lblNewLabel_13.setForeground(new Color(255, 0, 0));
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_13.setBounds(10, 337, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		nomeG = new JTextField();
		nomeG.setBounds(52, 71, 237, 20);
		contentPane.add(nomeG);
		nomeG.setColumns(10);
		
		JSpinner idadeG = new JSpinner();
		idadeG.setBounds(345, 68, 46, 20);
		contentPane.add(idadeG);
		
		JRadioButton m = new JRadioButton("m");
		m.setForeground(new Color(255, 255, 255));
		m.setBackground(new Color(255, 0, 0));
		m.setBounds(58, 101, 39, 23);
		contentPane.add(m);
		
		JRadioButton f = new JRadioButton("f");
		f.setForeground(new Color(255, 255, 255));
		f.setBackground(new Color(255, 0, 0));
		f.setBounds(99, 101, 39, 23);
		contentPane.add(f);
		
		JRadioButton o = new JRadioButton("o");
		o.setForeground(new Color(255, 255, 255));
		o.setBackground(new Color(255, 0, 0));
		o.setBounds(140, 101, 39, 23);
		contentPane.add(o);
		
		cpfG = new JTextField();
		cpfG.setBounds(232, 102, 124, 20);
		contentPane.add(cpfG);
		cpfG.setColumns(10);
		
		cidadeG = new JTextField();
		cidadeG.setBounds(52, 137, 209, 20);
		contentPane.add(cidadeG);
		cidadeG.setColumns(10);
		
		estadoG = new JTextField();
		estadoG.setBounds(329, 134, 32, 20);
		contentPane.add(estadoG);
		estadoG.setColumns(10);
		
		ruaG = new JTextField();
		ruaG.setBounds(47, 182, 221, 20);
		contentPane.add(ruaG);
		ruaG.setColumns(10);
		
		bairroG = new JTextField();
		bairroG.setBounds(50, 221, 211, 20);
		contentPane.add(bairroG);
		bairroG.setColumns(10);
		
		JSpinner numeroG = new JSpinner();
		numeroG.setBounds(62, 257, 46, 20);
		contentPane.add(numeroG);
		
		telefoneG = new JTextField();
		telefoneG.setBounds(258, 257, 103, 20);
		contentPane.add(telefoneG);
		telefoneG.setColumns(10);
		
		profissaoG = new JTextField();
		profissaoG.setBounds(75, 295, 186, 20);
		contentPane.add(profissaoG);
		profissaoG.setColumns(10);
		
		JRadioButton fina = new JRadioButton("Financeiro");
		fina.setForeground(new Color(255, 255, 255));
		fina.setBackground(new Color(255, 0, 0));
		fina.setBounds(62, 333, 87, 23);
		contentPane.add(fina);
		
		JRadioButton prof = new JRadioButton("Profissional");
		prof.setForeground(new Color(255, 255, 255));
		prof.setBackground(new Color(255, 0, 0));
		prof.setBounds(151, 333, 97, 23);
		contentPane.add(prof);
		
		JRadioButton ment = new JRadioButton("Mentorial");
		ment.setForeground(new Color(255, 255, 255));
		ment.setBackground(new Color(255, 0, 0));
		ment.setBounds(250, 333, 87, 23);
		contentPane.add(ment);
		
		JRadioButton freq = new JRadioButton("Frequente");
		freq.setForeground(new Color(255, 255, 255));
		freq.setBackground(new Color(255, 0, 0));
		freq.setBounds(101, 369, 92, 23);
		contentPane.add(freq);
		
		JRadioButton espo = new JRadioButton("Esporádico");
		espo.setForeground(new Color(255, 255, 255));
		espo.setBackground(new Color(255, 0, 0));
		espo.setBounds(195, 369, 109, 23);
		contentPane.add(espo);
		
		JRadioButton unit = new JRadioButton("Unitário");
		unit.setForeground(new Color(255, 255, 255));
		unit.setBackground(new Color(255, 0, 0));
		unit.setBounds(310, 369, 109, 23);
		contentPane.add(unit);
		
		JButton enviar = new JButton("Enviar");
		enviar.setForeground(new Color(255, 0, 0));
		enviar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("insert into guardian values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					
					faz.setString(1,emailG.getText());
					faz.setString(2,senhaG.getText());
					faz.setString(3,nomeG.getText());
					faz.setInt(4,(int)idadeG.getValue());
					
					if(m.isSelected()) {
						faz.setString(5,m.getText());
					}else if(f.isSelected()) {
						faz.setString(5,f.getText());
					}else if(o.isSelected()) {
						faz.setString(5,o.getText());
					}
					
					faz.setString(6,cpfG.getText());
					faz.setString(7,cidadeG.getText());
					faz.setString(8,estadoG.getText());
					faz.setString(9,ruaG.getText());
					faz.setString(10,bairroG.getText());
					faz.setInt(11,(int)numeroG.getValue());
					faz.setString(12,telefoneG.getText());
					faz.setString(13,profissaoG.getText());
					
					if(fina.isSelected()) {
						faz.setString(14,fina.getText());
					}else if(prof.isSelected()) {
						faz.setString(14,prof.getText());
					}else if(ment.isSelected()) {
						faz.setString(14,ment.getText());
					}
					
					if(freq.isSelected()) {
						faz.setString(15,freq.getText());
					}else if(espo.isSelected()) {
						faz.setString(15,espo.getText());
					}else if(unit.isSelected()) {
						faz.setString(15,unit.getText());
					}
					boolean numerosCpf=cpfG.getText().matches("^\\d{11}+$");
					boolean numerosTel=telefoneG.getText().matches("^\\d{11}+$");
					
					 String cpf=cpfG.getText();
					 Healer hel;
                     hel = new Healer();
					
					if((emailG.getText().endsWith(".com") && senhaG.getText().length()==8) && (nomeG.getText().length() > 0 && (int)idadeG.getValue() > 18) && 
							(m.getText().equalsIgnoreCase("m") || f.getText().equalsIgnoreCase("f") || o.getText().equalsIgnoreCase("o"))
							&& (numerosCpf==true && cidadeG.getText().length() > 0) && (estadoG.getText().length()==2 && ruaG.getText().length() > 0) &&
							(bairroG.getText().length() > 0 && (int)numeroG.getValue() > 0 ) && (numerosTel==true && profissaoG.getText().length() > 0) &&
							(fina.getText().equalsIgnoreCase("F") || prof.getText().equalsIgnoreCase("P") || ment.getText().equalsIgnoreCase("M")) &&
							(freq.getText().equalsIgnoreCase("frequente") || espo.getText().equalsIgnoreCase("esporadica") || unit.getText().equalsIgnoreCase("unitaria")) && hel.validarCPF(cpf)==true) {

						    faz.executeUpdate();
						    JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso, bem vindo Guardian!!");
						
						
					}else {
						JOptionPane.showMessageDialog(null,"Seu Cadastro apresentou algum dado inválido!");
						JOptionPane.showMessageDialog(null,"CPF verificado e considerado inválido!");
					}
					
					
					
					
					
					 
					
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		enviar.setBounds(47, 448, 89, 36);
		contentPane.add(enviar);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				emailG.setText(null);
				senhaG.setText(null);
				nomeG.setText(null);
				idadeG.setValue(0);
				m.setSelected(false);
				f.setSelected(false);	
				o.setSelected(false);
				cpfG.setText(null);
				cidadeG.setText(null);
				estadoG.setText(null);
		        ruaG.setText(null);
				bairroG.setText(null);
				numeroG.setValue(0);
				telefoneG.setText(null);
				profissaoG.setText(null);
				fina.setSelected(false);
				prof.setSelected(false);
				ment.setSelected(false);
				freq.setSelected(false);
				espo.setSelected(false);
				unit.setSelected(false);
				
				
				
				
			}
		});
		limpar.setForeground(new Color(255, 0, 0));
		limpar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		limpar.setBounds(147, 448, 89, 37);
		contentPane.add(limpar);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Presents psts;
				psts=new Presents();
				psts.main(null);
				dispose();
			}
		});
		voltar.setForeground(new Color(255, 0, 0));
		voltar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		voltar.setBounds(258, 448, 89, 36);
		contentPane.add(voltar);
		
		JLabel lblNewLabel_14 = new JLabel("Email:");
		lblNewLabel_14.setForeground(new Color(255, 0, 0));
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_14.setBounds(10, 39, 56, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Senha:");
		lblNewLabel_15.setForeground(new Color(255, 0, 0));
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_15.setBounds(258, 39, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		emailG = new JTextField();
		emailG.setBounds(52, 36, 196, 20);
		contentPane.add(emailG);
		emailG.setColumns(10);
		
		senhaG = new JTextField();
		senhaG.setBounds(295, 36, 124, 20);
		contentPane.add(senhaG);
		senhaG.setColumns(10);
	}

}
