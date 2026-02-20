package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PojoImplementation {

    public static void main(String[] args) throws SQLException {
        
        //1
        Connection c=DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/sbs_db?user=postgres&password=1234");
        //2
        String query="select orders.prod_id,prod_name,count() as ord_count,(count()*price) as Tot_rev\r\n"
                + "from product inner join orders\r\n"
                + "on product.prod_id=orders.prod_id\r\n"
                + "group by orders.prod_id,prod_name,price\r\n"
                + "order by count(*) desc\r\n"
                + "limit 3;";
        PreparedStatement ps=c.prepareStatement(query);
        //3
        ps.execute();
        
        //4
        ResultSet rs=ps.getResultSet();
        
        List<ProductReport>arr=new ArrayList<>();
        
        while (rs.next()) {

            ProductReport pr = new ProductReport(
                    rs.getString("product_name"),
                    rs.getInt("ord_count"),
                    rs.getDouble("tot_rev")
            );

            arr.add(pr);
        }


        for(ProductReport r:arr ) {
            System.out.println(r);
        }
        
    }

}

