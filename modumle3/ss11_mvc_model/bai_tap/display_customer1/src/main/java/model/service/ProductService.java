package model.service;

import model.product.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void create(Product product);
    void update(Integer id, Product product);
    void delete(int id);
    Product detail(Integer id);
    Product searchId(int id);
    Product search(String name);
}
