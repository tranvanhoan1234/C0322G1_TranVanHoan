package service.customer.impl;

import model.customer.Customer;
import repository.customer.ICustomerRepository;
import repository.customer.impl.CustomerRepository;
import service.customer.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository=new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void remove(int idDelete) {
        iCustomerRepository.remove(idDelete);
    }

    @Override
    public Customer findById(int idEdit) {
        return iCustomerRepository.findById(idEdit);
    }

    @Override
    public void editCustomer(Customer customer) {
        iCustomerRepository.editCustomer(customer);
    }

    @Override
    public void create(Customer customer) {
        iCustomerRepository.create(customer);
    }

    @Override
    public List<Customer> findByName(String name) {
        return iCustomerRepository.findByName(name);
    }

}
