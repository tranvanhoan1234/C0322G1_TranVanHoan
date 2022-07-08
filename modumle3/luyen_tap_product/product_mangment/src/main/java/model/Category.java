package model;

public class Category {
    private int idCategory;
    private String tenCategory;

    public Category() {
    }

    public Category(int idCategory, String tenCategory) {
        this.idCategory = idCategory;
        this.tenCategory = tenCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getTenCategory() {
        return tenCategory;
    }

    public void setTenCategory(String tenCategory) {
        this.tenCategory = tenCategory;
    }
}
