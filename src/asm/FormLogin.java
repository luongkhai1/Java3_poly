package asm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class FormLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField txtpassword;
	
	private Connection con = new Connect().ConnectDao();
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLogin frame = new FormLogin();
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
	public FormLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 257);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 416, 201);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 68, 17);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 30, 396, 147);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Name \r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(31, 27, 93, 23);
		panel_1.add(lblNewLabel_1);
		
		txtusername = new JTextField();
		txtusername.setBounds(146, 30, 196, 19);
		panel_1.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(31, 73, 93, 23);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login();
			}
		});
		btnNewButton.setBounds(156, 105, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(251, 105, 85, 21);
		panel_1.add(btnCancel);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(146, 76, 196, 19);
		panel_1.add(txtpassword);
		
	}
	public boolean check() {
		if (txtusername.getText().trim().isEmpty()||txtpassword.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(contentPane, "bạn vui lòng nhập đầy đủ thông tin");
			return false;
		}
		return true;
	}
	
	public void Login() {
		if (check()) {
			try {
				String sql = "SELECT Roles FROM dbo.USERS WHERE Username = N'"+txtusername.getText()+"' AND Passwords = N'"+txtpassword.getText()+"'";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				if (!rs.next()) {
					JOptionPane.showMessageDialog(contentPane, "sai tên đăng nhập hoặc mật khẩu");
				}else {
						if (rs.getString(1).equalsIgnoreCase("dao tao")) {
							setVisible(false);
							new QuanLySinhVien();
						}else {
							setVisible(false);
							new QuanLyDiem();
						}								
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
