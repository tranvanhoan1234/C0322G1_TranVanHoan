package ss17_io_binary_file.bai_tap.model;

import java.io.Serializable;

public class ProductManagement implements Serializable {
    private Integer productCode;
    private String ProductName;
    private String khanOfProduction;
    private Integer price;

    public ProductManagement() {
    }

    public ProductManagement(Integer productCode, String productName, String khanOfProduction, Integer price) {
        this.productCode = productCode;
        ProductName = productName;
        this.khanOfProduction = khanOfProduction;
        this.price = price;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getKhanOfProduction() {
        return khanOfProduction;
    }

    public void setKhanOfProduction(String khanOfProduction) {
        this.khanOfProduction = khanOfProduction;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "productCode=" + productCode +
                ", ProductName=" + ProductName +
                ", khanOfProduction=" + khanOfProduction +
                ", price=" + price +
                '.';
    }
}
