package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductRepositoryImpl implements IProductRepository {
    private static Map<Integer, Product> products = new TreeMap<Integer, Product>();

    static{
        products.put(1, new Product(1, "keo ngot", 1000.0, "vip", "thuong dinh"));
        products.put(2, new Product(2, "keo dang", 200.0, "tot", "vnn"));
        products.put(3, new Product(3, "keo chua", 30000.0, "tot", "Boeing"));
        products.put(4, new Product(4, "keo bui", 40000.0, "tot", "HalandBay"));
        products.put(5, new Product(5, "keo cay", 500.0, "ga", "Volvo"));
    }
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        Integer temp =0;
        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            temp = productEntry.getKey();
        }
        if(temp == null){
            products.put(1, product);
        }
        else{
            products.put(temp + 1, product);
        }
    }

    @Override
    public void remove(int id) {
        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            if(productEntry.getValue().getId() == id){
                products.remove(productEntry.getKey(), productEntry.getValue());
                break;
            }
        }
    }

    public Product search(int id){
        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            if(productEntry.getValue().getId() == id){
                return productEntry.getValue();
            }
        }
        return null;
    }

    public void update(int id, Product product){
        products.put(id, product);
    }

    public Product searchName(String name){
        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            if(productEntry.getValue().getName().equals(name)){
                return productEntry.getValue();
            }
        }
        return null;
    }

}
