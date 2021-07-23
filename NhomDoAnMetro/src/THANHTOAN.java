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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import java.sql.Time;
import javax.swing.border.LineBorder;
public class THANHTOAN extends JFrame {

	private JPanel contentPane;
	private JTextField tienvao;
	private JTextField tienra;
	double tientra=0;
    public String mav="",ht="",gt="";
	public static String cm="";
	public String qt="";
	public String dt="";
	JComboBox comboBox;
	static JLabel Luuy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class.forName("oracle.jdbc.OracleDriver");  
					
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1");
					java.sql.Statement sm=((java.sql.Connection) con).createStatement();  	

					System.out.println(cm);
			        ResultSet rs= ((java.sql.Statement) sm).executeQuery("SELECT COUNT(*) FROM \"DOAN1\".\"LICHSUVE\" WHERE \"SOCMND\"="+cm);
				    	rs.next();
				    	System.out.println(rs.getInt(1));
				    	if(rs.getInt(1)>=5)
				    	{   
				    		Luuy.setText("Lưu ý đây là khách VIP");
				    	}else 
				    	{
				    		if(rs.getInt(1)==0)
				    		{   
				    			Luuy.setText("Lưu ý đây là khách đi lần đầu (LD)");
				    		}
				    		else {
				    			Luuy.setText("Lưu ý đây là khách không có khuyến mãi");
				    		}
				    	}
				    	rs.close();
				    	con.close();
				    	sm.close();
				}
			    
				  catch(Exception e1){
					  System.out.println(e1);
				
						}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void  getDL(String a,String a1,String a2,String a3,String a4 ,String a5) {
	mav=a;
	ht=a1;
	gt=a2;
	cm=a3;
	qt=a4;
	dt=a5;
	
	
	}
	
	public THANHTOAN() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\METRO\\img\\metro-subway-underground-train-railway-engine-emoj-symbol-30744.png"));
		setTitle("THANH TOÁN");
	
	 
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 503, 552);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("Số tiền nhận :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(138, 147, 128, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("THANH TOÁN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblLogin.setBounds(149, 69, 194, 35);
		contentPane.add(lblLogin);
		
		tienvao = new JTextField();
		tienvao.setBounds(138, 181, 227, 26);
		contentPane.add(tienvao);
		tienvao.setColumns(10);
		
		JButton bthoantat = new JButton("HOÀN TẤT");
		bthoantat.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		bthoantat.setBackground(new Color(153, 153, 204));
		
		bthoantat.setFont(new Font("Dialog", Font.BOLD, 17));
		bthoantat.setBounds(138, 384, 227, 35);
		contentPane.add(bthoantat);
		
		JLabel lblKhuynMi = new JLabel("Khuyến mãi :");
		lblKhuynMi.setForeground(Color.BLACK);
		lblKhuynMi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblKhuynMi.setBounds(138, 219, 111, 26);
		contentPane.add(lblKhuynMi);
		
		 comboBox = new JComboBox();
		
		comboBox.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox.setBounds(138, 255, 227, 26);
		contentPane.add(comboBox);
		comboBox.addItem("KHONG");
		comboBox.addItem("LD");
		comboBox.addItem("VIP");
		
		JButton btnTnh = new JButton("Tính");
		btnTnh.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnTnh.setBackground(new Color(153, 204, 255));
		
		btnTnh.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		btnTnh.setBounds(292, 326, 73, 26);
		contentPane.add(btnTnh);
		
		tienra = new JTextField();
		
		tienra.setColumns(10);
		tienra.setBounds(138, 326, 144, 26);
		contentPane.add(tienra);
		
		JLabel lblTinTrKhch = new JLabel("Tiền trả khách :");
		lblTinTrKhch.setForeground(Color.BLACK);
		lblTinTrKhch.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTinTrKhch.setBounds(138, 291, 128, 26);
		contentPane.add(lblTinTrKhch);
		Luuy = new JLabel("");
		Luuy.setBounds(138, 241, 227, 13);
		contentPane.add(Luuy);
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		lblNewLabel_1.setBounds(88, 125, 335, 326);
		contentPane.add(lblNewLabel_1);
		
		JLabel bbb = new JLabel("");
		//bbb.setIcon(new ImageIcon("D:\\METRO\\img\\563702.jpg"));
		bbb.setBounds(0, 0, 499, 524);
		contentPane.add(bbb);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\563702.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(bbb.getWidth(), bbb.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		bbb.setIcon(scaleIcon2);
		

		btnTnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.OracleDriver");  
					
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1");
					java.sql.Statement sm=((java.sql.Connection) con).createStatement();  	

			    
			        ResultSet rs= ((java.sql.Statement) sm).executeQuery("SELECT LOAI FROM \"DOAN1\".\"VETAU\" WHERE \"MAVE\"="+mav);
				    	rs.next();
				    
				double tienthua=Double.valueOf(tienvao.getText());
			    tientra=tienthua;
		    	 if(rs.getString(1).length()==7) 
		    	 {
		    		 double tien1=400000;
		    		 if(comboBox.getSelectedItem()=="VIP") {
		    			 tienthua=tienthua+(tien1*(0.5)-tien1);
				
				     }else {
				     
				     if(comboBox.getSelectedItem()=="LD") {
				    	 tienthua=tienthua+(tien1*0.3)-tien1;
			    		
		    	         }
				     else { tienthua=tienthua-tien1;}}
				
		    	 }
		    
		    		
		    	 if(rs.getString(1).length()==9)
		    	 { double tien1=200000;
		    		 if(comboBox.getSelectedItem()=="VIP") {
		    			 System.out.println("vaovip");
			    	 tienthua=tienthua+(tien1*(0.5)-tien1);
			     }
		          else
		          {
			     if(comboBox.getSelectedItem()=="LD") {
		    		 tienthua=tienthua+(tien1*0.3)-tien1;
		    	
		    	 }
			     else 
			     {
			     tienthua=tienthua-tien1;
	
		    	 }
		    
				}  
		    	 }
		    		tienra.setText(""+tienthua+"");
		    		tientra-=tienthua;
			    	 rs.close();
			    	 sm.close();
			    	 con.close();
				
				}
			    
		  catch(Exception e1){
			  System.out.println(e1);
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"LỖI NHẬP TIỀN");
				}
			}
		});
		bthoantat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tienra.getText().length()==0)
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"HÃY TÍNH TIỀN");
				}
				else {
				try {
					// step1 load the driver class
              
					Class.forName("oracle.jdbc.OracleDriver");  
				
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1");
					java.sql.Statement sm=((java.sql.Connection) con).createStatement();  	
					 int Makh=1000;
					 
		            ResultSet rs3= ((java.sql.Statement) sm).executeQuery("SELECT MAX(MAKH) FROM \"DOAN1\".\"HANHKHACH\"");
					 rs3.next();
					if(rs3.getString("MAX(MAKH)")==null){Makh=1000;}
					else {Makh=Integer.valueOf(rs3.getString("MAX(MAKH)"));Makh++;}
					
		            rs3.close();
		
		        
		            ResultSet rs= ((java.sql.Statement) sm).executeQuery("SELECT MAVE FROM \"DOAN1\".\"VETAU\" WHERE \"MAVE\"="+mav+ "AND \"MAVE\" NOT IN (SELECT  \"DOAN1\".\"VETAU\".\"MAVE\"  FROM \"DOAN1\".\"VETAU\",\"DOAN1\".\"HANHKHACH\" WHERE \"DOAN1\".\"HANHKHACH\".\"MAVE\"=\"DOAN1\".\"VETAU\".\"MAVE\")");
		        
				    	rs.next();
				    
			
                 
				   	 PreparedStatement ps2 = con.prepareStatement("insert into \"DOAN1\".\"HANHKHACH\" (\"MAKH\", \"MANV\", \"MAVE\", \"HOTEN\", \"GIOITINH\", \"SOCMND\", \"QUOCTICH\", \"SDT\") values("+Makh+","+"123"+","+rs.getString("MAVE")+", '"+ht+"', '"+gt+"', '"+cm+"', '"+qt+"','"+dt+"')");
				    ps2.execute();
		             
						Component frame = null;
						JOptionPane.showMessageDialog(frame,"THÀNH CÔNG");

			            ResultSet rs4= ((java.sql.Statement) sm).executeQuery("SELECT * FROM \"DOAN1\".\"VETAU\",\"DOAN1\".\"HANHKHACH\" WHERE \"DOAN1\".\"VETAU\".\"MAVE\"=\"DOAN1\".\"HANHKHACH\".\"MAVE\"and \"DOAN1\".\"VETAU\".\"MAVE\"="+mav);
			        
					    	rs4.next();
					 
					 
						THONGTINVE A= new THONGTINVE();
						String a5="Họ và tên:"+rs4.getString(14)+" || Giới Tính :"+rs4.getString(15);
						String a6="Số CMND :"+rs4.getString(16)+"|| Quốc Tịch :"+rs4.getString(17);
						String a1="SDT:"+rs4.getString(18)+"|| Mã Vé:"+rs4.getString(1)+" || Mã Số Ghế:"+rs4.getString(2);
						String a2="Ga đi:"+rs4.getString(3)+"||Ga đến:"+rs4.getString(4)+"||Phí Trả:"+tientra;
						String a3="Loại Vé:"+rs4.getString(6)+"||Giờ đi:"+rs4.getString(7)+"||Giờ đến:"+rs4.getString(8);
						String a4="Ngày đi:"+rs4.getString(9)+"|| Ngày về:"+rs4.getString(10);
						String a7="Ngày bán:"+LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
						PreparedStatement ps5 = con.prepareStatement("insert into \"DOAN1\".\"LICHSUVE\" (\"HOTEN\", \"GIOITINH\", \"MAVE\", \"SOCMND\", \"QUOCTICH\", \"SDT\", \"MASOGHE\", \"GADI\", \"GADEN\", \"LOAI\",\"TIENTRA\", \"GIODI\", \"GIODEN\", \"NGAYDI\", \"NGAYVE\",\"NGAYBANVE\") "
								+ "values('"+rs4.getString(14)+"', '"+rs4.getString(15)+"',"+rs4.getString(1)+", '"+rs4.getString(16)+"', '"+rs4.getString(17)+"', '"+rs4.getString(18)+"',"+rs4.getString(2)+", '"+rs4.getString(3)+"', '"+rs4.getString(4)+"', '"+rs4.getString(6)+"',"+tientra+", '"+rs4.getString(7)+"', '"+rs4.getString(8)+"', '"+rs4.getString(9)+"', '"+rs4.getString(10)+"','"+LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+"')");
						    ps5.execute();
						    ////
						    PreparedStatement ps7 = con.prepareStatement("drop table HOADON	cascade constraints");
							//step3 create the statement object  
						    ps7.execute();
						
							
								 PreparedStatement ps8 = con.prepareStatement("create table \"DOAN1\".\"HOADON\""
										+ "("
										+ "   \"HOTEN\" VARCHAR2(30 BYTE), "
										+ "	\"GIOITINH\" VARCHAR2(20 BYTE),"
										+ "    \"SOCMND\" VARCHAR2(20 BYTE),"
										+ "    \"QUOCTICH\" VARCHAR2(20 BYTE),"
										+ "    \"SDT\" VARCHAR2(20 BYTE),"
										+ "    \"MAVE\" NUMBER(8,0) PRIMARY KEY,"
										+ "    \"MASOGHE\" NUMBER(8,0),"
										+ "    \"GADI\" VARCHAR2(20 BYTE), "
										+ "    \"GADEN\" VARCHAR2(20 BYTE),"
										+ "    \"PHITRA\" VARCHAR2(20 BYTE),"
										+ "    \"LOAI\" VARCHAR2(20 BYTE), "
										+ "    \"GIODI\"VARCHAR2(20 BYTE), "
										+ "    \"GIODEN\" VARCHAR2(20 BYTE),"
										+ "     \"NGAYDI\"  VARCHAR2(20 BYTE), "
										+ "    \"NGAYVE\"  VARCHAR2(20 BYTE),"
										+ "     \"NGAYBAN\"  VARCHAR2(20 BYTE)"
										+ ")"
										+ "SEGMENT CREATION IMMEDIATE "
										+ "  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 "
										+ " NOCOMPRESS LOGGING"
										+ "  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645"
										+ "  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1"
										+ "  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)"
										+ "  TABLESPACE \"USERS\" ");
								//step4 execute query  	
									    ps8.execute();
							
								
						    PreparedStatement ps6 = con.prepareStatement("insert into \"DOAN1\".\"HOADON\" (\"HOTEN\", \"GIOITINH\", \"SOCMND\", \"QUOCTICH\", \"SDT\", \"MAVE\", \"MASOGHE\", \"GADI\", \"GADEN\", \"PHITRA\", \"LOAI\", \"GIODI\", \"GIODEN\", \"NGAYDI\", \"NGAYVE\", \"NGAYBAN\")"
									+ "values('"+rs4.getString(14)+"', '"+rs4.getString(15)+"','"+rs4.getString(16)+"', '"+rs4.getString(17)+"', '"+rs4.getString(18)+"',"+rs4.getString(1)+","+rs4.getString(2)+", '"+rs4.getString(3)+"', '"+rs4.getString(4)+"',"+tientra+", '"+rs4.getString(6)+"', '"+rs4.getString(7)+"', '"+rs4.getString(8)+"', '"+rs4.getString(9)+"', '"+rs4.getString(10)+"','"+LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+"')");
							    ps6.execute();
		
								ps7.close();
								ps8.close();
						    ps2.close();
						    rs4.close();
						    ps5.close();
						    ps6.close();
						   
						A.setham(a5, a6 , a1, a2,a3,a4,a7);
						sm.close();
						 con.close();
						 mav="";ht="";gt="";cm="";qt="";dt="";
						 setVisible(false);
				}
				catch (Exception e1) {
					System.out.println(e1);
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"THẤT BẠI");
				}
				

				// step5 close the connection object

				}
			}
		});
		
	}
}
