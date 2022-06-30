package model.service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void create(Product product);
    void update(Integer id, Product product);
    void delete(int id);
    Product detail(Integer id);
    Product searchId(int id);
    Product search(String name);
}
