package repository;

import model.Product;

import java.sql.Connection;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll ();
   void creat(Product product);
    boolean delete(int id);
    Product searchId(int id);
}
