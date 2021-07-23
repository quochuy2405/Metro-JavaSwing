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
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class TIMVEA extends JFrame {

	private JPanel contentPane;
	private JTable table;


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
	
	public TIMVEA() {
	
		setResizable(false);
		setTitle("TÌM VÉ");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
	
		setBounds(100, 100, 1062, 810);
		setLocationRelativeTo(null); 

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBackground(new Color(255, 250, 250));
		logo.setIcon(new ImageIcon("D:\\METRO\\img\\logomain.png"));
		logo.setBounds(362, 10, 299, 72);
		contentPane.add(logo);
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		logo.setIcon(scaleIcon1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.addItem("Ha Noi");
		comboBox.addItem("Ho Chi Minh");
		comboBox.addItem("Da Lat");
		comboBox.addItem("Vung Tau");
	;
		comboBox.setBounds(283, 148, 216, 38);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_1.setBounds(539, 148, 216, 38);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Ha Noi");
		comboBox_1.addItem("Ho Chi Minh");
		comboBox_1.addItem("Da Lat");
		comboBox_1.addItem("Vung Tau");
		
		JDateChooser dateChooserngayve = new JDateChooser();
		dateChooserngayve.getCalendarButton().setEnabled(false);
		dateChooserngayve.getCalendarButton().setOpaque(false);
		dateChooserngayve.setBounds(539, 242, 216, 38);
		/*set ngay ve an di*/ 
		contentPane.add(dateChooserngayve);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setForeground(Color.BLACK);
		
		comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_1_1.setBounds(283, 318, 472, 38);
		contentPane.add(comboBox_1_1);
		comboBox_1_1.addItem("Mot Chieu");
		comboBox_1_1.addItem("Khu Hoi");
		
		JButton btimkiem = new JButton("TÌM KIẾM");
		btimkiem.setForeground(new Color(240, 248, 255));
		btimkiem.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btimkiem.setBackground(new Color(153, 153, 204));
		btimkiem.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		btimkiem.setBounds(283, 403, 472, 38);
		contentPane.add(btimkiem);
		JDateChooser dateChooserngaydi = new JDateChooser();
		dateChooserngaydi.getCalendarButton().setOpaque(false);
		dateChooserngaydi.setBounds(283, 242, 216, 38);
		contentPane.add(dateChooserngaydi);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setAutoscrolls(true);
		scrollPane.setBounds(0, 576, 1057, 196);
		contentPane.add(scrollPane);
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Mã vé");
		model.addColumn("Mã số ghế");
		model.addColumn("Ga đi");
		model.addColumn("Ga về");
		model.addColumn("Giá vé");
		model.addColumn("Loại");
		
		model.addColumn("Giờ đi");
		model.addColumn("Giờ đến");
		model.addColumn("Ngày đi");
		model.addColumn("Ngày về");
		table.setModel(model);
		
		JButton btntV = new JButton("ĐẶT VÉ");
		btntV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DATVE();
			}
		});
		btntV.setForeground(new Color(240, 248, 255));
		btntV.setFont(new Font("Tahoma", Font.BOLD, 17));
		btntV.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btntV.setBackground(new Color(153, 153, 204));
		btntV.setBounds(283, 481, 472, 38);
		contentPane.add(btntV);
		JButton btnNewButton_1 = new JButton("<< Trở lại");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("GA ĐI :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(283, 121, 74, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("GA ĐẾN :");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(539, 121, 74, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("NGÀY ĐI :");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(283, 215, 74, 17);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("NGÀY VỀ :");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(539, 215, 74, 17);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("LOẠI VÉ :");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(283, 290, 74, 24);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		lblNewLabel.setBounds(243, 107, 551, 459);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(102, 153, 153));
		lblNewLabel_2.setIcon(new ImageIcon("D:\\METRO\\img\\33934.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1057, 744);
		contentPane.add(lblNewLabel_2);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\33934.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel_2.setIcon(scaleIcon2);


		
		comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1_1.getSelectedItem()=="Khu Hoi")
				{  JDateChooser dateChooser = new JDateChooser();
				
					dateChooserngayve.getCalendarButton().setEnabled(true);
				
				}
				else {
					dateChooserngayve.setDate(null);
					dateChooserngayve.getCalendarButton().setEnabled(false);
					
				}
			}
		});
	

	
		
		JTableHeader Theader = table.getTableHeader();
		 Theader.setFont(new Font("Tahome",Font.BOLD,14));
		Theader.setBackground(new Color(255, 255, 255));
		btimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( comboBox.getSelectedItem()== comboBox_1.getSelectedItem())
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"THÔNG TIN SAI");
				}else {
				try{  
					//step1 load the driver class  
					
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 
					DateFormat bd=new SimpleDateFormat("dd/MM/YYYY");
					String a=bd.format(dateChooserngaydi.getDate()).toString();
					String b=null;
					if(dateChooserngayve.getDate()!=null && comboBox_1_1.getSelectedItem()=="Khu Hoi" )
					{
						  b= bd.format(dateChooserngayve.getDate());
						 String select="SELECT * FROM \"DOAN1\".\"VETAU\" WHERE \"GADI\"="+"'"+comboBox.getSelectedItem()+"' AND \"GADEN\"="+"'"+comboBox_1.getSelectedItem()+"'AND \"LOAI\"="+"'"+comboBox_1_1.getSelectedItem()+"' AND \"NGAYDI\"='"+a+"' AND \"NGAYVE\"='"+b+"' AND "
									+ "\"DOAN1\".\"VETAU\".\"MAVE\" NOT IN (SELECT  \"DOAN1\".\"VETAU\".\"MAVE\"  FROM \"DOAN1\".\"VETAU\",\"DOAN1\".\"HANHKHACH\" WHERE \"DOAN1\".\"HANHKHACH\".\"MAVE\"=\"DOAN1\".\"VETAU\".\"MAVE\")";;
							//step3 create the statement object  
						
								java.sql.Statement stmt=((java.sql.Connection) con).createStatement();  	
								  
								//step4 execute query  
								
								while(model.getRowCount() > 0)
								{
									model.removeRow(0);
								}
								
								ResultSet rs=stmt.executeQuery(select);  
											while(rs.next())  				{ 	  
								
					
									model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
									table.setModel(model);
									
								
							}
											
											if(model.getRowCount()==0) {
												Component frame = null;
												JOptionPane.showMessageDialog(frame,"KHÔNG TÌM THẤY");
											}
										
							
								//step5 close the connection object  
								con.close();  
					}
					else {
					if(dateChooserngayve.getDate()==null && comboBox_1_1.getSelectedItem()!="Khu Hoi" )
					{
						String select="SELECT * FROM \"DOAN1\".\"VETAU\" WHERE \"GADI\"="+"'"+comboBox.getSelectedItem()+"' AND \"GADEN\"="+"'"+comboBox_1.getSelectedItem()+"'AND \"LOAI\"="+"'"+comboBox_1_1.getSelectedItem()+"' AND \"NGAYDI\"='"+a+"' AND "
								+ "\"DOAN1\".\"VETAU\".\"MAVE\" NOT IN (SELECT  \"DOAN1\".\"VETAU\".\"MAVE\"  FROM \"DOAN1\".\"VETAU\",\"DOAN1\".\"HANHKHACH\" WHERE \"DOAN1\".\"HANHKHACH\".\"MAVE\"=\"DOAN1\".\"VETAU\".\"MAVE\")";
						//step3 create the statement object  
					
							java.sql.Statement stmt=((java.sql.Connection) con).createStatement();  	
							  
							//step4 execute query  
							while(model.getRowCount() > 0)
							{
								model.removeRow(0);
							}
							
							ResultSet rs=stmt.executeQuery(select);  
										while(rs.next())  				{ 	  
							
				                
								model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
								
							
								table.setModel(model);
							
						}
										if(model.getRowCount()==0) {
											Component frame = null;
											JOptionPane.showMessageDialog(frame,"KHÔNG TÌM THẤY");
										}
					}else {	
									
										Component frame = null;
										JOptionPane.showMessageDialog(frame,"HÃY ĐIỀN ĐẦY ĐỦ THÔNG TIN");}
							//step5 close the connection object  
							con.close();  
					}

					
				  
				}
				catch(Exception e1){ Component frame = null;
				JOptionPane.showMessageDialog(frame,"HÃY ĐIỀN ĐẦY ĐỦ THÔNG TIN");
				System.out.println(e1);}  
					  
			}
			}
		});
		setVisible(true);
	}
}
