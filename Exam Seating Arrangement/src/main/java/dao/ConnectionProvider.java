package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esa?useSSL=false", "root","123456");
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
