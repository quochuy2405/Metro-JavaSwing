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

public class SUATT extends JFrame {

	private JPanel contentPane;
	private JTextField cmnd;
	private JTextField THAY;
	
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
	public String setpass( char[] i)
	{ String a="";
	int x=0;
	  while(i.length>x)
	  {
		  a+=i[x];
		  x++;
	  }
	return a;
		
	}

	public SUATT() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\METRO\\img\\metro-subway-underground-train-railway-engine-emoj-symbol-30744.png"));
		setTitle("SỬA THÔNG TIN");
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 601, 576);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SỐ CMND :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(169, 129, 117, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("SỬA THÔNG TIN");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblLogin.setBounds(169, 51, 261, 35);
		contentPane.add(lblLogin);
		
		JLabel lblNewLabel_1_1 = new JLabel("THÔNG TIN SỬA :");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(169, 201, 171, 26);
		contentPane.add(lblNewLabel_1_1);
		
		cmnd = new JTextField();
		cmnd.setFont(new Font("Dialog", Font.BOLD, 16));
		cmnd.setBounds(169, 156, 261, 35);
		contentPane.add(cmnd);
		cmnd.setColumns(10);
		
		JButton BTdangnhap = new JButton("HOÀN TẤT");
		BTdangnhap.setForeground(new Color(255, 255, 255));
		BTdangnhap.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		BTdangnhap.setBackground(new Color(204, 204, 255));
		
		BTdangnhap.setFont(new Font("Tahoma", Font.BOLD, 15));
		BTdangnhap.setBounds(169, 360, 261, 35);
		contentPane.add(BTdangnhap);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox.setBounds(169, 228, 261, 35);
		contentPane.add(comboBox);
		comboBox.addItem("HOTEN");
		comboBox.addItem("GIOITINH");
		comboBox.addItem("SOCMND");
		comboBox.addItem("QUOCTICH");
		comboBox.addItem("SDT");
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox_2.setBounds(169, 301, 261, 35);
		contentPane.add(comboBox_2);
		comboBox_2.addItem("VN");
		comboBox_2.addItem("TQ");
		THAY = new JTextField();
		THAY.setFont(new Font("Tahoma", Font.BOLD, 15));
		THAY.setColumns(10);
		THAY.setBounds(169, 301, 261, 35);
		contentPane.add(THAY);
		
		JLabel lblGiTrThay = new JLabel("GIÁ TRỊ SỬA :");
		lblGiTrThay.setForeground(Color.BLACK);
		lblGiTrThay.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGiTrThay.setBounds(169, 276, 137, 26);
		contentPane.add(lblGiTrThay);
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(169, 301, 261, 35);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Nam");
		comboBox_1.addItem("Nu");
		JButton btnNewButton = new JButton("<< Trở lại");
		btnNewButton.setBackground(new Color(153, 153, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		lblNewLabel_2.setBounds(128, 106, 342, 324);
		contentPane.add(lblNewLabel_2);
		
	
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 19));
		lblNewLabel_1.setIcon(new ImageIcon("D:\\METRO\\img\\563702.jpg"));
		lblNewLabel_1.setBounds(0, 0, 597, 548);
		contentPane.add(lblNewLabel_1);
		
		ImageIcon icon111 = new ImageIcon("D:\\\\METRO\\\\img\\\\563702.jpg");
		Image imgIcon111 = icon111.getImage();
		Image imgScale111 = imgIcon111.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon111 = new ImageIcon(imgScale111);
		lblNewLabel_1.setIcon(scaleIcon111);
		comboBox_1.setVisible(false);
		comboBox_2.setVisible(false);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedItem()=="GIOITINH")
				{
					THAY.setVisible(false);
					comboBox_2.setVisible(false);
					comboBox_1.setVisible(true);
				}
				else {
					if(comboBox.getSelectedItem()=="QUOCTICH")
					{
						THAY.setVisible(false);
						comboBox_1.setVisible(false);
						comboBox_2.setVisible(true);
					}else {
						THAY.setVisible(true);
						comboBox_1.setVisible(false);
						comboBox_2.setVisible(false);
					}
				}
			}
		});
		
		BTdangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
				if(cmnd.getText().length()==0 ||(THAY.getText().length()==0 && THAY.isVisible()==true))
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"NHẬP THÔNG TIN");
				}
				else {
				try{  
				//step1 load the driver class  
					String ka;
					if(comboBox.getSelectedItem()=="GIOITINH")
					{
						ka=comboBox_1.getSelectedItem().toString();
					}else {
						if(comboBox.getSelectedItem()=="QUOCTICH")
						{
							ka=comboBox_2.getSelectedItem().toString();
						}else {
							ka=THAY.getText();
						}
					}
				Class.forName("oracle.jdbc.OracleDriver");  
				//step2 create  the connection object  
				java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1");
				java.sql.Statement stmt=((java.sql.Connection) con).createStatement(); 
				String select1="select * from \"DOAN1\".\"HANHKHACH\" where \"SOCMND\"="+cmnd.getText()+""; 
				ResultSet rs1=stmt.executeQuery(select1); 
				rs1.next();
				if(rs1.getString(1)!=null) {
					
				

				String select="update \"DOAN1\".\"HANHKHACH\" set \""+comboBox.getSelectedItem()+"\"='"+ka+"' where \"SOCMND\"="+cmnd.getText()+""; 
			//step3 create the statement object  
                
				ResultSet rs=stmt.executeQuery(select); 
				  
				//step4 execute query  
					
						rs.close();
			stmt.close();
				//step5 close the connection object  
				con.close();  
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"THÀNH CÔNG");
				
				}
				else {
					rs1.close();
					stmt.close();
						//step5 close the connection object  
						con.close();  
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"SỐ CMND KHÔNG TỒN TẠI");
				
				}
			  
			}
			catch(Exception e1){ System.out.println(e1);
			Component frame = null;
			JOptionPane.showMessageDialog(frame,"SỐ CMND KHÔNG TỒN TẠI");}  
			}}

		
		});
	}
}
