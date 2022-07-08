package repository.impl;

import connection.DBConnect;
import model.Category;
import repository.ICategoryRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements ICategoryRepository {
    private DBConnect dbConnect = new DBConnect();
    private final String SELECT_ALL_CATEGORY = " SELECT * FROM category; ";

    @Override
    public List<Category> findAll() {
        List<Category> categoryList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CATEGORY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_danh_muc");
                String tenDanhMuc = resultSet.getString("ten_danh_muc");
                Category category = new Category(id,tenDanhMuc);
                categoryList.add(category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return categoryList;
    }
}
