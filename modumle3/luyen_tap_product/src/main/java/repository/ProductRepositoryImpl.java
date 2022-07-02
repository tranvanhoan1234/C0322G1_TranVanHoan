package repository;

import model.Product;
import repository.contract_database.BaseRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    List<Product> productList = new ArrayList<>();
    private static final String FIND_ALL = "SELECT * FROM product";
    private static final String CREAT = "INSERT INTO product(name,gia,moTa,hang) " + " values(?,?,?,?)";
    private static final String DELETE = " delete from product where id = ?; ";
    @Override
    public List<Product> findAll() {
        productList.clear();
        try {
            Connection connection = new BaseRepository().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product = null;
            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String name = resultSet.getString("name");
                int gia = Integer.parseInt(resultSet.getString("gia"));
                String mota = resultSet.getString("mota");
                String hang = resultSet.getString("hang");
                product = new Product(id, name, gia, mota, hang);
                productList.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public void creat(Product product) {
        try {
            Connection connection = new BaseRepository().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(CREAT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, String.valueOf(product.getGia()));
            preparedStatement.setString(3, product.getMoTa());
            preparedStatement.setString(4, product.getHang());
            preparedStatement.executeLargeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean delete(int id) {
        boolean rowDeleted = false;
        try {
            Connection connection = new BaseRepository().getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE); {
                statement.setInt(1, id);
                rowDeleted = statement.executeUpdate() > 0;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
       return rowDeleted;
    }
    @Override
    public Product searchId(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
            }
        }
        return productList.get(id);
    }
}
