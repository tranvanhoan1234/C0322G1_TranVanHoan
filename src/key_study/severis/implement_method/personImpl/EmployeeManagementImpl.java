package key_study.severis.implement_method.personImpl;

import key_study.severis.person.Employee;
import key_study.severis.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementImpl implements IEmployeeManagement {
    private static List<Employee> personArrayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    static {
        Employee employee1 = new Employee("hoan,", "12/1/1996", "nam", 123123, 23423423L, "@hoan123123", 1, "vip", "sieu cap pro", "10000");
        personArrayList.add(employee1);
    }

    @Override
    public void displayEmployee() {
        for (Person employee : personArrayList) {
            System.out.println(employee);
        }
    }
//    public Employee(String fullName, String dateOfBirth, String gender, Integer citizenId,
//    Long numberPhone, String gmail, Integer employeeCode, String level, String position, String salary) {

    @Override
    public void addEmployee() {
//        Integer choice= Integer.valueOf(scanner.nextLine());
        System.out.println("thêm họ tên nhân viên : ");
        String fullName = scanner.nextLine();
        System.out.println("thêm ngày sinh nhân viên : ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("thêm giới tính nhân viên : ");
        String gender = scanner.nextLine();
        System.out.println("thêm số cmnd nhân viên : ");
        Integer citizenId = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm số điện thoại nhân viên : ");
        Long numberPhone = Long.valueOf(scanner.nextLine());
        System.out.println("thêm trình mã nhân viên :  ");
        Integer employeeCode = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm gmail nhân viên : ");
        String gmail = scanner.nextLine();
        System.out.println("thêm trình độ nhân viên: ");
        String position = scanner.nextLine();
        System.out.println("thêm  vị trí nhân viên: ");
        String level = scanner.nextLine();
        System.out.println("thêm lương nhân viên: ");
        String salary = scanner.nextLine();
        Employee employee = new Employee(fullName, dateOfBirth, gender, citizenId, numberPhone, gmail, employeeCode, level, position, salary);
        personArrayList.add(employee);
    }

    @Override
    public void editEmployee() {
        System.out.println("mời nhập id bạn muốn edit: ");
        Integer employeeCode1 = Integer.valueOf(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getEmployeeCode().equals(employeeCode1)) {

                System.out.println("thêm họ tên nhân viên : ");
                String fullName = scanner.nextLine();
                System.out.println("thêm ngày sinh nhân viên : ");
                String dateOfBirth = scanner.nextLine();
                System.out.println("thêm giới tính nhân viên : ");
                String gender = scanner.nextLine();
                System.out.println("thêm số cmnd nhân viên : ");
                Integer citizenId = Integer.valueOf(scanner.nextLine());
                System.out.println("thêm số điện thoại nhân viên : ");
                Long numberPhone = Long.valueOf(scanner.nextLine());
                System.out.println("thêm trình mã nhân viên :  ");
                Integer employeeCode = Integer.valueOf(scanner.nextLine());
                System.out.println("thêm gmail nhân viên : ");
                String gmail = scanner.nextLine();
                System.out.println("thêm trình độ nhân viên: ");
                String position = scanner.nextLine();
                System.out.println("thêm  vị trí nhân viên: ");
                String level = scanner.nextLine();
                System.out.println("thêm lương nhân viên: ");
                String salary = scanner.nextLine();
                Employee employee = new Employee(fullName, dateOfBirth, gender, citizenId, numberPhone, gmail, employeeCode, level, position, salary);
                personArrayList.set(i, employee);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("không tìm thấy xin nhập lại : ");
        }
    }
}
