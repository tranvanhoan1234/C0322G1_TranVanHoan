package model;

public class ListCustomer {
    private int customerId;
    private String customerName;
    private String customerDateOfBirth;
    private String address;
    private String customerImg;

    public ListCustomer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerDateOfBirth() {
        return customerDateOfBirth;
    }

    public void setCustomerDateOfBirth(String customerDateOfBirth) {
        this.customerDateOfBirth = customerDateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerImg() {
        return customerImg;
    }

    public void setCustomerImg(String customerImg) {
        this.customerImg = customerImg;
    }

    public ListCustomer(int customerId, String customerName, String customerDateOfBirth, String address, String customerImg) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerDateOfBirth = customerDateOfBirth;
        this.address = address;
        this.customerImg = customerImg;

    }
}
