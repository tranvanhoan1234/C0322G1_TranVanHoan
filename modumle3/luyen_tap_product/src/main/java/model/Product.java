package model;

public class Product {
    private int id;
    private String name;
    private int gia;
    private String moTa;
    private String hang;

    public Product() {
    }

    public Product(int id, String name, int gia, String moTa, String hang) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.moTa = moTa;
        this.hang = hang;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
}
