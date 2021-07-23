import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class TAOVETAU extends JFrame {

	private JPanel contentPane;
	private JTextField GIODEN;
	private JTextField GIODI;

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
	public TAOVETAU() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1144, 742);
		setLocationRelativeTo(null);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox GADI = new JComboBox();
		GADI.setFont(new Font("Tahoma", Font.BOLD, 14));
		GADI.setBounds(299, 165, 231, 38);
		contentPane.add(GADI);
		GADI.addItem("Ha Noi");
		GADI.addItem("Ho Chi Minh");
		GADI.addItem("Da Lat");
		GADI.addItem("Vung Tau");
		
		JComboBox GADEN = new JComboBox();
		GADEN.setFont(new Font("Tahoma", Font.BOLD, 14));
		GADEN.setBounds(592, 165, 226, 38);
		contentPane.add(GADEN);
		GADEN.addItem("Ha Noi");
		GADEN.addItem("Ho Chi Minh");
		GADEN.addItem("Da Lat");
		GADEN.addItem("Vung Tau");
		
		JComboBox LOAI = new JComboBox();
		
		LOAI.setFont(new Font("Tahoma", Font.BOLD, 14));
		LOAI.setBounds(299, 388, 231, 38);
		contentPane.add(LOAI);
		LOAI.addItem("Mot Chieu");
		LOAI.addItem("Khu Hoi");
		
		JDateChooser dateChooserngaydi = new JDateChooser();
		dateChooserngaydi.getCalendarButton().setOpaque(false);
		dateChooserngaydi.setBounds(299, 246, 231, 38);
		contentPane.add(dateChooserngaydi);
		
		JDateChooser dateChooserngayve = new JDateChooser();
		dateChooserngayve.getCalendarButton().setOpaque(false);
		dateChooserngayve.getCalendarButton().setEnabled(false);
		dateChooserngayve.setBounds(592, 246, 226, 38);
		contentPane.add(dateChooserngayve);
		
		JButton btnNewButton = new JButton("N\u1EA0P");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(51, 102, 153));
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(662, 385, 156, 43);
		contentPane.add(btnNewButton);
		
		GIODEN = new JTextField();
		GIODEN.setFont(new Font("Tahoma", Font.BOLD, 14));
		GIODEN.setBounds(592, 320, 226, 36);
		contentPane.add(GIODEN);
		GIODEN.setColumns(10);
		
		
		
		GIODI = new JTextField();
		GIODI.setFont(new Font("Tahoma", Font.BOLD, 14));
		GIODI.setColumns(10);
		GIODI.setBounds(299, 320, 231, 36);
		contentPane.add(GIODI);
		
		JButton btnLmMiV = new JButton("LÀM MỚI VÉ HÔM NAY");
		btnLmMiV.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLmMiV.setForeground(new Color(255, 255, 255));
		btnLmMiV.setBackground(new Color(153, 153, 204));
	
		btnLmMiV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Object[] options = {"Có", "Không"};
                Component frame = null;
				int result = JOptionPane.showOptionDialog(frame,
                        "Bạn có chắc chắn LÀM MỚI",
                        "Xác nhận",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
                if(result == JOptionPane.YES_OPTION){
                 
				try{  
					//step1 load the driver class  
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 


					String select="drop table 	VETAU	cascade constraints";
				//step3 create the statement object  
					java.sql.Statement stmt=((java.sql.Connection) con).createStatement();  
					ResultSet rs=stmt.executeQuery(select); 
					rs.close();
					String select1=" create table \"DOAN1\".\"VETAU\""
							+ "("
							+ "    \"MAVE\" NUMBER(7,0) PRIMARY KEY,"
							+ "    \"MASOGHE\" NUMBER(7,0),"
							+ "    \"GADI\" VARCHAR2(20 BYTE),"
							+ "    \"GADEN\" VARCHAR2(20 BYTE),"
							+ "     \"GIAVE\" NUMBER(19,4),"
							+ "    \"LOAI\" VARCHAR2(20 BYTE), "
							+ "    \"GIODI\"VARCHAR2(20 BYTE), "
							+ "    \"GIODEN\" VARCHAR2(20 BYTE),"
							+ "     \"NGAYDI\" VARCHAR2(20 BYTE), "
							+ "    \"NGAYVE\" VARCHAR2(20 BYTE)"
							+ ")"
							+ "SEGMENT CREATION IMMEDIATE"
							+ "  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255"
							+ " NOCOMPRESS LOGGING\r\n"
							+ "  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645"
							+ "  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1"
							+ "  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)"
							+ "  TABLESPACE \"USERS\"";
					//step4 execute query  	
					ResultSet rs1=stmt.executeQuery(select1); 
					rs1.close();
				
							stmt.close();
				
					//step5 close the connection object  
					con.close(); 
					Component frame1 = null;
					JOptionPane.showMessageDialog(frame1,"ĐÃ LÀM MỚI");
				  
				}
				catch(Exception e1){ System.out.println(e1);}  
                }
				
			}
		});
		btnLmMiV.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLmMiV.setBounds(299, 482, 519, 43);
		contentPane.add(btnLmMiV);
		
		JButton btnLmMiHnh = new JButton("LÀM MỚI HÀNH KHÁCH HÔM NAY");
		btnLmMiHnh.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLmMiHnh.setForeground(new Color(255, 255, 255));
		btnLmMiHnh.setBackground(new Color(153, 153, 255));
		btnLmMiHnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] options = {"Có", "Không"};
                Component frame = null;
				int result = JOptionPane.showOptionDialog(frame,
                        "Bạn có chắc chắn muốn LÀM MỚI",
                        "Xác nhận",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
                if(result == JOptionPane.YES_OPTION){
          

				try{  
					//step1 load the driver class  
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 


					String select="drop table 	HANHKHACH	cascade constraints";
				//step3 create the statement object  
					java.sql.Statement stmt=((java.sql.Connection) con).createStatement();  
					ResultSet rs=stmt.executeQuery(select); 
					rs.close();
					String select1=" create table  \"DOAN1\".\"HANHKHACH\""
							+ "("
							+ "    \"MAKH\" NUMBER(8,0) PRIMARY KEY,"
							+ "    \"MANV\" NUMBER(8,0),"
							+ "    \"MAVE\" NUMBER(8,0) , "
							+ "	\"HOTEN\" VARCHAR2(30 BYTE), "
							+ "	\"GIOITINH\" VARCHAR2(20 BYTE),"
							+ "    \"SOCMND\" VARCHAR2(20 BYTE),"
							+ "    \"QUOCTICH\" VARCHAR2(20 BYTE),"
							+ "    \"SDT\" VARCHAR2(20 BYTE),"
							+ "      CONSTRAINT keyMANVhk"
							+ "     FOREIGN KEY (\"MANV\")"
							+ "     REFERENCES  \"DOAN1\".\"NHANVIEN\"(\"MANV\")"
							+ "     ON DELETE CASCADE,"
							+ "       CONSTRAINT keyMAVEhk"
							+ "     FOREIGN KEY (\"MAVE\")"
							+ "     REFERENCES  \"DOAN1\".\"VETAU\"(\"MAVE\")"
							+ "     ON DELETE CASCADE\r\n"
							+ ")"
							+ "SEGMENT CREATION IMMEDIATE "
							+ "  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 "
							+ " NOCOMPRESS LOGGING\r\n"
							+ "  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645"
							+ "  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1"
							+ "  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)"
							+ "  TABLESPACE \"USERS\" ";
					//step4 execute query  	
					ResultSet rs1=stmt.executeQuery(select1); 
					rs1.close();
				
							stmt.close();
				
					//step5 close the connection object  
					con.close(); 
					Component frame1 = null;
					JOptionPane.showMessageDialog(frame1,"ĐÃ LÀM MỚI");
				  
				}
				catch(Exception e1){ System.out.println(e1);}  
                }
				
			}
				
			
		});
		btnLmMiHnh.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLmMiHnh.setBounds(299, 554, 519, 43);
		contentPane.add(btnLmMiHnh);
			JButton btnNewButton_1 = new JButton("<< Trở lại");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(new Color(153, 153, 204));
		btnNewButton_1.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton_1);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(374, 28, 347, 80);
		contentPane.add(lblNewLabel);
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		lblNewLabel.setIcon(scaleIcon1);
		
		JSpinField spinField = new JSpinField();
		spinField.setBounds(593, 388, 59, 38);
		contentPane.add(spinField);
		
		JLabel lblNewLabel_1_1 = new JLabel("GA ĐI:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(299, 140, 121, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("GA ĐẾN :");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(592, 138, 121, 17);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("NGÀY ĐI :");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(299, 219, 121, 17);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("NGÀY VỀ :");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(592, 219, 121, 17);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("GIỜ ĐI :");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(299, 294, 121, 17);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("GIỜ ĐẾN :");
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_6.setBounds(592, 294, 121, 17);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("LOẠI VÉ :");
		lblNewLabel_1_7.setForeground(Color.WHITE);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_7.setBounds(299, 366, 121, 17);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("SỐ LƯỢNG :");
		lblNewLabel_1_8.setForeground(Color.WHITE);
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_8.setBounds(592, 366, 93, 17);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		lblNewLabel_1.setBounds(249, 122, 626, 522);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\METRO\\img\\33934.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1140, 714);
		contentPane.add(lblNewLabel_2);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\33934.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel_2.setIcon(scaleIcon2);
		
		
	
		LOAI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(LOAI.getSelectedItem()=="Khu Hoi" )
				{  JDateChooser dateChooser = new JDateChooser();
				
					dateChooserngayve.getCalendarButton().setEnabled(true);
				
				}
				else {
					dateChooserngayve.setDate(null);
					dateChooserngayve.getCalendarButton().setEnabled(false);
					
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(GADI.getSelectedItem()==GADEN.getSelectedItem() || spinField.getValue()<1)
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"LỖI THÔNG TIN");
				}
				else {
				
				try{  
					//step1 load the driver class  
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 
					java.sql.Statement stmt=((java.sql.Connection) con).createStatement(); 
					String select="select MAX(MAVE) FROM \"DOAN1\".\"VETAU\" ";
				
					ResultSet rs=stmt.executeQuery(select); 
					rs.next();
					
					int mave=0;
 if(rs.getString("MAX(MAVE)")==null)
	 {
	  mave=0;
	  }
  else
  {
	  mave=Integer.valueOf(rs.getString("MAX(MAVE)"));
	
  }
  rs.close();
	String select1="select MAX(MASOGHE) FROM \"DOAN1\".\"VETAU\" ";
	ResultSet rs1=stmt.executeQuery(select1); 
	rs1.next();
	
	int maghe=0;
if(rs1.getString("MAX(MASOGHE)")==null)
  {
	  maghe=100;
  }
else
{
maghe=Integer.valueOf(rs1.getString("MAX(MASOGHE)"));

}
rs1.close();
  int i=1;
 
	DateFormat bd=new SimpleDateFormat("dd/MM/YYYY");
  String a=bd.format(dateChooserngaydi.getDate()).toString();
	String b="" ;  
				  while(i<=spinField.getValue() )
                  {   mave+=1;
                  maghe+=1;
                     if(LOAI.getSelectedItem()=="Khu Hoi")
                     {  b=bd.format(dateChooserngayve.getDate());
     					String select4="insert into \"DOAN1\".\"VETAU\" (\"MAVE\", \"MASOGHE\", \"GADI\", \"GADEN\", \"LOAI\",\"GIAVE\", \"GIODI\", \"GIODEN\", \"NGAYDI\", \"NGAYVE\") values("+mave+","+maghe+", '"+GADI.getSelectedItem().toString()+"', '"+GADEN.getSelectedItem().toString()+"', '"+LOAI.getSelectedItem().toString()+"',400000, '"+GIODI.getText()+"', '"+GIODEN.getText()+"', '"+a+"','"+b+"')";
     					ResultSet rs2=stmt.executeQuery(select4); 
                     }
                     else {
                    		String select4="insert into \"DOAN1\".\"VETAU\" (\"MAVE\", \"MASOGHE\", \"GADI\", \"GADEN\", \"LOAI\",\"GIAVE\", \"GIODI\", \"GIODEN\", \"NGAYDI\", \"NGAYVE\") values("+mave+","+maghe+", '"+GADI.getSelectedItem().toString()+"', '"+GADEN.getSelectedItem().toString()+"', '"+LOAI.getSelectedItem().toString()+"',200000, '"+GIODI.getText()+"', '"+GIODEN.getText()+"', '"+a+"',null)";
         					ResultSet rs2=stmt.executeQuery(select4); 
                     }
                	  i++;
                  }
				//step3 create the statement object  

	 	
					  
		
				
						rs.close();
						stmt.close();
				
						Component frame = null;
						JOptionPane.showMessageDialog(frame,"THÀNH CÔNG");
					//step5 close the connection object  
					con.close();  
				  
				}
				catch(Exception e1){ System.out.println(e1);
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"THẤT BẠI");}  
				}
			}
			
		
					
		
		
		
		});
		setVisible(true);
	}
}
