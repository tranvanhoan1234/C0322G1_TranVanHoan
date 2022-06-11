package key_study.model.person;

import java.util.Objects;

public class Customer extends Person {
    private Integer customerCode;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    @Override
    public String writerPerson() {
        return getCustomerCode() + "," + getDateOfBirth() + "," + getGender() + "," + getCitizenId() + "," + getNumberPhone() + "," + getGmail() + "," + getFullName() + "," + getTypeOfGuest() + "," + getAddress();
    }

    public Customer(Integer customerCode, String dateOfBirth, String gender, Integer citizenId, Long numberPhone, String gmail, String fullName, String typeOfGuest, String address) {
        super(fullName, dateOfBirth, gender, citizenId, numberPhone, gmail);
        this.customerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Integer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Integer customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer :" +
                "customerCode : " + customerCode +
                super.toString() +
                ", typeOfGuest : '" + typeOfGuest + '\'' +
                ", address : '" + address + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerCode.equals(customer.customerCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerCode);
    }
}
