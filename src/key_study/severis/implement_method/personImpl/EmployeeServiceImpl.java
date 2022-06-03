package key_study.severis.implement_method.personImpl;

import key_study.model.person.Employee;
import key_study.model.person.Person;
import key_study.uitl.check_exception.CheckException;
import key_study.uitl.reader_writer.ReaderWriter;
import key_study.uitl.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    //    private static List<Employee> personArrayList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
//
//    static {
//        Employee employee1 = new Employee("hoan,", "12/1/1996", "nam", 123123, 23423423L, "@hoan123123", 1, "vip", "sieu cap pro", "10000");
//        personArrayList.add(employee1);
//    }


//    public Employee(String fullName, String dateOfBirth, String gender, Integer citizenId,
//    Long numberPhone, String gmail, Integer employeeCode, String level, String position, String salary) {


    public void editEmployee() {
        List<Employee> personArrayList = ReaderWriter.readFileEmployee();
        System.out.println("mời nhập id bạn muốn edit: ");
        Integer employeeCode1 = CheckException.checkExForParseInteger();
        boolean flag = true;
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getEmployeeCode().equals(employeeCode1)) {
                System.out.println("sửa họ tên nhân viên : ");
                String fullName = scanner.nextLine();
                System.out.println("sửa ngày sinh nhân viên : ");
                String dateOfBirth = Regex.checkExForParseAge(scanner.nextLine());
                System.out.println("sửa giới tính nhân viên : ");
                String gender = scanner.nextLine();
                System.out.println("sửa số cmnd nhân viên : ");
                Integer citizenId = CheckException.checkExForParseInteger();
                System.out.println("sửa số điện thoại nhân viên : ");
                Long numberPhone = CheckException.checkExForParseLong();
                System.out.println("sửa trình mã nhân viên :  ");
                Integer employeeCode = CheckException.checkExForParseInteger();
                System.out.println("sửa gmail nhân viên : ");
                String gmail = scanner.nextLine();
                String position = null;
                while (position == null) {
                    System.out.println("thêm trình độ nhân viên:\n" +
                            "1.Trung cấp,\n" +
                            "2.Cao đẳng,\n" +
                            "3.Đại học \n" +
                            "4.sau đại học");
                    Integer choice = Integer.valueOf(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            position = "trung cấp";
                            break;
                        case 2:
                            position = "cao đẳng";
                            break;
                        case 3:
                            position = "đại học";
                            break;
                        case 4:
                            position = "sau đại học";
                            break;
                        default:
                            System.out.println("nhập sai xin nhập đúng yêu cầu");
                    }
                }
                String level = null;
                while (level == null) {
                    System.out.println("sửa vị trí nhân viên:" +
                            " 1.Lễ tân,\n" +
                            " 2.phục vụ, \n" +
                            " 3.chuyên viên,\n" +
                            " 4.giám sát, \n" +
                            " 5.quản lý,\n" +
                            " 6.giám đốc");

                    Integer choice = Integer.valueOf(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            level = "lễ tân";
                            break;
                        case 2:
                            level = "phục vụ";
                            break;
                        case 3:
                            level = "chuyên viên";
                            break;
                        case 4:
                            level = "giám sát ";
                            break;
                        case 5:
                            level = "quản lý";
                            break;
                        case 6:
                            level = "giám đô";
                            break;
                        default:
                            System.out.println("nhập sai xin nhập đúng yêu cầu");
                    }
                }

                System.out.println("thêm lương nhân viên: ");
                String salary = scanner.nextLine();
                Employee employee = new Employee(fullName, dateOfBirth, gender, citizenId, numberPhone, gmail, employeeCode, level, position, salary);
                personArrayList.set(i, employee);
                ReaderWriter.writeEmployee(personArrayList);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("không tìm thấy xin nhập lại : ");
        }
    }

    @Override
    public void display() {
        List<Employee> personArrayList = ReaderWriter.readFileEmployee();
        for (Person employee : personArrayList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        List<Employee> personArrayList = ReaderWriter.readFileEmployee();

        System.out.println("thêm họ tên nhân viên : ");
        String fullName = scanner.nextLine();
        System.out.println("thêm ngày sinh nhân viên : ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("thêm giới tính nhân viên : ");
        String gender = scanner.nextLine();
        System.out.println("thêm số cmnd nhân viên : ");
        Integer citizenId = CheckException.checkExForParseInteger();
        System.out.println("thêm số điện thoại nhân viên : ");
        Long numberPhone = CheckException.checkExForParseLong();
        System.out.println("thêm mã nhân viên :  ");
        Integer employeeCode =CheckException.checkExForParseInteger();
        System.out.println("thêm gmail nhân viên : ");
        String gmail = scanner.nextLine();
        String position = null;
        while (position == null) {
            System.out.println("thêm trình độ nhân viên:\n" +
                    " 1.Trung cấp,\n" +
                    " 2. Cao đẳng,\n" +
                    " 3.Đại học \n" +
                    "    4.sau đại học");
            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    position = "trung cấp";
                    break;
                case 2:
                    position = "cao đẳng";
                    break;
                case 3:
                    position = "đại học";
                    break;
                case 4:
                    position = "sau đại học";
                    break;
                default:
                    System.out.println("nhập sai xin nhập đúng yêu cầu");
            }
        }
        String level = null;
        while (level == null) {
            System.out.println("thêm vị trí nhân viên:\n" +
                    " 1.Lễ tân,\n" +
                    " 2.phục vụ, \n" +
                    " 3.chuyên viên,\n" +
                    " 4.giám sát, \n" +
                    " 5.quản lý,\n" +
                    " 6.giám đốc");

            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    level = "lễ tân";
                    break;
                case 2:
                    level = "phục vụ";
                    break;
                case 3:
                    level = "chuyên viên";
                    break;
                case 4:
                    level = "giám sát ";
                    break;
                case 5:
                    level = "quản lý";
                    break;
                case 6:
                    level = "giám đô";
                    break;
                default:
                    System.out.println("nhập sai xin nhập đúng yêu cầu");
            }
        }
        System.out.println("thêm lương nhân viên: ");
        String salary = scanner.nextLine();
        Employee employee = new Employee(fullName, dateOfBirth, gender, citizenId, numberPhone, gmail, employeeCode, level, position, salary);
        personArrayList.add(employee);
        ReaderWriter.writeEmployee(personArrayList);
    }
}
