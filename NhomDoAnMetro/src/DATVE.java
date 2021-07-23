import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListDataEvent;
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
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;


import com.sun.jdi.connect.spi.Connection;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;

public class DATVE extends JFrame {

	private JPanel contentPane;
	private JTextField sdt=null;
	private JTextField mave1=null;
	private JTextField hoten=null;
	private JTextField cmnd=null;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
						DATVE frame = new DATVE();
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

	public DATVE() {
		setResizable(false);
		setTitle("ĐẶT VÉ TÀU");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
		setBounds(100, 100, 1027, 615);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel logo = new JLabel("");
		
		logo.setBounds(356, 20, 324, 72);
		contentPane.add(logo);
		ImageIcon icon1 = new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 = icon1.getImage();
		Image imgScale1 = imgIcon1.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1 = new ImageIcon(imgScale1);
		logo.setIcon(scaleIcon1);

		JButton thanhtoan = new JButton("THANH TOÁN");
		
		thanhtoan.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		thanhtoan.setBackground(new Color(204, 204, 255));
		thanhtoan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));

		thanhtoan.setBounds(264, 380, 515, 38);
		contentPane.add(thanhtoan);

		sdt = new JTextField();
		sdt.setFont(new Font("Tahoma", Font.BOLD, 15));
		sdt.setBounds(553, 167, 226, 38);
		contentPane.add(sdt);
		sdt.setColumns(10);

		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1_2.setBounds(553, 237, 226, 38);
		contentPane.add(comboBox_1_2);
		comboBox_1_2.addItem("VN");
		comboBox_1_2.addItem("TQ");

		mave1 = new JTextField();
		mave1.setFont(new Font("Tahoma", Font.BOLD, 15));
		mave1.setColumns(10);
		mave1.setBounds(264, 237, 231, 38);
		contentPane.add(mave1);

		hoten = new JTextField();
		hoten.setFont(new Font("Tahoma", Font.BOLD, 15));
		hoten.setColumns(10);
		hoten.setBounds(264, 172, 231, 38);
		contentPane.add(hoten);
		
		JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1_2_1.setBounds(264, 304, 231, 38);
		contentPane.add(comboBox_1_2_1);
		comboBox_1_2_1.addItem("Nam");
		comboBox_1_2_1.addItem("Nu");
		
		cmnd = new JTextField();
		cmnd.setFont(new Font("Tahoma", Font.BOLD, 15));
		cmnd.setBounds(553, 304, 226, 39);
		contentPane.add(cmnd);
		cmnd.setColumns(10);
		JButton btnNewButton = new JButton("<< Trở lại");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("MÃ VÉ :");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(264, 215, 74, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SỐ ĐIỆN THOẠI :");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(553, 140, 127, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("HỌ VÀ TÊN :");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(264, 149, 93, 17);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("QUỐC TỊCH :");
		lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(553, 215, 106, 17);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("GIỚI TÍNH :");
		lblNewLabel_1_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(264, 278, 93, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("SỐ CMND :");
		lblNewLabel_1_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(553, 278, 106, 24);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		lblNewLabel.setBounds(221, 126, 603, 335);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\METRO\\img\\563702.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1023, 587);
		contentPane.add(lblNewLabel_2);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\563702.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel_2.setIcon(scaleIcon2);
		

		
		
		thanhtoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(mave1.getText().length()==0 ||hoten.getText().length()==0||cmnd.getText().length()==0 ||sdt.getText().length()==0)	
			{
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"LỖI");
			}
			else {
        try {
		// step1 load the driver class
        
		Class.forName("oracle.jdbc.OracleDriver");  
	
		//step2 create  the connection object  
		java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1");
		java.sql.Statement sm=((java.sql.Connection) con).createStatement();  	

    
        ResultSet rs= ((java.sql.Statement) sm).executeQuery("SELECT MAVE FROM \"DOAN1\".\"VETAU\" WHERE \"MAVE\"="+mave1.getText()+ "AND \"MAVE\" NOT IN (SELECT  \"DOAN1\".\"VETAU\".\"MAVE\"  FROM \"DOAN1\".\"VETAU\",\"DOAN1\".\"HANHKHACH\" WHERE \"DOAN1\".\"HANHKHACH\".\"MAVE\"=\"DOAN1\".\"VETAU\".\"MAVE\")");
    
	    	rs.next();
	    if(rs.getString(1)!=null)
	    {
	    	THANHTOAN a= new THANHTOAN();

	         String a2=""+comboBox_1_2_1.getSelectedItem()+"";
	        
	         String a3=""+comboBox_1_2.getSelectedItem()+"";
	         a.getDL(mave1.getText(), hoten.getText(), a2,cmnd.getText(), a3,sdt.getText());
	         a.setVisible(true);
				
				
	    }
			sm.close();
			 con.close();

	}

	// step5 close the connection object

	catch (Exception e1) {
		Component frame = null;
		JOptionPane.showMessageDialog(frame,"THẤT BẠI");
	}}
			}
		});
		
		setVisible(true);

	}
	
}
