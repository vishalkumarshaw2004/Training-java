package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BatchTransactionDemo {

	private static final String URL = "jdbc:postgresql://localhost:5432/sbs_db";
	private static final String USER = "postgres";
	private static final String PASSWORD = "1234";

	public static void main(String[] args) {

		Connection con = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);

			con.setAutoCommit(false);

			String productSql = """
					INSERT INTO product(product_name, product_desc, price, product_category)
					VALUES (?, ?, ?, ?)
					""";

			PreparedStatement ps = con.prepareStatement(productSql);

			ps.setString(1, "Phone");
			ps.setString(2, "Android Phone1111");
			ps.setDouble(3, 20000);
			ps.setString(4, "Electronics");
			ps.addBatch();

			ps.setString(1, "TV");
			ps.setString(2, "Smart TV");
			ps.setDouble(3, 45000);
			ps.setString(4, "Electronics");
			ps.addBatch();

			ps.executeBatch();
            con.commit();
            
            System.out.println("Product table populated");
			ResultSet rs = ps.getGeneratedKeys();
			List<Integer> productIds = new ArrayList<>();

			while (rs.next()) {
				productIds.add(rs.getInt(1));
			}

			String orderSql = """
					INSERT INTO orders(product_id, order_date, order_type)
					VALUES (?, CURRENT_DATE, ?)
					""";

			PreparedStatement orderStmt = con.prepareStatement(orderSql);

			for (Integer id : productIds) {
				orderStmt.setInt(1, id);
				orderStmt.setString(2, "Online");
				orderStmt.addBatch();
			}

			orderStmt.executeBatch();

			con.commit();
			System.out.println(" Transaction committed successfully!");

		} catch (Exception e) {

			try {
				if (con != null) {
					con.rollback();
					System.out.println(" Transaction rolled back!");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

			e.printStackTrace();

		} finally {

			try {
				if (con != null) {
					con.setAutoCommit(true);
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
