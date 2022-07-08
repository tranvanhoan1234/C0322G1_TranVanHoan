package model;

public class Product {
    private Integer idProduct;
    private String tenProduct;
    private Double giaProduct;
    private Integer soLuongProduct;
    private String mauSacProduct;
    private String moTaProduct;
    private Integer idCategory;

    public Product() {
    }

    public Product(Integer idProduct, String tenProduct, Double giaProduct, Integer soLuongProduct, String mauSacProduct, String moTaProduct, Integer idCategory) {
        this.idProduct = idProduct;
        this.tenProduct = tenProduct;
        this.giaProduct = giaProduct;
        this.soLuongProduct = soLuongProduct;
        this.mauSacProduct = mauSacProduct;
        this.moTaProduct = moTaProduct;
        this.idCategory = idCategory;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getTenProduct() {
        return tenProduct;
    }

    public void setTenProduct(String tenProduct) {
        this.tenProduct = tenProduct;
    }

    public Double getGiaProduct() {
        return giaProduct;
    }

    public void setGiaProduct(Double giaProduct) {
        this.giaProduct = giaProduct;
    }

    public Integer getSoLuongProduct() {
        return soLuongProduct;
    }

    public void setSoLuongProduct(Integer soLuongProduct) {
        this.soLuongProduct = soLuongProduct;
    }

    public String getMauSacProduct() {
        return mauSacProduct;
    }

    public void setMauSacProduct(String mauSacProduct) {
        this.mauSacProduct = mauSacProduct;
    }

    public String getMoTaProduct() {
        return moTaProduct;
    }

    public void setMoTaProduct(String moTaProduct) {
        this.moTaProduct = moTaProduct;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }
}
