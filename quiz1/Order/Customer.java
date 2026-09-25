package quiz1.Order;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private int phone;

    public Customer(int customerId, String customerName, String address, int phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }
}