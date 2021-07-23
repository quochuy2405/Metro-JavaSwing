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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class LIENHE extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LIENHE frame = new LIENHE();
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
	public LIENHE() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\METRO\\img\\metro-subway-underground-train-railway-engine-emoj-symbol-30744.png"));
		setTitle("THÔNG TIN LIÊN HỆ");
	
	
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1088, 731);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("D:\\METRO\\img\\logomain.png"));
		logo.setBounds(385, 26, 284, 61);
		contentPane.add(logo);
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		logo.setIcon(scaleIcon1);

		
		JLabel lblNewLabel = new JLabel("THÔNG TIN LIÊN HỆ");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(153, 153, 204));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(62, 166, 962, 48);
		contentPane.add(lblNewLabel);
		
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
		
		JTextArea txtrThiGian = new JTextArea();
		txtrThiGian.setBounds(62, 212, 962, 429);
		contentPane.add(txtrThiGian);
		txtrThiGian.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		txtrThiGian.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		txtrThiGian.setText("Thông tin liên hệ\r\nTổng công ty Đường sắt Việt Nam\r\nĐiện thoại: 19006469\r\nEmail: dsvn@vr.com.vn.\r\nGiấy chứng nhận ĐKKD số 113642 theo QĐ thành lập số 973/QĐ-TTg ngày 25/06/2010 của Thủ tướng Chính phủ.\r\n\r\nMã số doanh nghiệp: 0100105052, đăng ký lần đầu ngày 26/07/2010, đăng ký thay đổi lần 4 ngày 27/06/2014 tại Sở KHĐT Thành phố Hà Nội.\r\n\r\nTổng đài hỗ trợ khách hàng\r\nFPT: 19006469\r\n\r\nKhu vực miền Bắc: 1900 0109\r\n\r\nKhu vực miền Nam: 1900 1520\r\n\r\nEmail: support1@dsvn.vn\r\nsupport2@dsvn.vn");
		txtrThiGian.setLineWrap(true);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 1084, 703);
		contentPane.add(lblNewLabel_1);
		ImageIcon icon11=new ImageIcon("D:\\\\METRO\\\\img\\\\563702.jpg");
		Image imgIcon11 =icon11.getImage();
		Image imgScale11 =imgIcon11.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon11=new ImageIcon(imgScale11);
		lblNewLabel_1.setIcon(scaleIcon11);
		setVisible(true);
		
	}
}
