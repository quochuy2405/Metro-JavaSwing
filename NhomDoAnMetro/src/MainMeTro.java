import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.DebugGraphics;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;

public class MainMeTro extends JFrame {

	private JPanel contentPane;
	private static JTextField hienten;
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
	
	public static void GETname(String id) {
		
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.OracleDriver");  
			  
			//step2 create  the connection object  
			java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 
			String select="SELECT \"HOTEN\" from \"DOAN1\".\"TAIKHOANNV\",\"DOAN1\".\"NHANVIEN\" WHERE \"DOAN1\".\"TAIKHOANNV\".\"ID\"="+id+" and \"DOAN1\".\"TAIKHOANNV\".\"ID\"=\"DOAN1\".\"NHANVIEN\".\"ID\""; ;
		//step3 create the statement object  
            
			java.sql.Statement stmt=((java.sql.Connection) con).createStatement();  	
	
			ResultSet rs=stmt.executeQuery(select); 
			rs.next();
		
			hienten.setText(rs.getString(1));
					rs.close();
		
			//step5 close the connection object  
			con.close();  
		  
		}
		catch(Exception e1){ System.out.println(e1);
		Component frame = null;
		JOptionPane.showMessageDialog(frame,"NHẬP LẠI THÔNG TIN");}  
		
	}
	public MainMeTro() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\METRO\\img\\metro-subway-underground-train-railway-engine-emoj-symbol-30744.png"));
		setTitle("UIT METRO ELECTRIC");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1345, 814);
		setUndecorated(true);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo3 = new JLabel("");
		logo3.setBounds(450, 22, 387, 98);
		contentPane.add(logo3);
		
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(logo3.getWidth(), logo3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		logo3.setIcon(scaleIcon1);
		
		JButton btthongtin = new JButton("");
		btthongtin.setIcon(new ImageIcon("D:\\METRO\\img\\timetable.png"));
		btthongtin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btthongtin.setForeground(new Color(255, 255, 255));
		btthongtin.setBackground(new Color(112, 128, 144));
		btthongtin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new THONGTINDATCHO();
				
				
			}
		});
		btthongtin.setBounds(694, 190, 71, 74);
		contentPane.add(btthongtin);
		
		JButton bttrave = new JButton("");
		bttrave.setIcon(new ImageIcon("D:\\METRO\\img\\return-of-investment.png"));
		bttrave.setFont(new Font("Tahoma", Font.BOLD, 12));
		bttrave.setForeground(new Color(255, 255, 255));
		bttrave.setBackground(new Color(112, 128, 144));
		bttrave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TRAVEA();
			}
		});
		bttrave.setBounds(290, 190, 71, 74);
		contentPane.add(bttrave);
		
		JButton btdangxuat = new JButton("");
		btdangxuat.setOpaque(false);
		btdangxuat.setIcon(new ImageIcon("D:\\METRO\\img\\exit.png"));
		btdangxuat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btdangxuat.setForeground(new Color(255, 255, 255));
		btdangxuat.setBackground(new Color(112, 128, 144));
		btdangxuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LOGIN A=new LOGIN();
				A.setVisible(true);
			    
				
			}
		});
		btdangxuat.setBounds(1241, 10, 62, 57);
		contentPane.add(btdangxuat);
		
		JButton btnthongke = new JButton("");
		btnthongke.setIcon(new ImageIcon("D:\\METRO\\img\\sum.png"));
		btnthongke.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnthongke.setForeground(new Color(255, 255, 255));
		btnthongke.setBackground(new Color(112, 128, 144));
		btnthongke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new THONGKEDOANHSO();
			}
		});
		btnthongke.setBounds(559, 190, 78, 74);
		contentPane.add(btnthongke);
		
		JButton btcacquydinh = new JButton("");
		btcacquydinh.setIcon(new ImageIcon("D:\\METRO\\img\\pencil.png"));
		btcacquydinh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btcacquydinh.setForeground(new Color(255, 255, 255));
		btcacquydinh.setBackground(new Color(112, 128, 144));
		btcacquydinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CACQUYDINH();
			}
		});
		btcacquydinh.setActionCommand("");
		btcacquydinh.setBounds(1089, 190, 78, 74);
		contentPane.add(btcacquydinh);
		
		JButton btlienhe = new JButton("");
		btlienhe.setIcon(new ImageIcon("D:\\METRO\\img\\contact.png"));
		btlienhe.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlienhe.setForeground(new Color(255, 255, 255));
		btlienhe.setBackground(new Color(112, 128, 144));
		btlienhe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LIENHE();
			}
		});
		btlienhe.setBounds(823, 190, 78, 74);
		contentPane.add(btlienhe);
		
		
		JButton bttimve = new JButton(new ImageIcon("D:\\METRO\\img\\suitcase (2).png"));
		
		bttimve.setLayout(new FlowLayout());
		bttimve.setFont(new Font("Tahoma", Font.BOLD, 12));
		bttimve.setForeground(new Color(255, 255, 255));
		bttimve.setBackground(new Color(119, 136, 153));
		bttimve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TIMVEA();
				
			}
			
		});
		bttimve.setBounds(159, 190, 71, 74);
		contentPane.add(bttimve);
		
		hienten = new JTextField();
		hienten.setBorder(new LineBorder(Color.BLACK, 3));
		hienten.setBackground(Color.WHITE);
		
		hienten.setEditable(false);
		hienten.setFont(new Font("Tahoma", Font.BOLD, 14));
		hienten.setColumns(10);
		hienten.setBounds(1035, 128, 178, 28);
		contentPane.add(hienten);
		
		JButton lichsuve = new JButton("");
		lichsuve.setIcon(new ImageIcon("D:\\METRO\\img\\history.png"));
		lichsuve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LICHSUVE();
			}
		});
		lichsuve.setForeground(Color.WHITE);
		lichsuve.setFont(new Font("Tahoma", Font.BOLD, 12));
		lichsuve.setBackground(new Color(112, 128, 144));
		lichsuve.setBounds(956, 190, 78, 74);
		contentPane.add(lichsuve);
		
		JButton taochuyen = new JButton("");
		taochuyen.setIcon(new ImageIcon("D:\\METRO\\img\\technical-support.png"));
		taochuyen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TAOVETAU();
			}
		});
		
		taochuyen.setForeground(Color.WHITE);
		taochuyen.setFont(new Font("Tahoma", Font.BOLD, 12));
		taochuyen.setBackground(new Color(112, 128, 144));
		taochuyen.setBounds(421, 190, 78, 74);
		contentPane.add(taochuyen);
		
		JLabel lblNewLabel_1 = new JLabel("Tìm vé");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(159, 271, 71, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Trả vé");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(290, 271, 71, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cài đặt ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(421, 274, 78, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Thống kê");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(559, 274, 78, 22);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("Normal Ticket");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 27));
		lblNewLabel_3.setBounds(110, 582, 315, 36);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Round-trip (Khứ Hồi)");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(183, 698, 178, 36);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_11 = new JLabel("One way (Một chiều)");
		lblNewLabel_3_11.setForeground(Color.WHITE);
		lblNewLabel_3_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_11.setBounds(183, 628, 190, 36);
		contentPane.add(lblNewLabel_3_11);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tra cứu");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(694, 274, 71, 22);
		contentPane.add(lblNewLabel_1_4);
		
		
		JLabel lblNewLabel_1_5 = new JLabel("Liên hệ");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(823, 274, 78, 22);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Lịch sử");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(956, 274, 78, 22);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Quy định");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_7.setBounds(1089, 271, 78, 22);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lbanh1 = new JLabel("");
		lbanh1.setBorder(new LineBorder(Color.WHITE, 6));
		lbanh1.setBounds(559, 348, 195, 224);
		contentPane.add(lbanh1);
		ImageIcon icon11=new ImageIcon("D:\\\\METRO\\\\img\\\\0003.jpg");
		Image imgIcon11 =icon11.getImage();
		Image imgScale11 =imgIcon11.getScaledInstance(lbanh1.getWidth(), lbanh1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon11=new ImageIcon(imgScale11);
		lbanh1.setIcon(scaleIcon11); 
		
		JLabel lbanh1_1 = new JLabel("");
		lbanh1_1.setBorder(new LineBorder(Color.WHITE, 6));
		lbanh1_1.setBounds(958, 348, 191, 224);
		contentPane.add(lbanh1_1);
		ImageIcon icon111=new ImageIcon("D:\\\\METRO\\\\img\\\\0001.jpg");
		Image imgIcon111 =icon111.getImage();
		Image imgScale111 =imgIcon111.getScaledInstance(lbanh1_1.getWidth(), lbanh1_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon111=new ImageIcon(imgScale111);
		lbanh1_1.setIcon(scaleIcon111);
		
		JLabel lbanh1_2 = new JLabel("");
		lbanh1_2.setBorder(new LineBorder(Color.WHITE, 6));
		lbanh1_2.setBounds(171, 348, 190, 224);
		contentPane.add(lbanh1_2);
		ImageIcon icon1111=new ImageIcon("D:\\\\METRO\\\\img\\\\0002.jpg");
		Image imgIcon1111 =icon1111.getImage();
		Image imgScale1111 =imgIcon1111.getScaledInstance(lbanh1_2.getWidth(), lbanh1_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1111=new ImageIcon(imgScale1111);
		lbanh1_2.setIcon(scaleIcon1111); 
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setEnabled(false);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(110, 179, 1103, 120);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("200.000 (VND)");
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(193, 662, 139, 26);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("400.000 (VND)");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.ORANGE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_1.setBounds(193, 744, 139, 26);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("VIP discount Ticket");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Segoe Print", Font.BOLD, 27));
		lblNewLabel_3_2.setBounds(506, 582, 315, 36);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("One way (Một chiều)");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1_1.setBounds(579, 628, 190, 36);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("100.000 (VND)");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setForeground(Color.ORANGE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_2.setBounds(589, 662, 139, 26);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Round-trip (Khứ Hồi)");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1_2.setBounds(579, 698, 178, 36);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("200.000 (VND)");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setForeground(Color.ORANGE);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_1_1.setBounds(589, 744, 139, 26);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("First Time Ticket");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Segoe Print", Font.BOLD, 27));
		lblNewLabel_3_3.setBounds(898, 582, 315, 36);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("One way (Một chiều)");
		lblNewLabel_3_1_3.setForeground(Color.WHITE);
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1_3.setBounds(971, 628, 190, 36);
		contentPane.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("140.000 (VND)");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setForeground(Color.ORANGE);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_3.setBounds(981, 662, 139, 26);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Round-trip (Khứ Hồi)");
		lblNewLabel_3_1_4.setForeground(Color.WHITE);
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1_4.setBounds(971, 698, 178, 36);
		contentPane.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("280.000 (VND)");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setForeground(Color.ORANGE);
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_1_2.setBounds(981, 744, 139, 26);
		contentPane.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("Nhân viên:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(944, 127, 90, 28);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-46, 0, 1391, 814);
		contentPane.add(lblNewLabel_2);
		ImageIcon icon2=new ImageIcon("D:\\METRO\\img\\407993.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel_2.setIcon(scaleIcon2);
		

		
		
	}
}
