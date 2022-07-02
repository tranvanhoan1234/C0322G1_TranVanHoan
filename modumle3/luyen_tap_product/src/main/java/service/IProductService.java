package service;

import model.Product;

import java.util.List;

public interface IProductService {
   List<Product> findAll ();
   void create (Product product);
  Product searchId(int id);
  void delete(int id);
}
