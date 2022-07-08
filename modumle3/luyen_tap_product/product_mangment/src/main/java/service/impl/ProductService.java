package service.impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ProductService implements IProductService {
   private IProductRepository productRepository = new ProductRepository();

   @Override
   public List<Product> findAll() {
      return this.productRepository.findAll();
   }

   @Override
   public void remove(int idDelete) {
      this.productRepository.remove(idDelete);
   }

   @Override
   public Product findById(int idEdit) {
      return this.productRepository.findById(idEdit);
   }

   @Override
   public void editProduct(Product product) {
      this.productRepository.editProduct(product);
   }

   @Override
   public List<Product> findByName(String name) {
      return productRepository.findByName(name);
   }
}

