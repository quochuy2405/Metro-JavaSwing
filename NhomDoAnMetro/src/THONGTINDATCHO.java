import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
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
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class THONGTINDATCHO extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField cmnd;
	private JTextField mave;
	private JTextField textdienthoai;

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
	public THONGTINDATCHO() {
		setResizable(false);
		setTitle("THÔNG TIN ĐẶT CHỖ");
	  
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1088, 665);
		setLocationRelativeTo(null); 

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBackground(new Color(255, 255, 255));
		logo.setIcon(new ImageIcon("D:\\METRO\\img\\logomain.png"));
		logo.setBounds(333, 10, 324, 72);
		contentPane.add(logo);
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		logo.setIcon(scaleIcon1);
		
		JButton bttimekiem = new JButton("T\u00ECm ki\u1EBFm");
		bttimekiem.setForeground(new Color(255, 255, 255));
		bttimekiem.setBackground(new Color(153, 204, 255));
		bttimekiem.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		bttimekiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		bttimekiem.setBounds(392, 368, 281, 38);
		contentPane.add(bttimekiem);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(0, 533, 1084, 95);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Mã số ghế");
		model.addColumn("Họ Tên");
		model.addColumn("SĐT");
		model.addColumn("CMND");
		model.addColumn("Quốc Tịch");
		model.addColumn("Giới Tính");
		model.addColumn("Loại");
		model.addColumn("Giá vé");
		model.addColumn("Ga đi");
		model.addColumn("Ga đến");
		model.addColumn("Giờ đi");
		model.addColumn("Giờ đến");
		model.addColumn("Ngày đi");
		model.addColumn("Ngày về");
		JTableHeader Theader = table.getTableHeader();
		 Theader.setFont(new Font("Tahome",Font.BOLD,14));
		Theader.setBackground(new Color(255, 255, 255));
		table.setModel(model);
		
		cmnd = new JTextField();
		cmnd.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmnd.setBounds(392, 138, 281, 38);
		contentPane.add(cmnd);
		cmnd.setColumns(10);
		
		mave = new JTextField();
		mave.setFont(new Font("Tahoma", Font.BOLD, 14));
		mave.setColumns(10);
		mave.setBounds(392, 211, 281, 38);
		contentPane.add(mave);
		
		textdienthoai = new JTextField();
		textdienthoai.setFont(new Font("Tahoma", Font.BOLD, 14));
		textdienthoai.setColumns(10);
		textdienthoai.setBounds(392, 286, 281, 38);
		contentPane.add(textdienthoai);
		JButton bttimekiem_1 = new JButton("Sửa thông tin");
		bttimekiem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SUATT().setVisible(true);;
				
			}
		});JButton btnNewButton = new JButton("<< Trở lại");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
	}
});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(153, 153, 204));
		btnNewButton.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton);
		bttimekiem_1.setForeground(new Color(255, 255, 255));
		bttimekiem_1.setBackground(new Color(153, 204, 204));
		bttimekiem_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		bttimekiem_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimekiem_1.setBounds(392, 448, 281, 38);
		contentPane.add(bttimekiem_1);
		
		JLabel lblNewLabel_1 = new JLabel("SỐ CMND :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(392, 112, 121, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MÃ VÉ :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(392, 186, 74, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("SỐ ĐIỆN THOẠI :");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(392, 259, 164, 17);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		lblNewLabel.setBounds(320, 101, 430, 422);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setIcon(new ImageIcon("D:\\METRO\\img\\33934.jpg"));
		lblNewLabel1.setBounds(0, 0, 1084, 558);
		contentPane.add(lblNewLabel1);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\33934.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel1.getWidth(), lblNewLabel1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel1.setIcon(scaleIcon2);
		
		
		
		
		bttimekiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{  
					//step1 load the driver class  
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 


					String select="SELECT \"MASOGHE\",\"HOTEN\",\"SDT\",\"SOCMND\",\"QUOCTICH\",\"GIOITINH\",\"LOAI\",\"GIAVE\",\"GADI\",\"GADEN\",\"GIODI\",\"GIODEN\",\"NGAYDI\",\"NGAYVE\" FROM \"DOAN1\".\"VETAU\",\"DOAN1\".\"HANHKHACH\" WHERE \"DOAN1\".\"HANHKHACH\".\"MAVE\"=\"DOAN1\".\"VETAU\".\"MAVE\" AND \"SOCMND\"="+cmnd.getText()+"and \"DOAN1\".\"HANHKHACH\".\"MAVE\"="+mave.getText()+"and \"SDT\"="+textdienthoai.getText();
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
				
								
									model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14)});
						      table.setModel(model);
						
			
			
					
				}
								if(model.getRowCount()==0) {
									Component frame = null;
									JOptionPane.showMessageDialog(frame,"KHÔNG TÌM THẤY");
								}
							
							
				
					//step5 close the connection object  
					con.close();  
				  
				}
				catch(Exception e1){ 
					Component frame = null;
					JOptionPane.showMessageDialog(frame,"HÃY ĐIỀN ĐẦY ĐỦ THÔNG TIN");
					System.out.println(e1);}  
					  
			}
			
		});
		setVisible(true);
	}
}
