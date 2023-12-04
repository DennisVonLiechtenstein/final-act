package healers;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.PreparableStatement;

//import com.mysql.cj.xdevapi.PreparableStatement;
public class CadastroHealer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeH;
	private JTextField cpfH;
	private JTextField cidadeH;
	private JTextField estadoH;
	private JTextField ruaH;
	private JTextField bairroH;
	private JTextField telefoneH;
	private JTextField profissaoH;
	private JTextField religiaoH;
	private JTextField hobbyH;
	private JTextField sonhoH;
	private JTextField emailH;
	private JTextField senhaH;
	
	private static final String URL="jdbc:mysql://localhost:3306/projeto_healer";
	private static final String USUARIO="root";
	private static final String SENHA="umobugaisfeiditao";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroHealer frame = new CadastroHealer();
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
	public CadastroHealer() {
		setTitle("TORNANDO SE UM HEALER!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Experiência:");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 66, 79, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton opPsiq = new JRadioButton("Psiquica");
		opPsiq.setBackground(new Color(255, 0, 0));
		opPsiq.setForeground(new Color(255, 255, 255));
		opPsiq.setBounds(75, 62, 79, 23);
		contentPane.add(opPsiq);
		
		JRadioButton opfis = new JRadioButton("Fisica");
		opfis.setBackground(new Color(255, 0, 0));
		opfis.setForeground(new Color(255, 255, 255));
		opfis.setBounds(156, 62, 69, 23);
		contentPane.add(opfis);
		
		JLabel lblNewLabel_1 = new JLabel("CADASTRO");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(232, 0, 102, 23);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton opAut = new JRadioButton("Autoestima");
		opAut.setForeground(new Color(255, 255, 255));
		opAut.setBackground(new Color(255, 0, 0));
		opAut.setBounds(227, 62, 98, 23);
		contentPane.add(opAut);
		
		JRadioButton opSen = new JRadioButton("Sensorial");
		opSen.setBackground(new Color(255, 0, 0));
		opSen.setForeground(new Color(255, 255, 255));
		opSen.setBounds(327, 62, 98, 23);
		contentPane.add(opSen);
		
		JRadioButton opPer = new JRadioButton("Perda");
		opPer.setBackground(new Color(255, 0, 0));
		opPer.setForeground(new Color(255, 255, 255));
		opPer.setBounds(427, 62, 69, 23);
		contentPane.add(opPer);
		
		JRadioButton opDeg = new JRadioButton(" Progressiva degenerativa");
		opDeg.setBackground(new Color(255, 0, 0));
		opDeg.setForeground(new Color(255, 255, 255));
		opDeg.setBounds(185, 88, 179, 23);
		contentPane.add(opDeg);
		
		JLabel lblNewLabel_2 = new JLabel("Duração:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(10, 108, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		JSpinner duracaoH = new JSpinner();
		duracaoH.setBounds(62, 105, 46, 20);
		contentPane.add(duracaoH);
		
		JLabel lblNewLabel_3 = new JLabel("Disponibilidade:");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 147, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton opAlta = new JRadioButton("alta");
		opAlta.setBackground(new Color(255, 0, 0));
		opAlta.setForeground(new Color(255, 255, 255));
		opAlta.setBounds(103, 143, 109, 23);
		contentPane.add(opAlta);
		
		JRadioButton opMedia = new JRadioButton("media");
		opMedia.setBackground(new Color(255, 0, 0));
		opMedia.setForeground(new Color(255, 255, 255));
		opMedia.setBounds(225, 143, 109, 23);
		contentPane.add(opMedia);
		
		JRadioButton opBaixo = new JRadioButton("baixa");
		opBaixo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		opBaixo.setForeground(new Color(255, 255, 255));
		opBaixo.setBackground(new Color(255, 0, 0));
		opBaixo.setBounds(345, 143, 109, 23);
		contentPane.add(opBaixo);
		
		JLabel lblNewLabel_4 = new JLabel("Nome:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 184, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		nomeH = new JTextField();
		nomeH.setBounds(50, 181, 284, 20);
		contentPane.add(nomeH);
		nomeH.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Idade:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(378, 184, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JSpinner idadeH = new JSpinner();
		idadeH.setBounds(415, 181, 51, 20);
		contentPane.add(idadeH);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setBounds(10, 224, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JRadioButton opM = new JRadioButton("m");
		opM.setForeground(new Color(255, 255, 255));
		opM.setBackground(new Color(255, 0, 0));
		opM.setBounds(51, 220, 38, 23);
		contentPane.add(opM);
		
		JRadioButton opF = new JRadioButton("f");
		opF.setForeground(new Color(255, 255, 255));
		opF.setBackground(new Color(255, 0, 0));
		opF.setBounds(103, 220, 38, 23);
		contentPane.add(opF);
		
		JRadioButton opO = new JRadioButton("o");
		opO.setForeground(new Color(255, 255, 255));
		opO.setBackground(new Color(255, 0, 0));
		opO.setBounds(155, 220, 38, 23);
		contentPane.add(opO);
		
		JLabel lblNewLabel_7 = new JLabel("CPF:");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(232, 224, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		cpfH = new JTextField();
		cpfH.setBounds(265, 221, 86, 20);
		contentPane.add(cpfH);
		cpfH.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Cidade:");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 263, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		cidadeH = new JTextField();
		cidadeH.setBounds(55, 260, 157, 20);
		contentPane.add(cidadeH);
		cidadeH.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Estado:");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_9.setBounds(225, 263, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		estadoH = new JTextField();
		estadoH.setBounds(265, 260, 38, 20);
		contentPane.add(estadoH);
		estadoH.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Rua:");
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_10.setBounds(313, 263, 38, 14);
		contentPane.add(lblNewLabel_10);
		
		ruaH = new JTextField();
		ruaH.setBounds(345, 260, 192, 20);
		contentPane.add(ruaH);
		ruaH.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Bairro:");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_11.setBounds(10, 299, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		bairroH = new JTextField();
		bairroH.setBounds(55, 296, 157, 20);
		contentPane.add(bairroH);
		bairroH.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Numero:");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_12.setForeground(new Color(255, 0, 0));
		lblNewLabel_12.setBounds(225, 299, 53, 14);
		contentPane.add(lblNewLabel_12);
		
		JSpinner numeroH = new JSpinner();
		numeroH.setBounds(275, 296, 46, 20);
		contentPane.add(numeroH);
		
		JLabel lblNewLabel_13 = new JLabel("Telefone:");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_13.setForeground(new Color(255, 0, 0));
		lblNewLabel_13.setBounds(336, 299, 69, 14);
		contentPane.add(lblNewLabel_13);
		
		telefoneH = new JTextField();
		telefoneH.setBounds(392, 296, 102, 20);
		contentPane.add(telefoneH);
		telefoneH.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Profissão:");
		lblNewLabel_14.setForeground(new Color(255, 0, 0));
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_14.setBounds(10, 329, 69, 14);
		contentPane.add(lblNewLabel_14);
		
		profissaoH = new JTextField();
		profissaoH.setBounds(62, 326, 150, 20);
		contentPane.add(profissaoH);
		profissaoH.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Estado civil:");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_15.setForeground(new Color(255, 0, 0));
		lblNewLabel_15.setBounds(225, 329, 78, 14);
		contentPane.add(lblNewLabel_15);
		
		JRadioButton opCas = new JRadioButton("Casado");
		opCas.setBackground(new Color(255, 0, 0));
		opCas.setForeground(new Color(255, 255, 255));
		opCas.setBounds(295, 325, 69, 23);
		contentPane.add(opCas);
		
		JRadioButton opSol = new JRadioButton("Solteiro");
		opSol.setBackground(new Color(255, 0, 0));
		opSol.setForeground(new Color(255, 255, 255));
		opSol.setBounds(366, 325, 69, 23);
		contentPane.add(opSol);
		
		JRadioButton opViu = new JRadioButton("Viúvo");
		opViu.setBackground(new Color(255, 0, 0));
		opViu.setForeground(new Color(255, 255, 255));
		opViu.setBounds(438, 325, 69, 23);
		contentPane.add(opViu);
		
		JLabel lblNewLabel_16 = new JLabel("Filhos:");
		lblNewLabel_16.setForeground(new Color(255, 0, 0));
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_16.setBounds(10, 359, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JRadioButton opSim = new JRadioButton("sim");
		opSim.setForeground(new Color(255, 255, 255));
		opSim.setBackground(new Color(255, 0, 0));
		opSim.setBounds(62, 355, 54, 23);
		contentPane.add(opSim);
		
		JRadioButton opNao = new JRadioButton("não");
		opNao.setForeground(new Color(255, 255, 255));
		opNao.setBackground(new Color(255, 0, 0));
		opNao.setBounds(118, 355, 51, 23);
		contentPane.add(opNao);
		
		JLabel lblNewLabel_17 = new JLabel("Religião:");
		lblNewLabel_17.setForeground(new Color(255, 0, 0));
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_17.setBounds(175, 359, 57, 14);
		contentPane.add(lblNewLabel_17);
		
		religiaoH = new JTextField();
		religiaoH.setBounds(232, 356, 116, 20);
		contentPane.add(religiaoH);
		religiaoH.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Hobys:");
		lblNewLabel_18.setForeground(new Color(255, 0, 0));
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_18.setBounds(10, 395, 57, 14);
		contentPane.add(lblNewLabel_18);
		
		hobbyH = new JTextField();
		hobbyH.setBounds(62, 392, 475, 20);
		contentPane.add(hobbyH);
		hobbyH.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Maior sonho:");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_19.setForeground(new Color(255, 0, 0));
		lblNewLabel_19.setBounds(10, 427, 79, 14);
		contentPane.add(lblNewLabel_19);
		
		sonhoH = new JTextField();
		sonhoH.setBounds(95, 423, 442, 20);
		contentPane.add(sonhoH);
		sonhoH.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("insert into healer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					 faz.setString(1,emailH.getText());
					 faz.setString(2,senhaH.getText());
					
					if(opPsiq.isSelected()) {
						faz.setString(3,opPsiq.getText());
					}else if(opfis.isSelected()) {
						faz.setString(3,opfis.getText());
					}else if(opAut.isSelected()) {
						faz.setString(3,opAut.getText());
					}else if(opSen.isSelected()) {
						faz.setString(3,opSen.getText());
					}else if(opPer.isSelected()) {
						faz.setString(3,opPer.getText());
					}else if(opDeg.isSelected()) {
						faz.setString(3,opDeg.getText());
					}
					faz.setInt(4,(int) duracaoH.getValue());
					
					if(opAlta.isSelected()) {
						faz.setString(5,opAlta.getText());
					}else if(opMedia.isSelected()) {
						faz.setString(5,opMedia.getText());
					}else if(opBaixo.isSelected()) {
						faz.setString(5,opBaixo.getText());
					}
					faz.setString(6,nomeH.getText());
					faz.setInt(7,(int)idadeH.getValue());
					
					if(opM.isSelected()) {
						faz.setString(8,opM.getText());
					}else if(opF.isSelected()) {
						faz.setString(8,opF.getText());
					}else if(opO.isSelected()) {
						faz.setString(8,opO.getText());
					}
					faz.setString(9,cpfH.getText());
					faz.setString(10,cidadeH.getText());
					faz.setString(11,estadoH.getText());
			        faz.setString(12,ruaH.getText());
					faz.setString(13,bairroH.getText());
					faz.setInt(14,(int)numeroH.getValue());
					faz.setString(15,telefoneH.getText());
					faz.setString(16,profissaoH.getText());
					
					if(opCas.isSelected()) {
						faz.setString(17,opCas.getText());
					}else if(opSol.isSelected()) {
						faz.setString(17,opSol.getText());
					}else if(opViu.isSelected()) {
						faz.setString(17,opViu.getText());
					}
					
					if(opSim.isSelected()) {
					   faz.setString(18,opSim.getText());
					}else if(opNao.isSelected()) {
						faz.setString(18,opNao.getText());
					}
					
					faz.setString(19,religiaoH.getText());
					faz.setString(20,hobbyH.getText());
					faz.setString(21,sonhoH.getText());
					
					 String cpf=cpfH.getText();
					 Healer hel;
                     hel = new Healer();
					
					boolean numerosCpf=cpfH.getText().matches("^\\d{11}+$");
					boolean numerosTel=telefoneH.getText().matches("^\\d{11}+$");
						
					if((emailH.getText().endsWith(".com") && senhaH.getText().length()==8) && (opPsiq.getText().equalsIgnoreCase("Psiquica") || opfis.getText().equalsIgnoreCase("Fisica") || opAut.getText().equalsIgnoreCase("Autoestima")
			|| opSen.getText().equalsIgnoreCase("Sensorial") || opPer.getText().equalsIgnoreCase("Perda") || opDeg.getText().equalsIgnoreCase("Progressiva degenerativa"))  && ((int) duracaoH.getValue() > 0 && (int) duracaoH.getValue()< 100)
			&& (opAlta.getText().equalsIgnoreCase("alta") || opMedia.getText().equalsIgnoreCase("media") || opBaixo.getText().equalsIgnoreCase("baixa")) && (nomeH.getText().length() > 0 &&
			(int)idadeH.getValue() > 18) && ((int)idadeH.getValue() < 100 && opM.getText().equalsIgnoreCase("m") || opF.getText().equalsIgnoreCase("f") || opO.getText().equalsIgnoreCase("o")) && (numerosCpf==true &&
			 cidadeH.getText().length() > 0) && (estadoH.getText().length()==2 && ruaH.getText().length() > 0) && (bairroH.getText().length() > 0 && (int)numeroH.getValue() > 0) &&
			(numerosTel==true && profissaoH.getText().length() > 0) && (opCas.getText().equalsIgnoreCase("Casado") || opSol.getText().equalsIgnoreCase("Solteiro") ||
			opViu.getText().equalsIgnoreCase("Viúvo")) && (opSim.getText().equalsIgnoreCase("Sim") || 
			opNao.getText().equalsIgnoreCase("Não")) && (religiaoH.getText().length() > 0 && hobbyH.getText().length() > 0 && sonhoH.getText().length() > 4) && hel.validarCPF(cpf)==true){
			
      
						faz.executeUpdate();
						//JOptionPane.showMessageDialog(null,"CPF verificado e autenticado!");
						JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso, bem vindo Healer!!");
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
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(118, 477, 89, 36);
		contentPane.add(btnNewButton);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				emailH.setText(null);
				senhaH.setText(null);
				opPsiq.setSelected(false);
				opfis.setSelected(false);
				opAut.setSelected(false);
				opSen.setSelected(false);
				opPer.setSelected(false);
				opDeg.setSelected(false);
				duracaoH.setValue(0);
				opAlta.setSelected(false);
				opMedia.setSelected(false);
				opBaixo.setSelected(false);
				nomeH.setText(null);
				idadeH.setValue(0);
				opM.setSelected(false);
				opF.setSelected(false);	
				opO.setSelected(false);
				cpfH.setText(null);
				cidadeH.setText(null);
				estadoH.setText(null);
		        ruaH.setText(null);
				bairroH.setText(null);
				numeroH.setValue(0);
				telefoneH.setText(null);
				profissaoH.setText(null);
				opCas.setSelected(false);
				opSol.setSelected(false);	
				opViu.setSelected(false);
				opSim.setSelected(false);
				opNao.setSelected(false);
				religiaoH.setText(null);
				hobbyH.setText(null);
				sonhoH.setText(null);
			}
		});
		limpar.setForeground(new Color(255, 0, 0));
		limpar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		limpar.setBounds(232, 477, 89, 36);
		contentPane.add(limpar);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Presents psts;
				psts=new Presents();
				psts.main(null);
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(345, 477, 89, 36);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_20 = new JLabel("Email:");
		lblNewLabel_20.setForeground(new Color(255, 0, 0));
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_20.setBounds(2, 34, 106, 14);
		contentPane.add(lblNewLabel_20);
		
		emailH = new JTextField();
		emailH.setBounds(41, 31, 204, 20);
		contentPane.add(emailH);
		emailH.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Senha:");
		lblNewLabel_21.setForeground(new Color(255, 0, 0));
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_21.setBounds(318, 34, 46, 14);
		contentPane.add(lblNewLabel_21);
		
		senhaH = new JTextField();
		senhaH.setBounds(355, 31, 141, 20);
		contentPane.add(senhaH);
		senhaH.setColumns(10);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
