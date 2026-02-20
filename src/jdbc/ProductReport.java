package jdbc;

public class ProductReport {

    private String prodName;
    private int orderCount;
    private double totalRevenue;

    public ProductReport(String prodName, int orderCount, double totalRevenue) {
        this.prodName = prodName;
        this.orderCount = orderCount;
        this.totalRevenue = totalRevenue;
    }

    public String getProdName() {
        return prodName;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    @Override
    public String toString() {
        return "ProductReport{" +
                "prodName='" + prodName + '\'' +
                ", orderCount=" + orderCount +
                ", totalRevenue=" + totalRevenue +
                '}';
    }
}
