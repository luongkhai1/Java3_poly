package asm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class QuanLyDiem extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyDiem frame = new QuanLyDiem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLyDiem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 779);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản Lý Điểm Sinh Viên \r\n");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(275, 10, 231, 21);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(25, 54, 737, 99);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mã SV");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(21, 35, 78, 23);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(109, 39, 444, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/search.png")));
		btnNewButton.setBounds(576, 29, 105, 38);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Tìm Kiếm\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(27, 36, 67, 13);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(25, 179, 462, 250);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Họ Tên");
		lblNewLabel_3.setBounds(28, 31, 69, 21);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(124, 35, 168, 13);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mã Sinh Viên");
		lblNewLabel_5.setBounds(28, 75, 69, 13);
		panel_1.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 72, 150, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 114, 150, 19);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_5_1 = new JLabel("Tiếng Anh");
		lblNewLabel_5_1.setBounds(28, 117, 69, 13);
		panel_1.add(lblNewLabel_5_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 155, 150, 19);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("Tin Học");
		lblNewLabel_5_2.setBounds(28, 158, 69, 13);
		panel_1.add(lblNewLabel_5_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 207, 150, 19);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_5_3 = new JLabel("Giáo dục TC");
		lblNewLabel_5_3.setBounds(28, 210, 69, 13);
		panel_1.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Điểm TB");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3_1.setBounds(324, 97, 108, 21);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(337, 138, 69, 64);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("New");
		btnNewButton_1.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/plus.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(549, 193, 138, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Save");
		btnNewButton_1_1.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/save.png")));
		btnNewButton_1_1.setBounds(549, 258, 138, 41);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Delete");
		btnNewButton_1_2.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/delete.png")));
		btnNewButton_1_2.setBounds(549, 324, 138, 41);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Update");
		btnNewButton_1_3.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/update.png")));
		btnNewButton_1_3.setBounds(549, 388, 138, 41);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/back.png")));
		btnNewButton_2.setBounds(24, 449, 70, 41);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/first.png")));
		btnNewButton_2_1.setBounds(157, 449, 70, 41);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/last.png")));
		btnNewButton_2_2.setBounds(279, 449, 70, 41);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.setIcon(new ImageIcon(QuanLyDiem.class.getResource("/img/icon/next.png")));
		btnNewButton_2_3.setBounds(417, 449, 70, 41);
		contentPane.add(btnNewButton_2_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 527, 735, 205);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_7 = new JLabel("3 Sinh Viên Có Điểm Cao Nhất");
		lblNewLabel_7.setForeground(new Color(0, 0, 255));
		lblNewLabel_7.setBounds(25, 504, 215, 13);
		contentPane.add(lblNewLabel_7);
		setVisible(true);
	}
}
