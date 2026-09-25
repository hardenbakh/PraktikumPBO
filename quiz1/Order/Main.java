package quiz1.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "Budi Santoso", "Malang", 81234567);
        Product p1 = new Product(1, 150000.0, "Oli Mesin Fully Synthetic");
        Product p2 = new Product(2, 50000.0, "Filter Udara");

        Stock s1 = new Stock(1, 20, 1);
        s1.modifyStock(18);

        Order order = new Order(5001, customer1);
        order.addProduct(p1, 2);
        order.addProduct(p2, 1);

        order.displayOrderDetails();
    }
}
