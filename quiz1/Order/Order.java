package quiz1.Order;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<OrderDetail> orderDetails; 
    private Date orderDate;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDetails = new ArrayList<>();
        this.orderDate = new Date();
    }

    public void addProduct(Product product, int quantity) {
        orderDetails.add(new OrderDetail(product, quantity));
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < orderDetails.size(); i++) {
            total += orderDetails.get(i).getSubtotal();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("DETAIL TRANSAKSI (ORDER)");
        System.out.println();
        System.out.println("ID Order     : " + orderId);
        System.out.println("Tanggal      : " + orderDate);
        System.out.println("Pelanggan    : " + customer.getCustomerName() + " (ID: " + customer.getCustomerId() + ")");
        System.out.println("Alamat       : " + customer.getAddress());
        System.out.println("No HP        : " + customer.getPhone());
        System.out.println();

        // daftar order/pembelian
        System.out.println("Daftar Item:");
        for (int i = 0; i < orderDetails.size(); i++) {
            OrderDetail d = orderDetails.get(i);
            System.out.println("- " + d.getProduct().getProductType() +    " | Qty: " + d.getQuantity() + " | Harga: Rp" + d.getPrice() + " | Subtotal: Rp" + d.getSubtotal());
        }

        System.out.println();
        System.out.println("TOTAL BAYAR  : Rp" + calculateTotal());
        System.out.println();
    }
}