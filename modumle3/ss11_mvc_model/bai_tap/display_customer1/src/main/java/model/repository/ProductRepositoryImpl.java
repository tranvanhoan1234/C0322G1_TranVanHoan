package model.repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductRepositoryImpl implements IProductRepository {

    private static Map<Integer, Product> products = new TreeMap<Integer, Product>();

    static{
        products.put(1, new Product(1, "keo ngot", 10000, "vip", "thuong dinh"));
        products.put(2, new Product(2, "keo dang", 2000, "tot", "vnn"));
        products.put(3, new Product(3, "keo chua", 300000, "tot", "Boeing"));
        products.put(4, new Product(4, "keo bui", 400000, "tot", "HalandBay"));
        products.put(5, new Product(5, "keo cay", 5000, "ga", "Volvo"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values()) ;
    }

    @Override
    public void create(Product product) {
        Integer temp =0;
        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            temp = productEntry.getKey();
        }
        if(temp == null){
            products.put(1, product);
        }
        else {
            products.put(temp + 1, product);
        }
    }

    @Override
    public void update(Integer id, Product product) {

        products.put(id, product);

    }
    @Override
    public void delete(int id) {
        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            if(productEntry.getValue().getId() == id){
                products.remove(productEntry.getKey());
                break;
            }
        }

    }


    @Override
    public Product searchId(int id) {

        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            if(productEntry.getValue().getId() == id){
                return productEntry.getValue();
            }
        }
        return null;
    }
    @Override
    public Product search(String name) {

        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            if(productEntry.getValue().getName() == name){
                return productEntry.getValue();
            }
        }
        return null;
    }
}
