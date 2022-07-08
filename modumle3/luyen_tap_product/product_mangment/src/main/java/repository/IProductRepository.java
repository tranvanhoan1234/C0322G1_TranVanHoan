package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void remove(int idDelete);

    Product findById(int idEdit);

    void editProduct(Product product);

    List<Product> findByName(String name);
}
