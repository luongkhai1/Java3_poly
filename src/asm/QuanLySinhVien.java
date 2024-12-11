package asm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class QuanLySinhVien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private File selectedFile; 
	private String filename;
	private JLabel lblname;
	private ImageIcon icon;
	private JLabel lblimg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLySinhVien frame = new QuanLySinhVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setImg() {
		Image image = icon.getImage();
		Image newimage = image.getScaledInstance(132, 136, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimage);
		lblimg.setIcon(icon);
	}
	/**
	 * Create the frame.
	 */
	public QuanLySinhVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 752);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản Lý Sinh Viên");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(309, 10, 159, 21);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 56, 770, 586);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sinh Viên");
		lblNewLabel_1.setBounds(107, 42, 75, 23);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(200, 44, 143, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Họ Tên");
		lblNewLabel_1_1.setBounds(107, 86, 75, 23);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 88, 143, 19);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setBounds(107, 128, 75, 23);
		panel.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(200, 130, 143, 19);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Số Điện Thoại");
		lblNewLabel_1_3.setBounds(107, 175, 75, 23);
		panel.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(200, 177, 143, 19);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Giới Tính");
		lblNewLabel_1_3_1.setBounds(107, 229, 75, 23);
		panel.add(lblNewLabel_1_3_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setBounds(188, 230, 67, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
		rdbtnNewRadioButton_1.setBounds(269, 230, 75, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Địa Chỉ");
		lblNewLabel_1_3_1_1.setBounds(120, 276, 62, 23);
		panel.add(lblNewLabel_1_3_1_1);
		
		JButton btnchooserfile = new JButton("Chooser File");
		btnchooserfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				fileChooser.setFileFilter(new FileNameExtensionFilter("File Ảnh", "png","jpg"));
				int Result = fileChooser.showOpenDialog(QuanLySinhVien.this);
				if (Result == fileChooser.APPROVE_OPTION) {
					selectedFile = fileChooser.getSelectedFile();
					filename = selectedFile.getName();
					lblname.setText(filename);
					icon = new ImageIcon(selectedFile.getAbsolutePath());
					setImg();
				}
				
			}
		});
		btnchooserfile.setIcon(new ImageIcon(QuanLySinhVien.class.getResource("/img/icon/open.png")));
		btnchooserfile.setBounds(603, 87, 136, 33);
		panel.add(btnchooserfile);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(194, 257, 194, 79);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_1 = new JButton("New");
		btnNewButton_1.setIcon(new ImageIcon(QuanLySinhVien.class.getResource("/img/icon/new.png")));
		btnNewButton_1.setBounds(442, 201, 109, 33);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Save");
		btnNewButton_1_1.setIcon(new ImageIcon(QuanLySinhVien.class.getResource("/img/icon/save.png")));
		btnNewButton_1_1.setBounds(596, 201, 109, 33);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Delete");
		btnNewButton_1_2.setIcon(new ImageIcon(QuanLySinhVien.class.getResource("/img/icon/delete.png")));
		btnNewButton_1_2.setBounds(442, 266, 109, 33);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Update");
		btnNewButton_1_3.setIcon(new ImageIcon(QuanLySinhVien.class.getResource("/img/icon/update.png")));
		btnNewButton_1_3.setBounds(596, 271, 109, 33);
		panel.add(btnNewButton_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(107, 346, 598, 153);
		panel.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		lblname = new JLabel("");
		lblname.setBounds(591, 144, 45, 13);
		panel.add(lblname);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(419, 55, 132, 136);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblimg = new JLabel("");
		lblimg.setBounds(0, 0, 132, 136);
		panel_1.add(lblimg);
		setVisible(true);
	}
}
