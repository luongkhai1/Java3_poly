package asm;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	private final String severanme = "localhost";
	private final String portNumber = "1433";
	private final String dbname = "FPL_DaoTao";
	private final String username = "sq";
	private final String password = "1234567890";
	
	String url = "jdbc:sqlserver://"+severanme+":"+portNumber+";databaseName="+dbname+";user="+username+";password="+password+";encrypt=false";	
	
	public Connection ConnectDao() {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url);
			System.out.println("ket noi thanh cong");
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return con;
	}
	
	public static void main(String[] args) {
		new Connect().ConnectDao();
	}
}
