package quiz1.Order;

public class OrderDetail {
    private Product product;
    private int quantity;
    private double price;

    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = product.getProductPrice();
    }

    public double getSubtotal() { 
        return price * quantity; 
    }
    public Product getProduct() { 
        return product; 
    }
    public int getQuantity() { 
        return quantity; 
    }
    public double getPrice() { 
        return price; 
    }
}