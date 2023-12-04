package healers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class DadosFallenG extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField mNome;
	private JTextField mIdade;
	private JTextField mAdversidade;
	private JTextField mTelefone;
	private JTextField mEstado;
	private JTextField mCidade;
	private JTextField mRua;
	private JTextField mBairro;
	private JTextField mNumero;
	String nme,adv,abt,tel,est,cid,rua,bai;
	int idade,numero;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosFallenG frame = new DadosFallenG();
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
	public DadosFallenG() {
		setTitle("CONHECENDO OS FALLENS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 543);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do Fallen");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(155, 11, 119, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 102, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 142, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adversidade:");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 185, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 229, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Estado:");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 271, 56, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cidade:");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 312, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Rua:");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_7.setBounds(10, 355, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Bairro:");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_8.setBounds(10, 396, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Numero:");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_9.setBounds(10, 433, 56, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Selecione o Fallen:");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setBounds(10, 60, 113, 14);
		contentPane.add(lblNewLabel_10);
		
		JComboBox buscaF = new JComboBox();
		buscaF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("select * from fallen where nome=?");
					faz.setString(1,(String) buscaF.getSelectedItem());
					ResultSet rsltset=faz.executeQuery();
					if(rsltset.next()) {
						mNome.setText(rsltset.getString(6));
						mIdade.setText(rsltset.getString(7));
						mAdversidade.setText(rsltset.getString(3));
						//mInteratividade.setText(rsltset.getString(5));
						mTelefone.setText(rsltset.getString(15));
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
			}
		});
		buscaF.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("select * from fallen");
					
					ResultSet rsltset=faz.executeQuery();
					
					
						
					while(rsltset.next()){
						//i++;
						DadosFallenG dg=new DadosFallenG();
						dg.nme=rsltset.getString(6);
						//mostraFallens.removeAll();
						buscaF.addItem(rsltset.getString(6));
						
					
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
		buscaF.setBounds(119, 56, 237, 22);
		contentPane.add(buscaF);
		
		mNome = new JTextField();
		mNome.setBounds(55, 99, 186, 20);
		contentPane.add(mNome);
		mNome.setColumns(10);
		
		mIdade = new JTextField();
		mIdade.setBounds(52, 139, 40, 20);
		contentPane.add(mIdade);
		mIdade.setColumns(10);
		
		mAdversidade = new JTextField();
		mAdversidade.setBounds(87, 182, 154, 20);
		contentPane.add(mAdversidade);
		mAdversidade.setColumns(10);
		
		mTelefone = new JTextField();
		mTelefone.setBounds(67, 226, 129, 20);
		contentPane.add(mTelefone);
		mTelefone.setColumns(10);
		
		mEstado = new JTextField();
		mEstado.setBounds(54, 268, 46, 20);
		contentPane.add(mEstado);
		mEstado.setColumns(10);
		
		mCidade = new JTextField();
		mCidade.setBounds(64, 309, 177, 20);
		contentPane.add(mCidade);
		mCidade.setColumns(10);
		
		mRua = new JTextField();
		mRua.setBounds(50, 352, 191, 20);
		contentPane.add(mRua);
		mRua.setColumns(10);
		
		mBairro = new JTextField();
		mBairro.setBounds(55, 393, 186, 20);
		contentPane.add(mBairro);
		mBairro.setColumns(10);
		
		mNumero = new JTextField();
		mNumero.setBounds(65, 430, 46, 20);
		contentPane.add(mNumero);
		mNumero.setColumns(10);
		
		JButton btnNewButton = new JButton("VOLTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuGuardian mg=new MenuGuardian();
				mg.main(null);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(166, 461, 89, 34);
		contentPane.add(btnNewButton);
	}

}
