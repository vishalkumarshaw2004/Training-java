package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSetup {

	public static void main(String[] args) {

		try {

			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sbs_db", "postgres",
					"1234");

			int productId = 2;

			Statement stmt = conn.createStatement();

			String checkQuery = "select * from orders where product_id = " + productId;
			ResultSet rs = stmt.executeQuery(checkQuery);

			if (rs.next()) {
				System.out.println("Cannot delete product as it has associated orders");
			} else {

				String deleteQuery = "delete from product where product_id = " + productId;
				int rows = stmt.executeUpdate(deleteQuery);

				if (rows > 0) {
					System.out.println("Product deleted successfully");
				} else {
					System.out.println("Product not found");
				}
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
