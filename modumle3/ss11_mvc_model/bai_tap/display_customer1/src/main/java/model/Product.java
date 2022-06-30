package model;

public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private String descriptionOfThe;
    private String producer;

    public Product() {
    }

    public Product(Integer id, String name, Integer price, String descriptionOfThe, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descriptionOfThe = descriptionOfThe;
        this.producer = producer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescriptionOfThe() {
        return descriptionOfThe;
    }

    public void setDescriptionOfThe(String descriptionOfThe) {
        this.descriptionOfThe = descriptionOfThe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
