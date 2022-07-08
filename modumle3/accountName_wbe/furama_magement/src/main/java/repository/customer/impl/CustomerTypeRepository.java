package repository.customer.impl;

import db_conection.DBConnect;
import model.customer.CustomerType;
import repository.customer.ICustomerTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository implements ICustomerTypeRepository {
    private final String SELECT_CUSTOMER_TYPE = "SELECT * FROM customer_type ";
    private DBConnect dbConnect = new DBConnect();

    @Override
    public List<CustomerType> findAll() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();
        try {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_TYPE);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("customer_type_id");
                    String name = resultSet.getString("customer_type_name");
                    CustomerType customerType =new CustomerType(id,name);
                    customerTypeList.add(customerType);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return customerTypeList;
    }
}
