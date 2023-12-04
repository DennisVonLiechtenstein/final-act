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
import javax.swing.DefaultComboBoxModel;
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

public class DadosHealer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField mNome;
	private JTextField mAge;
	private JTextField mResiliente;
	private JTextField mEstado;
	private JTextField mCidade;
	String nme,adv,abt,tel,est,cid,rua,bai;
	int idade,numero;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosHealer frame = new DadosHealer();
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
	public DadosHealer() {
		setTitle("CONHECENDO SEU HEALER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do Healer");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(164, 11, 123, 23);
		contentPane.add(lblNewLabel);
		
		JComboBox mostraHealer = new JComboBox();
		mostraHealer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("select * from healer where nome=?");
					faz.setString(1,(String) mostraHealer.getSelectedItem());
					ResultSet rsltset=faz.executeQuery();
					if(rsltset.next()) {
						mNome.setText(rsltset.getString(6));
						mAge.setText(rsltset.getString(7));
						mResiliente.setText(rsltset.getString(3));
						mEstado.setText(rsltset.getString(11));
						mCidade.setText(rsltset.getString(10));
						
					}
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mostraHealer.setMaximumRowCount(10);
		mostraHealer.setModel(new DefaultComboBoxModel());
		mostraHealer.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conecta= DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_healer","root","yabuki");
					
					PreparedStatement faz = conecta.prepareStatement("select * from healer");
					
					ResultSet rsltset=faz.executeQuery();
					//List<DadosFallenH>lista=new ArrayList();
					
						
					while(rsltset.next()){
						//i++;
						DadosHealer df=new DadosHealer();
						df.nme=rsltset.getString(6);
						//mostraFallens.removeAll();
						mostraHealer.addItem(rsltset.getString(6));
						
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
		mostraHealer.setBounds(127, 45, 267, 22);
		contentPane.add(mostraHealer);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o Healer:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 49, 123, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 90, 54, 14);
		contentPane.add(lblNewLabel_2);
		
		mNome = new JTextField();
		mNome.setBounds(55, 87, 162, 20);
		contentPane.add(mNome);
		mNome.setColumns(10);
		
		JLabel mIdade = new JLabel("Idade:");
		mIdade.setForeground(new Color(255, 0, 0));
		mIdade.setFont(new Font("Times New Roman", Font.BOLD, 11));
		mIdade.setBounds(10, 138, 54, 14);
		contentPane.add(mIdade);
		
		mAge = new JTextField();
		mAge.setBounds(55, 135, 39, 20);
		contentPane.add(mAge);
		mAge.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Resiliente em:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 184, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		mResiliente = new JTextField();
		mResiliente.setBounds(96, 181, 176, 20);
		contentPane.add(mResiliente);
		mResiliente.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Estado:");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 222, 54, 14);
		contentPane.add(lblNewLabel_5);
		
		mEstado = new JTextField();
		mEstado.setBounds(65, 219, 39, 20);
		contentPane.add(mEstado);
		mEstado.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Cidade:");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 261, 54, 14);
		contentPane.add(lblNewLabel_6);
		
		mCidade = new JTextField();
		mCidade.setBounds(75, 258, 197, 20);
		contentPane.add(mCidade);
		mCidade.setColumns(10);
		
		JButton Voltar = new JButton("VOLTAR");
		Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFallen mf=new MenuFallen();
				mf.main(null);
				dispose();
			}
		});
		Voltar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Voltar.setBounds(183, 293, 89, 37);
		contentPane.add(Voltar);
	}
}
