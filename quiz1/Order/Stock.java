package quiz1.Order;

public class Stock {
    private int productId;
    private int quantity;
    private int shopNo;

    public Stock(int productId, int quantity, int shopNo) {
        this.productId = productId;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public void modifyStock(int newQuantity) {
        this.quantity = newQuantity;
        System.out.println("[Stock Log] Stok produk ID " + productId + " diperbarui menjadi: " + quantity + " unit.");
    }
}