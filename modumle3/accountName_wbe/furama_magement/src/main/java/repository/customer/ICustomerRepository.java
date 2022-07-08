package repository.customer;

import model.customer.Customer;

import java.util.List;

public interface ICustomerRepository {

    List<Customer> findAll();

    void remove(int idDelete);

    Customer findById(int idEdit);

    void editCustomer(Customer customer);

    void create(Customer customer);

    List<Customer> findByName(String name);
}
