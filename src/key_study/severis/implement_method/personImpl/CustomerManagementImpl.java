package key_study.severis.implement_method.personImpl;

import key_study.severis.person.Customer;
import key_study.uitl.reader_writer.ReaderWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagementImpl implements ICustomerManagement {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);



    @Override
    public void displayCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    //    String fullName, String dateOfBirth, String gender, Integer citizenId, Long numberPhone
//    , String gmail, Integer customerCode, String typeOfGuest, String address
    @Override
    public void addCustomer() {

        System.out.println("thêm ten khách hàng : ");
        String fullName = scanner.nextLine();
        System.out.println("thêm ngày sinh khách hàng: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("thêm giới tính khách hàng : ");
        String gender = scanner.nextLine();
        System.out.println("thêm số cccd khách hàng: ");
        Integer citizenId = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm numberphone khách hàng : ");
        Long numberPhone = Long.valueOf(scanner.nextLine());
        System.out.println("thêm gmail khách hàng : ");
        String gmail = scanner.nextLine();
        System.out.println("thêm mã khách hàng : ");
        Integer customerCode = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm loại khách hàng : ");
        String typeOfGuest = scanner.nextLine();
        System.out.println("thêm địa chỉ khách hàng : ");
        String address = scanner.nextLine();
        Customer customer = new Customer(fullName, dateOfBirth, gender, citizenId, numberPhone, gmail, customerCode, typeOfGuest, address);
        customerList.add(customer);
        ReaderWriter.writeCustumer(customerList);
    }

    @Override
    public void editCustomer() {
        System.out.println("nhập id muốn xóa : ");
        Integer customerCode1 = Integer.valueOf(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerCode().equals(customerCode1)) {
                System.out.println("thêm ten khách hàng : ");
                String fullName = scanner.nextLine();
                System.out.println("thêm ngày sinh khách hàng: ");
                String dateOfBirth = scanner.nextLine();
                System.out.println("thêm giới tính khách hàng : ");
                String gender = scanner.nextLine();
                System.out.println("thêm số cccd khách hàng: ");
                Integer citizenId = Integer.valueOf(scanner.nextLine());
                System.out.println("thêm numberphone khách hàng : ");
                Long numberPhone = Long.valueOf(scanner.nextLine());
                System.out.println("thêm gmail khách hàng : ");
                String gmail = scanner.nextLine();
                System.out.println("thêm mã khách hàng : ");
                Integer customerCode = Integer.valueOf(scanner.nextLine());
                System.out.println("thêm loại khách hàng : ");
                String typeOfGuest = scanner.nextLine();
                System.out.println("thêm địa chỉ khách hàng : ");
                String address = scanner.nextLine();
                Customer customer = new Customer(fullName, dateOfBirth, gender, citizenId, numberPhone, gmail, customerCode, typeOfGuest, address);
                customerList.set(i, customer);
                ReaderWriter.writeCustumer(customerList);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("không tìm thấy : ");
        }
    }
}