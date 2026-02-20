package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertProductProcedure {

    private static final String URL = "jdbc:postgresql://localhost:5432/sbs_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {

        String sql = "{ call insert_product(?, ?, ?, ?) }";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             CallableStatement cs = con.prepareCall(sql)) {

            cs.setString(1, "Laptop");
            cs.setString(2, "Gaming Laptop");
            cs.setDouble(3, 75000);
            cs.setString(4, "Electronics");

            cs.execute();

            System.out.println(" Product inserted successfully!");

        } catch (SQLException e) {
            System.err.println(" Error while inserting product:");
            e.printStackTrace();
        }
    }
}
