package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void save(Product product);

    void remove(int id);

    Product search(int id);

    Product searchName(String name);

    void update(int id, Product product);

}
