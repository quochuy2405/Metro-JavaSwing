import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
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

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class THONGKEDOANHSO extends JFrame {

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
	public THONGKEDOANHSO() {
		setResizable(false);
		setTitle("DOANH SỐ CỦA NHÂN VIÊN");
	
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		setBounds(100, 100, 1088, 665);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("D:\\METRO\\img\\logomain.png"));
		logo.setBounds(366, 31, 324, 72);
		contentPane.add(logo);
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		logo.setIcon(scaleIcon1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(0, 394, 1084, 234);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("GA ĐI");
		model.addColumn("GA ĐẾN");
		model.addColumn("SỐ VÉ BÁN ");
		model.addColumn("NGÀY BÁN ");
		model.addColumn("DOANH SỐ");

		JTableHeader Theader = table.getTableHeader();
		 Theader.setFont(new Font("Tahome",Font.BOLD,13));
		Theader.setBackground(new Color(255, 255, 255));
		taobang(model,table);
		table.setModel(model);
		
		JButton btnNewButton = new JButton("Thống kê ");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 204, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		btnNewButton.setBounds(391, 241, 284, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<< Trở lại");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnLmMi = new JButton("Làm mới");
		btnLmMi.setForeground(new Color(255, 255, 255));
		btnLmMi.setBackground(new Color(153, 204, 255));
		btnLmMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taobang(model,table);
				table.setModel(model);
				
			}
		});
		btnLmMi.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLmMi.setBounds(391, 309, 284, 37);
		contentPane.add(btnLmMi);
		
		JDateChooser dateChooserXEM = new JDateChooser();
		dateChooserXEM.setBounds(391, 191, 284, 26);
		contentPane.add(dateChooserXEM);
		
		JLabel lblNewLabel_1 = new JLabel("NGÀY THỐNG KÊ :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(391, 158, 152, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		lblNewLabel.setBounds(337, 138, 394, 244);
		contentPane.add(lblNewLabel);
				JButton intk = new JButton("In bảng thống kê");
				intk.setBackground(Color.LIGHT_GRAY);
				intk.setFont(new Font("Arial", Font.BOLD, 14));
				intk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try {
							Class.forName("oracle.jdbc.OracleDriver");  
							  
							//step2 create  the connection object  
							java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 
							Hashtable map= new Hashtable() ;
										JasperReport report = JasperCompileManager.compileReport("D:\\METRO\\src\\Thongkedoanhso.jrxml")	;
									JasperPrint p= JasperFillManager.fillReport(report, map,con);
									JasperViewer.viewReport(p,false);
									java.io.OutputStream os1=new FileOutputStream(new File("D:\\METRO\\Vein"));
									JasperExportManager.exportReportToPdfStream(p, os1);
						
							con.close();

						} catch (Exception e2) {
							e2.printStackTrace();
						}
					}
				});
		intk.setBounds(0, 361, 152, 32);
		contentPane.add(intk);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(0, 0, 1084, 395);
		contentPane.add(lblNewLabel1);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\33934.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel1.getWidth(), lblNewLabel1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel1.setIcon(scaleIcon2);
		

	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{  
					DateFormat bd=new SimpleDateFormat("dd/MM/YYYY");
					String a=bd.format(dateChooserXEM.getDate()).toString();
					//step1 load the driver class  
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 


					String select="SELECT \"GADI\",\"GADEN\",COUNT(*),\"NGAYBANVE\",SUM(TIENTRA)"
							+ "FROM \"DOAN1\".\"LICHSUVE\""
							+ "WHERE \"NGAYBANVE\"='"+a+"'"
							+ "GROUP BY \"NGAYBANVE\",\"GADI\",\"GADEN\"" ;
				//step3 create the statement object  

					java.sql.Statement stmt=((java.sql.Connection) con).createStatement();  	
					  
					//step4 execute query  
				
					while(model.getRowCount() > 0)
					{
						model.removeRow(0);
					}
					ResultSet rs=stmt.executeQuery(select);  
						while(rs.next())
								{ 	  
				
									
									model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
						      table.setModel(model);
						    
					
				}
						
							rs.close();
				
					//step5 close the connection object  
					con.close();  
				  
				}
				catch(Exception e1){ System.out.println(e1);}  
					  
				
				
			}
		});
		setVisible(true);
		
	}
public void taobang( DefaultTableModel model,JTable table) {	
		
		try{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.OracleDriver");  
		  
		//step2 create  the connection object  
		java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 


		String select="SELECT \"GADI\",\"GADEN\",COUNT(*),\"NGAYBANVE\",SUM(TIENTRA)"
				+ "FROM \"DOAN1\".\"LICHSUVE\""
				+ "GROUP BY \"NGAYBANVE\",\"GADI\",\"GADEN\"" ;
	//step3 create the statement object  

		java.sql.Statement stmt=((java.sql.Connection) con).createStatement();  	
		  
		//step4 execute query  
	
		while(model.getRowCount() > 0)
		{
			model.removeRow(0);
		}
		ResultSet rs=stmt.executeQuery(select);  
			while(rs.next())
					{ 	  
	
						
						model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
			      table.setModel(model);
			    
		
	}
			
				rs.close();
	
		//step5 close the connection object  
		con.close();  
	  
	}
	catch(Exception e1){ System.out.println(e1);}  
		  
	}
}
