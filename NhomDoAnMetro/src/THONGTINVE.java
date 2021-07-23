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

import com.lowagie.text.pdf.codec.Base64.InputStream;
import com.toedter.calendar.JDateChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
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
public class THONGTINVE extends JFrame {

	protected static final Hashtable Hashtable = null;
	private JPanel contentPane;
	JLabel mave,mave_1,mave_2,mave_3,mave_4,mave_5;

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
	public THONGTINVE() {
		setTitle("THÔNG TIN VÉ");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\METRO\\img\\metro-subway-underground-train-railway-engine-emoj-symbol-30744.png"));
	
	
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 587, 618);
		setLocationRelativeTo(null); 
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	JButton btnNewButton_1 = new JButton("<< Trở lại");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("IN VÉ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("oracle.jdbc.OracleDriver");  
					  
					//step2 create  the connection object  
					java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","doan1","doan1"); 
					Hashtable map= new Hashtable() ;
								JasperReport report = JasperCompileManager.compileReport("D:\\METRO\\src\\Ticket.jrxml");
							JasperPrint p= JasperFillManager.fillReport(report, map,con);
							JasperViewer.viewReport(p,false);
							java.io.OutputStream os1=new FileOutputStream(new File("D:\\METRO\\Vein"));
							JasperExportManager.exportReportToPdfStream(p, os1);
				
					con.close();

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			


		}});
		btnNewButton.setBounds(194, 540, 142, 26);
		contentPane.add(btnNewButton);
		
	
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	
		
	
	}
	public void setham(String mave1,String mave2,String mave3,String mave4,String mave5,String mave6,String mave7) {
		
		mave = new JLabel(mave1);
		mave.setForeground(Color.BLACK);
		
		 mave.setFont(new Font("Tahoma", Font.BOLD, 15));
			mave.setOpaque(false);
			mave.setBounds(51, 64, 471, 32);
			contentPane.add(mave);
			
			mave_1 = new JLabel(mave2);	
			mave_1.setForeground(Color.BLACK);
		
			mave_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			mave_1.setOpaque(false);
			mave_1.setBounds(51, 117, 471, 32);
			contentPane.add(mave_1);
			
		mave_2 = new JLabel(mave3); 
		mave_2.setForeground(Color.BLACK);
	
		mave_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		mave_2.setOpaque(false);
			
			mave_2.setBounds(51, 176, 471, 32);
			contentPane.add(mave_2);
			
		 mave_3 = new JLabel(mave4);
		 mave_3.setForeground(Color.BLACK);
		
		 mave_3.setFont(new Font("Tahoma", Font.BOLD, 15));
			mave_3.setOpaque(false);
			mave_3.setBounds(51, 236, 471, 32);
			contentPane.add(mave_3);
			
			 mave_4 = new JLabel(mave5);
			 mave_4.setForeground(Color.BLACK);
		
			 mave_4.setFont(new Font("Tahoma", Font.BOLD, 15));
				mave_4.setOpaque(false);
			mave_4.setBounds(51, 296, 471, 32);
			contentPane.add(mave_4);
			
			 mave_5 = new JLabel(mave6);
			   mave_5.setForeground(Color.BLACK);
			  
			   mave_5.setFont(new Font("Tahoma", Font.BOLD, 15));
				mave_5.setOpaque(false);
				mave_5.setBounds(51, 357, 471, 32);
				contentPane.add(mave_5);
		
			JLabel mave_5_1 =new JLabel(mave7);
			mave_5_1.setOpaque(false);
			mave_5_1.setForeground(Color.BLACK);
			mave_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			mave_5_1.setBounds(51, 399, 471, 32);
			contentPane.add(mave_5_1);
				
			JPanel panel = new JPanel();
			panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel.setBackground(Color.WHITE);
			panel.setBounds(42, 49, 480, 397);
			contentPane.add(panel);
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(0, 0, 583, 590);
			contentPane.add(lblNewLabel);	
			ImageIcon icon111 = new ImageIcon("D:\\\\METRO\\\\img\\\\563702.jpg");
			Image imgIcon111 = icon111.getImage();
			Image imgScale111 = imgIcon111.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaleIcon111 = new ImageIcon(imgScale111);
			lblNewLabel.setIcon(scaleIcon111);
			
			setVisible(true);
    }
}
