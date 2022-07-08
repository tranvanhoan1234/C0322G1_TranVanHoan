package model.customer;

public class CustomerType {
    private int idType;
    private String name;

    public CustomerType() {
    }

    public CustomerType(int idType, String name) {
        this.idType = idType;
        this.name = name;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
