package quiz1.Order;

public class Product {
    private int productId;
    private double productPrice;
    private String productType;

    public Product(int productId, double productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() { 
        return productId; 
    }
    public double getProductPrice() { 
        return productPrice; 
    }
    public String getProductType() { 
        return productType; 
    }
}