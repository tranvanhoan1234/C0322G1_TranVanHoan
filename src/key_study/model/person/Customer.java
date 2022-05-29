package key_study.model.person;

public class Customer extends Person {
    private Integer customerCode;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    @Override
    public String writerPerson() {
        return getFullName()+","+getDateOfBirth()+","+getGender()+","+getCitizenId()+","+getNumberPhone()+","+getGmail()+","+getCustomerCode()+","+getTypeOfGuest()+","+getAddress();
    }

    public Customer(String fullName, String dateOfBirth, int i, String gender, Integer citizenId, Long numberPhone, String gmail, Integer customerCode, String typeOfGuest, String address) {
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
        return "Customer : " +
                "customerCode : " + customerCode +
                super.toString() +
                ", typeOfGuest : '" + typeOfGuest + '\'' +
                ", address : '" + address + '\'' +
                '.';
    }
}
