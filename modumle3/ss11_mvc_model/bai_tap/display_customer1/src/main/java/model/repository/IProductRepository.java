package model.repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void create(Product product);
    void update(Integer id, Product product);
    void delete(int id);
    Product searchId(int id);
    Product search(String name);
}
