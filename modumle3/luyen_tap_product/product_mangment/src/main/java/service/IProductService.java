package service;

import model.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void remove(int idDelete);

    Product findById(int idEdit);

    void editProduct(Product product);

    List<Product> findByName(String name);
}
