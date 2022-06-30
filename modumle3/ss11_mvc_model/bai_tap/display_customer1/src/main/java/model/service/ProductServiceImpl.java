package model.service;

import model.Product;
import model.repository.IProductRepository;
import model.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductRepository iProductRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void create(Product product) {
        iProductRepository.create(product);
    }

    @Override
    public void update(Integer id, Product product) {
        iProductRepository.update(id, product);

    }

    @Override
    public void delete(int id) {
iProductRepository.delete(id);
    }

    @Override
    public Product detail(Integer id) {
        return null;
    }

    @Override
    public Product searchId(int id) {
      return iProductRepository.searchId(id);
}

    @Override
    public Product search(String name) {
        return iProductRepository.search(name);



    }
}
