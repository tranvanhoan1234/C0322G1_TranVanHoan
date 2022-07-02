package model.service.impl;

import model.product.Product;
import model.repository.ProductRepository;
import model.repository.impl.ProductRepositoryImpl;
import model.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public void update(Integer id, Product product) {
        productRepository.update(id, product);

    }

    @Override
    public void delete(int id) {
productRepository.delete(id);
    }

    @Override
    public Product detail(Integer id) {
        return null;
    }

    @Override
    public Product searchId(int id) {
      return productRepository.searchId(id);
}

    @Override
    public Product search(String name) {
        return productRepository.search(name);



    }
}
