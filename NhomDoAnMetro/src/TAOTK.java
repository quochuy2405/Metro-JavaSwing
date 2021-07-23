import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JPasswordField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class TAOTK extends JFrame {

	private JPanel contentPane;
	private JTextField hoten;
	private JTextField cmnd;
	private JTextField ID;
	private JTextField pass;
	private JTextField qt;
	private JTextField sdt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TAOTK() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\METRO\\img\\metro-subway-underground-train-railway-engine-emoj-symbol-30744.png"));
		setTitle("LOGIN");
	
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 842, 568);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("ĐĂNG KÝ");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblLogin.setBounds(328, 58, 157, 35);
		contentPane.add(lblLogin);
		
		hoten = new JTextField();
		hoten.setFont(new Font("Tahoma", Font.BOLD, 14));
		hoten.setBounds(215, 175, 188, 26);
		contentPane.add(hoten);
		hoten.setColumns(10);
		
		JButton BTdangnhap = new JButton("ĐĂNG KÝ");
		BTdangnhap.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		BTdangnhap.setForeground(new Color(255, 255, 255));
		BTdangnhap.setBackground(new Color(204, 204, 255));
		
		BTdangnhap.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		BTdangnhap.setBounds(215, 424, 401, 35);
		contentPane.add(BTdangnhap);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setBounds(527, 175, 89, 25);
		contentPane.add(comboBox);
		comboBox.addItem("Nam");
		comboBox.addItem("Nu");
		
		cmnd = new JTextField();
		cmnd.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmnd.setColumns(10);
		cmnd.setBounds(215, 236, 188, 26);
		contentPane.add(cmnd);
		
		ID = new JTextField();
		ID.setFont(new Font("Tahoma", Font.BOLD, 14));
		ID.setColumns(10);
		ID.setBounds(215, 302, 401, 26);
		contentPane.add(ID);
		
		pass = new JTextField();
		pass.setFont(new Font("Tahoma", Font.BOLD, 14));
		pass.setColumns(10);
		pass.setBounds(215, 363, 401, 26);
		contentPane.add(pass);
		
		qt = new JTextField();
		qt.setFont(new Font("Tahoma", Font.BOLD, 14));
		qt.setColumns(10);
		qt.setBounds(419, 175, 98, 26);
		contentPane.add(qt);
		
		sdt = new JTextField();
		sdt.setFont(new Font("Tahoma", Font.BOLD, 14));
		sdt.setColumns(10);
		sdt.setBounds(419, 236, 197, 26);
		contentPane.add(sdt);
		
		JButton trove = new JButton("<<Trở lại");
		trove.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		trove.setBackground(new Color(153, 204, 255));
		trove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LOGIN A =new LOGIN();
				A.setVisible(true);
				setVisible(false);
			}
		});
		trove.setFont(new Font("Tahoma", Font.BOLD, 13));
		trove.setBounds(10, 21, 98, 26);
		contentPane.add(trove);
		
		JLabel lblNewLabel_1 = new JLabel("HỌ TÊN :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(215, 138, 152, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("QUỐC TỊCH :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(418, 138, 152, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("GIỚI TÍNH :");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(527, 138, 89, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("SỐ CMND :");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(215, 210, 152, 26);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("SỐ ĐIỆN THOẠI :");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(418, 210, 152, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("ID :");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(215, 272, 152, 26);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("PASSWORD :");
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_6.setBounds(215, 338, 152, 26);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		lblNewLabel.setBounds(168, 110, 498, 387);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\\\METRO\\\\img\\\\tien-vu-ngoc-FGSZ3pVy3YQ-unsplash.jpg"));
		lblNewLabel_2.setBounds(0, 0, 920, 582);
		contentPane.add(lblNewLabel_2);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\tien-vu-ngoc-FGSZ3pVy3YQ-unsplash.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel_2.setIcon(scaleIcon2);
		
		
		BTdangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try{  
					//step1 load the driver class  
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 
                    int manv=0;
                	java.sql.Statement sm=((java.sql.Connection) con).createStatement(); 
					 ResultSet rs3= ((java.sql.Statement) sm).executeQuery("SELECT MAX(MANV) FROM \"DOAN1\".\"NHANVIEN\"");
					 rs3.next();
					if(rs3.getString("MAX(MANV)")==null){manv=100;}
					else {manv=Integer.valueOf(rs3.getString("MAX(MANV)"));manv++;}
					
		            rs3.close();
		            String select1="insert into \"DOAN1\".\"TAIKHOANNV\" (\"ID\", \"MATKHAU\")values("+ID.getText()+",'"+pass.getText()+"')" ;
					ResultSet rs2=sm.executeQuery(select1);  
					rs2.close();
					String select="insert into \"DOAN1\".\"NHANVIEN\" (\"MANV\", \"HOTEN\", \"SOCMND\", \"ID\", \"GIOITINH\", \"QUOCTICH\", \"SDT\") values("+manv+", '"+hoten.getText()+"', '"+cmnd.getText()+"',"+ID.getText()+", '"+comboBox.getSelectedItem()+"', '"+qt.getText()+"', '"+sdt.getText()+"')" ;
				//step3 create the statement object  
					ResultSet rs=sm.executeQuery(select);  rs.close();
					
							sm.close();
				
					//step5 close the connection object  
					con.close();  
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"THÀNH CÔNG");
					LOGIN A =new LOGIN();
					A.setVisible(true);
					setVisible(false);
				}
				catch(Exception e1){ System.out.println(e1);
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"LỖI");}  
			}
		});
		setVisible(true);
	}
}
