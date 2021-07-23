import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class LICHSUVE extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField CMND;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public LICHSUVE() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1360, 633);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 369, 1356, 227);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		scrollPane.setViewportView(table);
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Họ Tên");
		model.addColumn("Giới Tính");
		
		model.addColumn("Mã Vé");
		model.addColumn("Số CMND");
		
		model.addColumn("Quốc Tịch");
		model.addColumn("SDT");
		
		model.addColumn("Mã Số Ghế");
		model.addColumn( "Ga Đi" );
		
		model.addColumn(  "Ga Đến" );
		model.addColumn(  "Loại" );
		model.addColumn(  "Giá vé" );
		
		model.addColumn(   "Giờ đi");
		model.addColumn(  "Giờ đến");
	
		
		model.addColumn(  "Ngày đi" );
		model.addColumn(   "Ngày về" );
		model.addColumn(   "Ngày bán" );

		JTableHeader Theader = table.getTableHeader();
		 Theader.setFont(new Font("Tahome",Font.BOLD,10));
		Theader.setBackground(new Color(255, 255, 255));
		taobang(model,table);
		table.setModel(model);
		
		JButton btnNewButton = new JButton("TÌM KIẾM");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{  
					//step1 load the driver class  
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 


					String select="SELECT * from \"DOAN1\".\"LICHSUVE\" WHERE \"SOCMND\"='"+CMND.getText()+"'" ;
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
				
									System.out.print(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7)+rs.getString(8)+rs.getString(9)+rs.getString(10));
									model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)});
						      table.setModel(model);
						


					
				}
						
							rs.close();
				
					//step5 close the connection object  
					con.close();  
				  
				}
				catch(Exception e1){ System.out.println(e1);}  
					  
				}
			
		});

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBounds(533, 216, 271, 33);
		contentPane.add(btnNewButton);
		
		CMND = new JTextField();
		CMND.setBounds(533, 155, 271, 33);
		contentPane.add(CMND);
		CMND.setColumns(10);
		
		JButton btnLmMi = new JButton("LÀM MỚI");
		btnLmMi.setForeground(new Color(255, 255, 255));
		btnLmMi.setBackground(new Color(102, 153, 255));
		btnLmMi.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLmMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taobang(model,table);
			}
		});
		btnLmMi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLmMi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnLmMi.setBounds(533, 278, 271, 33);
		contentPane.add(btnLmMi);
		JButton btnNewButton_1 = new JButton("<< Trở lại");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton_1);
		JLabel lblNewLabel_1 = new JLabel("");
	
		lblNewLabel_1.setBounds(517, 26, 298, 78);
		contentPane.add(lblNewLabel_1);
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		lblNewLabel_1.setIcon(scaleIcon1);
		
		JLabel lblNewLabel_2 = new JLabel("SỐ CMND :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(533, 132, 117, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(Color.WHITE, 4));
		lblNewLabel.setBounds(490, 119, 356, 227);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");

		lblNewLabel_3.setBounds(0, 0, 1367, 370);
		contentPane.add(lblNewLabel_3);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\33934.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel_3.setIcon(scaleIcon2);
		
		
		
		setVisible(true);
	
}
	public void taobang( DefaultTableModel model,JTable table) {	
		
		try{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.OracleDriver");  
		  
		//step2 create  the connection object  
		java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 


		String select="SELECT * from \"DOAN1\".\"LICHSUVE\"" ;
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
	
						System.out.print(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7)+rs.getString(8)+rs.getString(9)+rs.getString(10));
						model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)});
			      table.setModel(model);
			


		
	}
			
				rs.close();
	
		//step5 close the connection object  
		con.close();  
	  
	}
	catch(Exception e1){ System.out.println(e1);}  
		  
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LICHSUVE frame = new LICHSUVE();
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	}
