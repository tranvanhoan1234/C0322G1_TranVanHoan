package ss12_java_collection_framework.bai_tap.model;

public class Product {
    private Integer id;
    private String nameProduct;
    private Integer productPrice;

    public Product() {
    }

    public Product(Integer id, String nameProduct, Integer productPrice) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.productPrice = productPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct(String s) {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product : " +
                "id=" + id +
                ": nameProduct : '" + nameProduct + '\'' +
                ": productPrice :" + productPrice +
                '.';
    }

//    @Override
//    public int compareTo(Product o) {
//      return this.productPrice-o.getProductPrice();
//    }

}
