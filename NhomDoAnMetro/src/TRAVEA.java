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
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class TRAVEA extends JFrame {

	private JPanel contentPane;
	private JTextField mavetext;

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

	public TRAVEA() {
		setResizable(false);
		setTitle("TRẢ VÉ TÀU");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		setBounds(100, 100, 1178, 740);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("D:\\METRO\\img\\logomain.png"));
		logo.setBounds(402, 35, 324, 72);
		contentPane.add(logo);
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		logo.setIcon(scaleIcon1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.addItem("Ha Noi");
		comboBox.addItem("Ho Chi Minh");
		comboBox.addItem("Da Lat");
		comboBox.addItem("Vung Tau");

		comboBox.setBounds(332, 205, 221, 38);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1.setBounds(613, 205, 221, 38);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Ha Noi");
		comboBox_1.addItem("Ho Chi Minh");
		comboBox_1.addItem("Da Lat");
		comboBox_1.addItem("Vung Tau");
		
		JDateChooser dateChooserngayvei = new JDateChooser();
		dateChooserngayvei.getCalendarButton().setOpaque(false);
		dateChooserngayvei.setBounds(613, 293, 221, 38);
		/*set ngay ve an di*/ 
		contentPane.add(dateChooserngayvei);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setForeground(Color.BLACK);
		comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1_1.getSelectedItem()=="Khu Hoi")
				{  JDateChooser dateChooser = new JDateChooser();
				
					dateChooserngayvei.getCalendarButton().setEnabled(true);
				
				}
				else {
					dateChooserngayvei.setDate(null);
					dateChooserngayvei.getCalendarButton().setEnabled(false);
					
				}
			}
		});
		comboBox_1_1.setBounds(332, 379, 221, 38);
		contentPane.add(comboBox_1_1);
		comboBox_1_1.addItem("Mot Chieu");
		comboBox_1_1.addItem("Khu Hoi");
		
		JButton bttrave = new JButton("TRẢ VÉ");
		bttrave.setForeground(new Color(255, 255, 255));
		bttrave.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		bttrave.setBackground(new Color(153, 153, 204));
		bttrave.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		bttrave.setBounds(332, 462, 502, 38);
		contentPane.add(bttrave);
		JDateChooser dateChooserngaydii = new JDateChooser();
		dateChooserngaydii.getCalendarButton().setOpaque(false);
		dateChooserngaydii.setBounds(332, 293, 221, 38);
		contentPane.add(dateChooserngaydii);
		
		mavetext = new JTextField();
		mavetext.setFont(new Font("Dialog", Font.BOLD, 16));
		mavetext.setBounds(613, 380, 221, 38);
		contentPane.add(mavetext);
		mavetext.setColumns(10);
			JButton btnNewButton_1 = new JButton("<< Trở lại");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {setVisible(false);
					
				}
			});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1.setBounds(10, 20, 93, 26);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("GA ĐI :");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(332, 178, 74, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("GA ĐẾN :");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(613, 178, 74, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("NGÀY ĐI :");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(332, 266, 74, 17);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("NGÀY VỀ :");
		lblNewLabel_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_3.setBounds(613, 266, 74, 17);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("LOẠI VÉ :");
		lblNewLabel_1_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_4.setBounds(332, 352, 74, 17);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("MÃ VÉ :");
		lblNewLabel_1_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_5.setBounds(613, 353, 74, 17);
		contentPane.add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		lblNewLabel.setBackground(new Color(153, 204, 204));
		lblNewLabel.setBounds(291, 149, 587, 413);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setIcon(new ImageIcon("D:\\METRO\\img\\33934.jpg"));
		lblNewLabel1.setBounds(0, -82, 1174, 794);
		contentPane.add(lblNewLabel1);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\33934.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel1.getWidth(), lblNewLabel1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel1.setIcon(scaleIcon2);


		bttrave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
					Class.forName("oracle.jdbc.OracleDriver");  
					DateFormat bd=new SimpleDateFormat("dd/MM/YYYY");
					String a=bd.format(dateChooserngaydii.getDate()).toString();
					String b=null;
					System.out.println(a);
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1");
					java.sql.Statement sm=((java.sql.Connection) con).createStatement();  
					if(comboBox.getSelectedItem()==comboBox_1.getSelectedItem())
					{
						Component frame = null;
						JOptionPane.showMessageDialog(frame,"LỖI THÔNG TIN");
					}
					else {
					//step1 load the driver class  
					
					ResultSet rs2= ((java.sql.Statement) sm).executeQuery("SELECT NGAYVE from \"DOAN1\".\"VETAU\" WHERE \"MAVE\"="+mavetext.getText());
					 rs2.next();
					if(rs2.getString(1)!=null)
					{rs2.close();
					  b= bd.format(dateChooserngayvei.getDate());
						 ResultSet rs1= ((java.sql.Statement) sm).executeQuery("SELECT \"DOAN1\".\"HANHKHACH\".\"MAVE\" from \"DOAN1\".\"HANHKHACH\",\"DOAN1\".\"VETAU\"  where \"DOAN1\".\"HANHKHACH\".\"MAVE\"=\"DOAN1\".\"VETAU\".\"MAVE\" AND  \"DOAN1\".\"HANHKHACH\".\"MAVE\"="+mavetext.getText()+"and NGAYDI='"+a+"' AND NGAYVE='"+b+"' AND GADI='"+comboBox.getSelectedItem()+"' AND GADEN='"+comboBox_1.getSelectedItem()+"'");
						 rs1.next();
						 if(rs1.getString(1)!=null)
						 {
							 rs1.close();
						 ResultSet rs= ((java.sql.Statement) sm).executeQuery("delete from \"DOAN1\".\"HANHKHACH\" where \"MAVE\"="+mavetext.getText());
						 rs.close();
 ResultSet rs3= ((java.sql.Statement) sm).executeQuery("delete from \"DOAN1\".\"LICHSUVE\" where  \"MAVE\"="+mavetext.getText());
						 
						 
						 rs3.close();
						 sm.close();
						 con.close();
						 Component frame = null;
							JOptionPane.showMessageDialog(frame,"ĐÃ TRẢ VÉ");
						 }
						 else
						 {
							 Component frame = null;
							JOptionPane.showMessageDialog(frame,"LỖI TRẢ VÉ");
						}
					}
					else {
						rs2.close();
						if(comboBox_1_1.getSelectedItem()=="Mot Chieu")
						{
						 ResultSet rs1= ((java.sql.Statement) sm).executeQuery("SELECT \"DOAN1\".\"HANHKHACH\".\"MAVE\" from \"DOAN1\".\"HANHKHACH\",\"DOAN1\".\"VETAU\"  where \"DOAN1\".\"HANHKHACH\".\"MAVE\"=\"DOAN1\".\"VETAU\".\"MAVE\" AND  \"DOAN1\".\"HANHKHACH\".\"MAVE\"="+mavetext.getText()+"and NGAYDI='"+a+"' AND GADI='"+comboBox.getSelectedItem()+"' AND GADEN='"+comboBox_1.getSelectedItem()+"'");
						 rs1.next();
						
						 if(rs1.getString(1)!=null)
						 {
							 rs1.close();
						 ResultSet rs= ((java.sql.Statement) sm).executeQuery("delete from \"DOAN1\".\"HANHKHACH\" where \"MAVE\"="+mavetext.getText());
						 
						 
						 rs.close();
						 ResultSet rs3= ((java.sql.Statement) sm).executeQuery("delete from \"DOAN1\".\"LICHSUVE\" where  \"MAVE\"="+mavetext.getText());
						 
						 
						 rs3.close();
						 sm.close();
						 con.close();
						 Component frame = null;
							JOptionPane.showMessageDialog(frame,"ĐÃ TRẢ VÉ");
						 }
						 else
						 {
							 Component frame = null;
							JOptionPane.showMessageDialog(frame,"LỖI TRẢ VÉ");
						}
						
					}
					else {
							 Component frame = null;
							JOptionPane.showMessageDialog(frame,"LỖI THÔNG TIN");
						}
					
					
				}}}
				catch(Exception e1){ 
					System.out.println(e1);
					Component frame = null;
				JOptionPane.showMessageDialog(frame,"LỖI THÔNG TIN");}  
					  
			}
		});
		setVisible(true);
	}
}
