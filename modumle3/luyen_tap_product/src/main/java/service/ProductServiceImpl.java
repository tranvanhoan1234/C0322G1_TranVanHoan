package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductRepository iProductRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void create(Product product) {
        iProductRepository.creat(product);
    }

    @Override
    public Product searchId(int id) {
        return iProductRepository.searchId(id);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }
}
