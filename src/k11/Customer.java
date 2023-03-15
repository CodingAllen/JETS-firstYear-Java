package k11;

public class Customer {
    private String customerNo;
    private String customerName;

    public Customer(String customerNo, String customerName) {
        this.customerNo = customerNo;
        this.customerName = customerName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }
}
