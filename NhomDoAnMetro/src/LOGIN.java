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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JPasswordField PASS;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN frame = new LOGIN();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
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
	/**
	 * Create the frame.
	 */

	public LOGIN() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\METRO\\img\\metro-subway-underground-train-railway-engine-emoj-symbol-30744.png"));
		setTitle("LOGIN");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 689);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Unispace", Font.BOLD, 34));
		lblLogin.setBounds(285, 192, 325, 35);
		contentPane.add(lblLogin);
		
		ID = new JTextField();
		ID.setForeground(new Color(192, 192, 192));
		ID.setText("Enter ID");
		ID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(ID.getText().equals("Enter ID"))
				{
					ID.setText("");
					ID.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(ID.getText().equals(""))
				{
					ID.setText("Enter ID");
					ID.setForeground(new Color(192, 192, 192));
				}
				
			}
		});
		ID.setFont(new Font("Tahoma", Font.BOLD, 15));
		ID.setBounds(285, 245, 315, 37);
		contentPane.add(ID);
		ID.setColumns(10);
		
		PASS = new JPasswordField();
		PASS.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			    String password = String.valueOf(PASS.getPassword());
				if(password.toLowerCase().equals("enter password"))
				{
					PASS.setText("");
					PASS.setEchoChar('*');
					PASS.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				 String password = String.valueOf(PASS.getPassword());
					if(password.toLowerCase().equals(""))
					{
						PASS.setText("Enter Password");
						PASS.setEchoChar((char)0);
						PASS.setForeground(new Color(192, 192, 192));
					}
			}
		});
	
		PASS.setFont(new Font("Tahoma", Font.BOLD, 15));
		PASS.setBounds(285, 304, 315, 37);
		PASS.setForeground(new Color(192, 192, 192));
		PASS.setText("Enter Password");
		PASS.setEchoChar((char)0);
		contentPane.add(PASS);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\METRO\\img\\user (1).png"));
		lblNewLabel_2.setBounds(415, 85, 64, 64);
		contentPane.add(lblNewLabel_2);
		JButton BTdangnhap = new JButton("LOGIN");
		BTdangnhap.setForeground(new Color(255, 255, 255));
		BTdangnhap.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		BTdangnhap.setBackground(new Color(153, 204, 255));
		BTdangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DANGNHAP();
				}

		
		});
		BTdangnhap.setFont(new Font("Tahoma", Font.BOLD, 14));
		BTdangnhap.setBounds(285, 396, 315, 35);
		contentPane.add(BTdangnhap);
		
		JButton btnToTkNhn = new JButton("TẠO TK NHÂN VIÊN");
		btnToTkNhn.setForeground(new Color(255, 255, 255));
		btnToTkNhn.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnToTkNhn.setBackground(new Color(204, 204, 255));
		btnToTkNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ID.getText().length()==0 || PASS.getPassword().length==0)
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"NHẬP THÔNG TIN");
				}
				else {
				
				try{  
				//step1 load the driver class  
				Class.forName("oracle.jdbc.OracleDriver");  
				  
				//step2 create  the connection object  
				java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 
			   var i=PASS.getPassword();
       
				String select="SELECT * from \"DOAN1\".\"TAIKHOANQL\" WHERE \"ID\"="+ID.getText()+" AND \"MATKHAU\"='"+setpass(i)+"'"; ;
			//step3 create the statement object  
                
				java.sql.Statement stmt=((java.sql.Connection) con).createStatement();  	
				  
				//step4 execute query  
				ResultSet rs=stmt.executeQuery(select); 
				rs.next();

					if(rs.getString(1)!=null)
					{   
					TAOTK A=new TAOTK();
					A.setVisible(true);
					setVisible(false);
					   
					}
					else {
						Component frame = null;
						JOptionPane.showMessageDialog(frame,"BẠN KHÔNG LÀ QUẢN LÝ");
					}
						rs.close();
			
				//step5 close the connection object  
				con.close();  
			  
			}
			catch(Exception e1){ System.out.println(e1);
			Component frame = null;
			JOptionPane.showMessageDialog(frame,"BẠN KHÔNG LÀ QUẢN LÝ");}  
			}}
			
		});
		btnToTkNhn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnToTkNhn.setBounds(285, 473, 315, 35);
		contentPane.add(btnToTkNhn);
		
		JLabel user = new JLabel("");
		user.setBackground(new Color(0, 0, 0));
		user.setIcon(new ImageIcon("D:\\METRO\\img\\user (2).png"));
		user.setBounds(243, 245, 32, 37);
		contentPane.add(user);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\METRO\\img\\padlock (1).png"));
		lblNewLabel.setBounds(243, 304, 32, 37);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String password = String.valueOf(PASS.getPassword());
					if(!password.toLowerCase().equals("enter password"))
					{
				if(chckbxNewCheckBox.isSelected()) {
					PASS.setEchoChar((char)0);
				}else {
					PASS.setEchoChar('*');
				}}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(285, 347, 127, 30);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(135, 131, 608, 425);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 879, 661);
		contentPane.add(lblNewLabel_3);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\563702.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel_3.setIcon(scaleIcon2);
	
	}
	public void DANGNHAP() {
		if(ID.getText().length()==0 || PASS.getPassword().length==0)
		{
			Component frame = null;
			JOptionPane.showMessageDialog(frame,"NHẬP THÔNG TIN");
		}
		else {
		try{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.OracleDriver");  
		  
		//step2 create  the connection object  
		java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 
		java.sql.Statement stmt=((java.sql.Connection) con).createStatement(); 
		var i=PASS.getPassword();

		String select="SELECT * from \"DOAN1\".\"TAIKHOANNV\" WHERE \"ID\"="+ID.getText()+" AND \"MATKHAU\"='"+setpass(i)+"'"; ;

		ResultSet rs=stmt.executeQuery(select); 
		rs.next();

			if(rs.getString(1)!=null)
			{   
			MainMeTro A=new MainMeTro();
			A.setVisible(true);
			A.GETname(rs.getString(1));
			setVisible(false);
			   
			}
			else {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"ĐĂNG NHẬP THẤT BẠI");
			}
				rs.close();
	
		//step5 close the connection object  
		con.close();  
	  
	}
	catch(Exception e1){ System.out.println(e1);
	Component frame = null;
	JOptionPane.showMessageDialog(frame,"NHẬP LẠI THÔNG TIN");}  
	}
		
	}
}
