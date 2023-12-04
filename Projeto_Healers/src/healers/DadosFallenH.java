package healers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;

import com.mysql.cj.result.Row;

import javax.swing.event.AncestorEvent;
import javax.swing.DefaultComboBoxModel;

public class DadosFallenH extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField mNome;
	private JTextField mIdade;
	private JTextField mAdversidade;
	private JTextField mInteratividade;
	private JTextField mEstado;
	private JTextField mtelefone;
	private JTextField mCidade;
	private JTextField mRua;
	private JTextField mBairro;
	private JTextField mNumero;
	String nme,adv,abt,tel,est,cid,rua,bai;
	int idade,numero;
	private JComboBox<String> mostraFallens;
	int i=1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosFallenH frame = new DadosFallenH();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DadosFallenH() {
		setTitle("SESSÃO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 443);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DADOS DA SESSÃO");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(145, 11, 142, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Fallen:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(10, 98, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(10, 123, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adversidade:");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(10, 148, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Interatividade:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(10, 173, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefone:");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(10, 198, 59, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Estado:");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setBounds(10, 222, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Cidade:");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setBounds(10, 247, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Rua:");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(10, 272, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Bairro:");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setBounds(10, 297, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Numero:");
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setBounds(10, 322, 59, 14);
		contentPane.add(lblNewLabel_10);
		
		mostraFallens = new JComboBox();
		mostraFallens.setMaximumRowCount(10);
		mostraFallens.setModel(new DefaultComboBoxModel());
		mostraFallens.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
						
						PreparedStatement faz = conecta.prepareStatement("select * from fallen");
						
						ResultSet rsltset=faz.executeQuery();
						//List<DadosFallenH>lista=new ArrayList();
						
							
						while(rsltset.next()){
							//i++;
							DadosFallenH df=new DadosFallenH();
							df.nme=rsltset.getString(6);
							//mostraFallens.removeAll();
							mostraFallens.addItem(rsltset.getString(6));
							
							//i++;
						//	DadosFallen df=new DadosFallen();
							//df.nme=rsltset.getString(i);
						//	mostraFallens.addItem(rsltset.getString(1));
							/*df.idade=rsltset.getInt("idade");
							df.adv=rsltset.getString("adversidade");
							df.abt=rsltset.getString("abertura_de_interacao");
							df.tel=rsltset.getString("telefone");
							df.est=rsltset.getString("estado");
							df.cid=rsltset.getString("cidade");
							df.rua=rsltset.getString("rua");
							df.bai=rsltset.getString("bairro");
							df.numero=rsltset.getInt("numero");*/
							
							//lista.add(df);
						
						//mostraFallens.removeAll();
						//for(DadosFallen r: lista) {
						//	mostraFallens.addItem(r);
						//}
						}
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		mostraFallens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("select * from fallen where nome=?");
					faz.setString(1,(String) mostraFallens.getSelectedItem());
					ResultSet rsltset=faz.executeQuery();
					if(rsltset.next()) {
						mNome.setText(rsltset.getString(6));
						mIdade.setText(rsltset.getString(7));
						mAdversidade.setText(rsltset.getString(3));
						mInteratividade.setText(rsltset.getString(5));
						mtelefone.setText(rsltset.getString(15));
						mEstado.setText(rsltset.getString(11));
						mCidade.setText(rsltset.getString(10));
						mRua.setText(rsltset.getString(12));
						mBairro.setText(rsltset.getString(13));
						mNumero.setText(rsltset.getString(14));
					}
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				////////////////////////////////////////////////////////////
			}
		});
		mostraFallens.setBounds(114, 45, 232, 22);
		contentPane.add(mostraFallens);
		
		JLabel lblNewLabel_11 = new JLabel("Selecionar Fallen:");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setBounds(10, 49, 105, 14);
		contentPane.add(lblNewLabel_11);
		
		JButton voltar = new JButton("VOLTAR");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuHealer mh=new MenuHealer();
				mh.main(null);
				dispose();
			}
		});
		voltar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		voltar.setBounds(163, 361, 89, 32);
		contentPane.add(voltar);
		
		mNome = new JTextField();
		mNome.setBounds(104, 95, 242, 20);
		contentPane.add(mNome);
		mNome.setColumns(10);
		
		mIdade = new JTextField();
		mIdade.setBounds(44, 120, 52, 20);
		contentPane.add(mIdade);
		mIdade.setColumns(10);
		
		mAdversidade = new JTextField();
		mAdversidade.setBounds(89, 145, 163, 20);
		contentPane.add(mAdversidade);
		mAdversidade.setColumns(10);
		
		mInteratividade = new JTextField();
		mInteratividade.setBounds(88, 170, 150, 20);
		contentPane.add(mInteratividade);
		mInteratividade.setColumns(10);
		
		mEstado = new JTextField();
		mEstado.setBounds(51, 219, 187, 20);
		contentPane.add(mEstado);
		mEstado.setColumns(10);
		
		mtelefone = new JTextField();
		mtelefone.setBounds(66, 194, 92, 20);
		contentPane.add(mtelefone);
		mtelefone.setColumns(10);
		
		mCidade = new JTextField();
		mCidade.setBounds(49, 244, 189, 20);
		contentPane.add(mCidade);
		mCidade.setColumns(10);
		
		mRua = new JTextField();
		mRua.setBounds(34, 269, 204, 20);
		contentPane.add(mRua);
		mRua.setColumns(10);
		
		mBairro = new JTextField();
		mBairro.setBounds(58, 297, 194, 20);
		contentPane.add(mBairro);
		mBairro.setColumns(10);
		
		mNumero = new JTextField();
		mNumero.setBounds(65, 319, 74, 20);
		contentPane.add(mNumero);
		mNumero.setColumns(10);
	}
}
