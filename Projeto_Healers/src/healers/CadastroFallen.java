package healers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CadastroFallen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeF;
	private JTextField cpfF;
	private JTextField cidadeF;
	private final JLabel labeltelefone = new JLabel("Telefone:");
	private JTextField estadoF;
	private JTextField ruaF;
	private JTextField bairroF;
	private JTextField telefoneF;
	private JTextField profissaoF;
	private JTextField religiaoF;
	private JTextField hobbyF;
	private JTextField sonhoF;
	private JTextField emailF;
	private JTextField senhaF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFallen frame = new CadastroFallen();
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
	public CadastroFallen() {
		setTitle("SAUDAÇÕES HONORÁVEL FALLEN!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 595);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(237, 0, 83, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adversidade:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 56, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton psiq = new JRadioButton("Psiquica");
		psiq.setForeground(new Color(255, 255, 255));
		psiq.setBackground(new Color(255, 0, 0));
		psiq.setToolTipText("Psiquica");
		psiq.setBounds(80, 52, 78, 23);
		contentPane.add(psiq);
		
		JRadioButton fis = new JRadioButton("Fisica");
		fis.setForeground(new Color(255, 255, 255));
		fis.setBackground(new Color(255, 0, 0));
		fis.setToolTipText("");
		fis.setBounds(160, 52, 71, 23);
		contentPane.add(fis);
		
		JRadioButton aut = new JRadioButton("Autoestima");
		aut.setForeground(new Color(255, 255, 255));
		aut.setBackground(new Color(255, 0, 0));
		aut.setBounds(233, 52, 109, 23);
		contentPane.add(aut);
		
		JRadioButton sen = new JRadioButton("Sensorial");
		sen.setForeground(new Color(255, 255, 255));
		sen.setBackground(new Color(255, 0, 0));
		sen.setBounds(344, 52, 109, 23);
		contentPane.add(sen);
		
		JRadioButton per = new JRadioButton("Perda");
		per.setForeground(new Color(255, 255, 255));
		per.setBackground(new Color(255, 0, 0));
		per.setBounds(455, 52, 83, 23);
		contentPane.add(per);
		
		JRadioButton deg = new JRadioButton("Degenerativa Progressiva");
		deg.setForeground(new Color(255, 255, 255));
		deg.setBackground(new Color(255, 0, 0));
		deg.setBounds(210, 78, 180, 23);
		contentPane.add(deg);
		
		JLabel lblNewLabel_2 = new JLabel("Duração:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 98, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JSpinner duracaoF = new JSpinner();
		duracaoF.setBounds(64, 95, 43, 20);
		contentPane.add(duracaoF);
		
		JLabel lblNewLabel_3 = new JLabel("Interação:");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 132, 78, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton alta = new JRadioButton("Alta");
		alta.setForeground(new Color(255, 255, 255));
		alta.setBackground(new Color(255, 0, 0));
		alta.setBounds(74, 128, 64, 23);
		contentPane.add(alta);
		
		JRadioButton normal = new JRadioButton("Normal");
		normal.setForeground(new Color(255, 255, 255));
		normal.setBackground(new Color(255, 0, 0));
		normal.setBounds(140, 128, 78, 23);
		contentPane.add(normal);
		
		JRadioButton relutante = new JRadioButton("Relutante");
		relutante.setForeground(new Color(255, 255, 255));
		relutante.setBackground(new Color(255, 0, 0));
		relutante.setBounds(220, 128, 91, 23);
		contentPane.add(relutante);
		
		JLabel lblNewLabel_4 = new JLabel("Nome:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 167, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Idade:");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(344, 167, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 203, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CPF:");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(233, 203, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Cidade:");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 241, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		nomeF = new JTextField();
		nomeF.setBounds(52, 164, 259, 20);
		contentPane.add(nomeF);
		nomeF.setColumns(10);
		
		JSpinner idadeF = new JSpinner();
		idadeF.setBounds(381, 164, 37, 20);
		contentPane.add(idadeF);
		
		JRadioButton m = new JRadioButton("m");
		m.setForeground(new Color(255, 255, 255));
		m.setBackground(new Color(255, 0, 0));
		m.setBounds(60, 199, 43, 23);
		contentPane.add(m);
		
		JRadioButton f = new JRadioButton("f");
		f.setForeground(new Color(255, 255, 255));
		f.setBackground(new Color(255, 0, 0));
		f.setBounds(105, 199, 43, 23);
		contentPane.add(f);
		
		JRadioButton o = new JRadioButton("o");
		o.setForeground(new Color(255, 255, 255));
		o.setBackground(new Color(255, 0, 0));
		o.setBounds(150, 199, 43, 23);
		contentPane.add(o);
		
		cpfF = new JTextField();
		cpfF.setBounds(272, 200, 118, 20);
		contentPane.add(cpfF);
		cpfF.setColumns(10);
		
		cidadeF = new JTextField();
		cidadeF.setBounds(52, 238, 179, 20);
		contentPane.add(cidadeF);
		cidadeF.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Estado:");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_9.setBounds(241, 241, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Rua:");
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_10.setBounds(329, 241, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Bairro:");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_11.setBounds(10, 277, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel labelNumero = new JLabel("Numero:");
		labelNumero.setForeground(new Color(255, 0, 0));
		labelNumero.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelNumero.setBounds(245, 277, 54, 14);
		contentPane.add(labelNumero);
		labeltelefone.setForeground(new Color(255, 0, 0));
		labeltelefone.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labeltelefone.setBounds(351, 273, 71, 23);
		contentPane.add(labeltelefone);
		
		estadoF = new JTextField();
		estadoF.setBounds(282, 238, 37, 20);
		contentPane.add(estadoF);
		estadoF.setColumns(10);
		
		ruaF = new JTextField();
		ruaF.setBounds(358, 238, 180, 20);
		contentPane.add(ruaF);
		ruaF.setColumns(10);
		
		bairroF = new JTextField();
		bairroF.setBounds(52, 274, 179, 20);
		contentPane.add(bairroF);
		bairroF.setColumns(10);
		
		telefoneF = new JTextField();
		telefoneF.setBounds(409, 274, 129, 20);
		contentPane.add(telefoneF);
		telefoneF.setColumns(10);
		
		JSpinner numeroF = new JSpinner();
		numeroF.setBounds(292, 274, 50, 20);
		contentPane.add(numeroF);
		
		JLabel lblNewLabel_14 = new JLabel("Profissão:");
		lblNewLabel_14.setForeground(new Color(255, 0, 0));
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_14.setBounds(10, 313, 64, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Estado Civil:");
		lblNewLabel_15.setForeground(new Color(255, 0, 0));
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_15.setBounds(241, 313, 87, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Filhos:");
		lblNewLabel_16.setForeground(new Color(255, 0, 0));
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_16.setBounds(10, 350, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Religião:");
		lblNewLabel_17.setForeground(new Color(255, 0, 0));
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_17.setBounds(181, 350, 71, 14);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Hobbys:");
		lblNewLabel_18.setForeground(new Color(255, 0, 0));
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_18.setBounds(10, 394, 46, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Maior sonho:");
		lblNewLabel_19.setForeground(new Color(255, 0, 0));
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_19.setBounds(10, 430, 72, 14);
		contentPane.add(lblNewLabel_19);
		
		profissaoF = new JTextField();
		profissaoF.setBounds(64, 310, 167, 20);
		contentPane.add(profissaoF);
		profissaoF.setColumns(10);
		
		JRadioButton casado = new JRadioButton("Casado");
		casado.setForeground(new Color(255, 255, 255));
		casado.setBackground(new Color(255, 0, 0));
		casado.setBounds(310, 309, 78, 23);
		contentPane.add(casado);
		
		JRadioButton solteiro = new JRadioButton("Solteiro");
		solteiro.setForeground(new Color(255, 255, 255));
		solteiro.setBackground(new Color(255, 0, 0));
		solteiro.setBounds(390, 309, 71, 23);
		contentPane.add(solteiro);
		
		JRadioButton viuvo = new JRadioButton("Viúvo");
		viuvo.setForeground(new Color(255, 255, 255));
		viuvo.setBackground(new Color(255, 0, 0));
		viuvo.setBounds(463, 309, 78, 23);
		contentPane.add(viuvo);
		
		JRadioButton sim = new JRadioButton("sim");
		sim.setForeground(new Color(255, 255, 255));
		sim.setBackground(new Color(255, 0, 0));
		sim.setBounds(53, 346, 54, 23);
		contentPane.add(sim);
		
		JRadioButton nao = new JRadioButton("não");
		nao.setForeground(new Color(255, 255, 255));
		nao.setBackground(new Color(255, 0, 0));
		nao.setBounds(122, 346, 53, 23);
		contentPane.add(nao);
		
		religiaoF = new JTextField();
		religiaoF.setBounds(233, 347, 157, 20);
		contentPane.add(religiaoF);
		religiaoF.setColumns(10);
		
		hobbyF = new JTextField();
		hobbyF.setBounds(52, 391, 486, 20);
		contentPane.add(hobbyF);
		hobbyF.setColumns(10);
		
		sonhoF = new JTextField();
		sonhoF.setBounds(80, 427, 458, 20);
		contentPane.add(sonhoF);
		sonhoF.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("insert into fallen values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					
					faz.setString(1,emailF.getText());
					faz.setString(2,senhaF.getText());
					
					if(psiq.isSelected()) {
						faz.setString(3,psiq.getText());
					}else if(fis.isSelected()) {
						faz.setString(3,fis.getText());
					}else if(aut.isSelected()) {
						faz.setString(3,aut.getText());
					}else if(sen.isSelected()) {
						faz.setString(3,sen.getText());
					}else if(per.isSelected()) {
						faz.setString(3,per.getText());
					}else if(deg.isSelected()) {
						faz.setString(3,deg.getText());
					}
					
					faz.setInt(4,(int)duracaoF.getValue());
					
					if(alta.isSelected()) {
						faz.setString(5,alta.getText());
					}else if(normal.isSelected()) {
						faz.setString(5,normal.getText());
					}else if(relutante.isSelected()) {
						faz.setString(5,relutante.getText());
					}
					
					faz.setString(6,nomeF.getText());
					faz.setInt(7,(int)idadeF.getValue());
					
					if(m.isSelected()) {
						faz.setString(8,m.getText());
					}else if(f.isSelected()) {
						faz.setString(8,f.getText());
					}else if(o.isSelected()) {
						faz.setString(8,o.getText());
					}
					
					faz.setString(9,cpfF.getText());
					faz.setString(10,cidadeF.getText());
					faz.setString(11,estadoF.getText());
			        faz.setString(12,ruaF.getText());
					faz.setString(13,bairroF.getText());
					faz.setInt(14,(int)numeroF.getValue());
					faz.setString(15,telefoneF.getText());
					faz.setString(16,profissaoF.getText());
					
					if(casado.isSelected()) {
						faz.setString(17,casado.getText());
					}else if(solteiro.isSelected()) {
						faz.setString(17,solteiro.getText());
					}else if(viuvo.isSelected()) {
						faz.setString(17,viuvo.getText());
					}
					
					if(sim.isSelected()) {
					   faz.setString(18,sim.getText());
					}else if(nao.isSelected()) {
						faz.setString(18,nao.getText());
					}
					
					faz.setString(19,religiaoF.getText());
					faz.setString(20,hobbyF.getText());
					faz.setString(21,sonhoF.getText());
					
					boolean numerosCpf=cpfF.getText().matches("^\\d{11}+$");
					boolean numerosTel=telefoneF.getText().matches("^\\d{11}+$");
					 String cpf=cpfF.getText();
					 Healer hel;
                     hel = new Healer();
					
					if((emailF.getText().endsWith(".com") && senhaF.getText().length()==8) && (psiq.getText().equalsIgnoreCase("Psiquica") || fis.getText().equalsIgnoreCase("Fisica") || aut.getText().equalsIgnoreCase("Autoestima")
							|| sen.getText().equalsIgnoreCase("Sensorial") || per.getText().equalsIgnoreCase("Perda") || deg.getText().equalsIgnoreCase("Progressiva degenerativa"))  && ((int) duracaoF.getValue() > 0 && (int) duracaoF.getValue()< 100)
							&& (alta.getText().equalsIgnoreCase("alta") || normal.getText().equalsIgnoreCase("normal") || relutante.getText().equalsIgnoreCase("relutante")) && (nomeF.getText().length() > 0 &&
							(int)idadeF.getValue() > 18) && ((int)idadeF.getValue() < 100 && m.getText().equalsIgnoreCase("m") || f.getText().equalsIgnoreCase("f") || o.getText().equalsIgnoreCase("o")) && (numerosCpf==true &&
							 cidadeF.getText().length() > 0) && (estadoF.getText().length()==2 && ruaF.getText().length() > 0) && (bairroF.getText().length() > 0 && (int)numeroF.getValue() > 0) &&
							(numerosTel==true && profissaoF.getText().length() > 0) && (casado.getText().equalsIgnoreCase("Casado") || solteiro.getText().equalsIgnoreCase("Solteiro") ||
							viuvo.getText().equalsIgnoreCase("Viúvo")) && (sim.getText().equalsIgnoreCase("Sim") || 
							nao.getText().equalsIgnoreCase("Não")) && (religiaoF.getText().length() > 0 && hobbyF.getText().length() > 0 && sonhoF.getText().length() > 4)&& hel.validarCPF(cpf)==true){
							
										
										faz.executeUpdate();
										JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso, bem vindo Fallen!!");
							}else {
								JOptionPane.showMessageDialog(null,"Seu Cadastro apresentou algum dado inválido!");
								JOptionPane.showMessageDialog(null,"CPF verificado e considerado inválido!");
								
							}
				
				    // faz.executeUpdate();
					
					
					
					//Falta implementar, consegui em cima da hora
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(122, 485, 89, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emailF.setText(null);
				senhaF.setText(null);
				psiq.setSelected(false);
				fis.setSelected(false);
				aut.setSelected(false);
				sen.setSelected(false);
				per.setSelected(false);
				deg.setSelected(false);
				duracaoF.setValue(0);
				alta.setSelected(false);
				normal.setSelected(false);
				relutante.setSelected(false);
				nomeF.setText(null);
				idadeF.setValue(0);
				m.setSelected(false);
				f.setSelected(false);	
				o.setSelected(false);
				cpfF.setText(null);
				cidadeF.setText(null);
				estadoF.setText(null);
		        ruaF.setText(null);
				bairroF.setText(null);
				numeroF.setValue(0);
				telefoneF.setText(null);
				profissaoF.setText(null);
			    casado.setSelected(false);
				solteiro.setSelected(false);	
				viuvo.setSelected(false);
				sim.setSelected(false);
				nao.setSelected(false);
				religiaoF.setText(null);
				hobbyF.setText(null);
				sonhoF.setText(null);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(233, 487, 89, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Presents psts;
				psts=new Presents();
				psts.main(null);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(344, 487, 89, 35);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_20 = new JLabel("Email:");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_20.setForeground(new Color(255, 0, 0));
		lblNewLabel_20.setBounds(10, 28, 109, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Senha:");
		lblNewLabel_21.setForeground(new Color(255, 0, 0));
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_21.setBounds(310, 28, 46, 14);
		contentPane.add(lblNewLabel_21);
		
		emailF = new JTextField();
		emailF.setBounds(52, 25, 225, 20);
		contentPane.add(emailF);
		emailF.setColumns(10);
		
		senhaF = new JTextField();
		senhaF.setBounds(353, 25, 139, 20);
		contentPane.add(senhaF);
		senhaF.setColumns(10);
	}
}
