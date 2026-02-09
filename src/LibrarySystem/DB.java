package LibrarySystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	public static Connection getConnection() {
		String url = "jdbc:postgresql://localhost:5432/training";
		String uname = "postgres";
		String pwd = "1234";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, uname, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}
}
