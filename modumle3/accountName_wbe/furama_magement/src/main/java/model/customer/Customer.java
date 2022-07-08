package model.customer;

public class Customer {
    private int id;
    private String name;
    private String dateOfBirth;
    private Integer gender;
    private String idCar;
    private String phoneNumber;
    private String email;
    private String address;
    private int type_id;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, Integer gender, String idCar, String phoneNumber, String email, String address, int type_id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCar = idCar;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.type_id = type_id;
    }

    public Customer(int id, String name, String dateOfBirth, Integer gender, String idCar, String phoneNumber, String email, String address, int type_id) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCar = idCar;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.type_id = type_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type_id=" + type_id +
                '}';
    }
}
