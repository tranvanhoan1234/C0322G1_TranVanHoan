package key_study.severis.implement_method.personImpl;

import key_study.model.person.Customer;
import key_study.uitl.check_exception.CheckException;
import key_study.uitl.reader_writer.ReaderWriter;
import key_study.uitl.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    //    String fullName, String dateOfBirth, String gender, Integer citizenId, Long numberPhone
//    , String gmail, Integer customerCode, String typeOfGuest, String address

    public void editCustomer() {
        List<Customer> customerList = ReaderWriter.readFileCustumer();
        System.out.println("nhập tên muốn edit : ");
        String customerCode1 = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getFullName().equals(customerCode1)) {
                System.out.println("sửa mã khách hàng : ");
                Integer customerCode = CheckException.checkExForParseInteger();

                System.out.println("sửa ngày sinh khách hàng: ");
                String dateOfBirth =Regex.checkExForParseAge(scanner.nextLine());

                System.out.println("sửa giới tính khách hàng : ");
                String gender = scanner.nextLine();

                System.out.println("sửa số cccd khách hàng: ");
                Integer citizenId = CheckException.checkExForParseInteger();

                System.out.println("sửa numberphone khách hàng : ");
                Long numberPhone = CheckException.checkExForParseLong();

                System.out.println("sửa gmail khách hàng : ");
                String gmail = scanner.nextLine();

                System.out.println("sửa ten khách hàng : ");
                String fullName = scanner.nextLine();

                String typeOfGuest = null;
                while (typeOfGuest == null) {
                    System.out.println("sửa loại khách :\n " +
                            "1.Diamond,\n" +
                            "2.Platinium,\n" +
                            "3.Gold, \n" +
                            "4.Silver,\n" +
                            "5.Member");

                    Integer choice = CheckException.checkExForParseInteger();
                    switch (choice) {
                        case 1:
                            typeOfGuest = "Diamond";
                            break;
                        case 2:
                            typeOfGuest = "Platinium";
                            break;
                        case 3:
                            typeOfGuest = "Gold";
                            break;
                        case 4:
                            typeOfGuest = "Silver";
                            break;
                        case 5:
                            typeOfGuest = "Member";
                            break;
                        default:
                            System.out.println("nhập sai xin nhập đúng yêu cầu");
                    }
                }
                System.out.println("sửa địa chỉ khách hàng : ");
                String address = scanner.nextLine();
                Customer customer = new Customer(customerCode, dateOfBirth, gender, citizenId, numberPhone, gmail, fullName, typeOfGuest, address);
                customerList.set(i, customer);
                ReaderWriter.writeCustumer(customerList);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("không tìm thấy : ");
        }
    }

    @Override
    public void display() {
        List<Customer> customerList = ReaderWriter.readFileCustumer();
        for (Customer customer : customerList) {
            System.out.println(customer.writerPerson());
        }
    }

    public int check() {
        List<Customer> list = ReaderWriter.readFileCustumer();
        int id = 1; // gán id = 1
        if (list.isEmpty()) { //kiểm tra nếu rỗng return 1;
            return id;
        } else {
            for (Customer item : list) {  //duyệt mảng
                if (id < item.getCustomerCode()) { //nếu id < id hiện tại
                    id = item.getCustomerCode(); // gán lại id
                }
            }
            return (id + 1); //trả về id + thêm 1

        }
    }

    @Override
    public void add() {
        List<Customer> customerList = ReaderWriter.readFileCustumer();

        Integer customerCode = check();
//        customerCode=check();
        System.out.println("thêm ngày sinh khách hàng: ");
        String dateOfBirth = Regex.checkExForParseAge(scanner.nextLine());
        System.out.println("thêm giới tính khách hàng : ");
        String gender = scanner.nextLine();
        System.out.println("thêm số cccd khách hàng: ");
        Integer citizenId = CheckException.checkExForParseInteger();
        System.out.println("thêm numberphone khách hàng : ");
        Long numberPhone = CheckException.checkExForParseLong();
        System.out.println("thêm gmail khách hàng : ");
        String gmail = scanner.nextLine();
        System.out.println("thêm ten khách hàng : ");
        String fullName = scanner.nextLine();
        String typeOfGuest = null;
        while (typeOfGuest == null) {
            System.out.println("thêm loại khách : \n" +
                    "1.Diamond,\n" +
                    "2.Platinium,\n" +
                    "3.Gold, \n" +
                    "4.Silver,\n" +
                    "5.Member");

            Integer choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    typeOfGuest = "Diamond";
                    break;
                case 2:
                    typeOfGuest = "Platinium";
                    break;
                case 3:
                    typeOfGuest = "Gold";
                    break;
                case 4:
                    typeOfGuest = "Silver";
                    break;
                case 5:
                    typeOfGuest = "Member";
                    break;
                default:
                    System.out.println("nhập sai xin nhập đúng yêu cầu");
            }
        }
        System.out.println("thêm địa chỉ khách hàng : ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerCode, dateOfBirth, gender, citizenId, numberPhone, gmail, fullName, typeOfGuest, address);
        customerList.add(customer);
        ReaderWriter.writeCustumer(customerList);
//        hoan,12/12/12,nam,1123132,123123,@ưqew,1,Diamond,dn
    }
}