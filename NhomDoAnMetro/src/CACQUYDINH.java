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

public class CACQUYDINH extends JFrame {

	private JPanel contentPane;

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
	public CACQUYDINH() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\METRO\\img\\metro-subway-underground-train-railway-engine-emoj-symbol-30744.png"));
		setTitle("CÁC QUY ĐỊNH TRÊN TÀU");

	
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
		logo.setBounds(380, 41, 293, 69);
		contentPane.add(logo);
		ImageIcon icon1=new ImageIcon("D:\\\\METRO\\\\img\\\\logomain.png");
		Image imgIcon1 =icon1.getImage();
		Image imgScale1 =imgIcon1.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon1=new ImageIcon(imgScale1);
		logo.setIcon(scaleIcon1);
	
		
		JLabel lblNewLabel = new JLabel("QUY ĐỊNH");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(153, 204, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(55, 159, 970, 48);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		scrollPane.setAutoscrolls(true);
	
		scrollPane.setBounds(55, 205, 970, 355);
		contentPane.add(scrollPane);
		
		JTextArea txtrThiGian = new JTextArea();
		txtrThiGian.setEditable(false);
		txtrThiGian.setWrapStyleWord(true);
		txtrThiGian.setLineWrap(true);
		txtrThiGian.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		txtrThiGian.setText("1. Thời gian, mức phí đổi trả vé:\r\n\r\n- Đổi vé: Vé cá nhân đổi trước giờ tàu chạy 24 giờ trở lên.không áp dụng đổi vé đối với vé tập thể.\r\n\r\n- Trả vé:\r\n\r\n    + Vé cá nhân: Trả vé trước giờ tàu chạy từ 4 giờ đến dưới 24 giờ.\r\n\r\n    + Vé tập thể: Trả vé trước giờ tàu chạy từ 24 giờ đến dưới 72 giờ.\r\n\r\n2. Hình thức trả vé.\r\n\r\n- Khi hành khách mua vé và thanh toán online qua website bán vé của Ngành Đường sắt, app bán vé hoặc các ứng dụng mua vé tàu hỏa của các đối tác thứ ba thì có thể trả vé online qua các website bán vé của Ngành Đường sắt hoặc đến trực tiếp nhà ga.\r\n\r\n- Khi hành khách mua vé bằng các hình thức khác, muốn đổi vé, trả vé hành khách đến trực tiếp nhà ga kèm theo giấy tờ tùy thân bản chính của người đi tàu (hoặc người mua vé) cho nhân viên đường sắt. Đồng thời, thông tin trên thẻ đi tàu phải trùng khớp với giấy tờ tùy thân của hành khách.\r\n\r\nTrân trọng cảm ơn!.");
		scrollPane.setViewportView(txtrThiGian);
		
		JButton btnNewButton = new JButton("<< Trở lại");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\METRO\\img\\563702.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1084, 637);
		contentPane.add(lblNewLabel_1);
		ImageIcon icon2=new ImageIcon("D:\\\\METRO\\\\img\\\\563702.jpg");
		Image imgIcon2 =icon2.getImage();
		Image imgScale2 =imgIcon2.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaleIcon2=new ImageIcon(imgScale2);
		lblNewLabel_1.setIcon(scaleIcon2);
		
		setVisible(true);
		
	}
}
