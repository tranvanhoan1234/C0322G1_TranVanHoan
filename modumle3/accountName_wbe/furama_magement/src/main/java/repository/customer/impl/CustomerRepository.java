package repository.customer.impl;

import db_conection.DBConnect;
import model.customer.Customer;
import repository.customer.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String SELECT_CUSTOMER = " SELECT * FROM customer ";
    private final String DELETE_CUSTOMER = " delete from customer where customer_id = ?; ";
    private final String SELECT_CUSTOMER_BY_ID = " SELECT * FROM customer where customer_id = ?; ";

    private final String UPDATE_CUSTOMER_BY_ID = "update customer set customer_name= ?, customer_date_of_birth=? ," +
            "customer_gender=?,customer_id_car= ? ,customer_phone_number=? , " +
            " customer_email= ?,customer_address=? , customer_type_id=? where(customer_id = ? ); ";
    private final String ADD_CUSTOMER = "insert into customer(customer_name,customer_date_of_birth,customer_gender,customer_id_car " +
            " ,customer_phone_number,customer_email,customer_address,customer_type_id)\n " +
            " value(? , ? , ? , ? , ? , ? , ? ,? ); ";

    private final String SEARCH_BY_NAME = " SELECT * FROM customer where customer_name like ? ";

    private DBConnect dbConnect = new DBConnect();

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();

            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("customer_id");
                    String name = resultSet.getString("customer_name");
                    String dateOfBirth = resultSet.getString("customer_date_of_birth");
                    int gender = Integer.parseInt(resultSet.getString("customer_gender"));
                    String idCar = resultSet.getString("customer_id_car");
                    String phoneNumber = resultSet.getString("customer_phone_number");
                    String email = resultSet.getString("customer_email");
                    String address = resultSet.getString("customer_address");
                    int customerTypeId = Integer.parseInt(resultSet.getString("customer_type_id"));
                    Customer customer = new Customer(id, name, dateOfBirth, gender, idCar, phoneNumber, email, address, customerTypeId);
                    customerList.add(customer);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
         finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return customerList;
    }

    @Override
    public void remove(int idDelete) {
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
            preparedStatement.setInt(1, idDelete);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }

    @Override
    public Customer findById(int idEdit) {
        Customer customer = new Customer();
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, idEdit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String dateOfBirth = resultSet.getString("customer_date_of_birth");
                int gender = Integer.parseInt(resultSet.getString("customer_gender"));
                String idCar = resultSet.getString("customer_id_car");
                String phoneNumber = resultSet.getString("customer_phone_number");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int customerTypeId = Integer.parseInt(resultSet.getString("customer_type_id"));
                customer = new Customer(id, name, dateOfBirth, gender, idCar, phoneNumber, email, address, customerTypeId);

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

        return customer;
    }

    @Override
    public void editCustomer(Customer customer) {
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_BY_ID);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getDateOfBirth());
            preparedStatement.setInt(3, customer.getGender());
            preparedStatement.setString(4, customer.getIdCar());
            preparedStatement.setString(5, customer.getPhoneNumber());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customer.getType_id());
            preparedStatement.setInt(9, customer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void create(Customer customer) {
        try {
            Connection connection = dbConnect.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(ADD_CUSTOMER);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getDateOfBirth());
            preparedStatement.setInt(3, customer.getGender());
            preparedStatement.setString(4, customer.getIdCar());
            preparedStatement.setString(5, customer.getPhoneNumber());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customer.getType_id());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
              int id =resultSet.getInt("customer_id");
                String name1 = resultSet.getString("customer_name");
                String dateOfBirth = resultSet.getString("customer_date_of_birth");
                int gender = resultSet.getInt("customer_gender");
                String idCar = resultSet.getString("customer_id_car");
                String phoneNumber = resultSet.getString("customer_phone_number");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int type_id = resultSet.getInt("customer_type_id");
                Customer customer = new Customer(id, name1, dateOfBirth, gender, idCar, phoneNumber, email, address, type_id);
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }
}

