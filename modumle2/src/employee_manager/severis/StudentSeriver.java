package employee_manager.severis;

import employee_manager.model.Person;
import employee_manager.model.Student;

import java.util.Scanner;

import static employee_manager.controller.Function.count;
import static employee_manager.controller.Function.persons;

public class StudentSeriver implements IServiceStudent {
    private static Scanner scanner = new Scanner(System.in);

    static {
        persons[0] = new Student(1, "thuan1", 10, "đẹp trai", 3);
        persons[1] = new Student(2, "thuận2", 11, "đẹp trai", 3);
        persons[2] = new Student(2, "thuận3", 11, "đẹp trai", 3);
        persons[3] = new Student(2, "thuận4", 11, "đẹp trai", 3);
        persons[4] = new Student(2, "thuận5", 11, "đẹp trai", 3);
    }

    @Override
    public void add() {
        System.out.println("thêm id: ");
        Integer id = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm name: ");
        String name = scanner.nextLine();
        System.out.println("thêm age : ");
        Integer age = Integer.valueOf(scanner.nextLine());
        System.out.println("them gender : ");
        String gender = scanner.nextLine();
        System.out.println("thêm point : ");
        Integer point = Integer.valueOf(scanner.nextLine());
        persons[count] = new Student(id, name, age, gender, point);
        count++;
    }

    @Override

    public void delete() {
        boolean flag = true;
        System.out.println("nhập tên muốn xóa : ");
        String input = scanner.nextLine();
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student && input.equals(persons[i].getName())) {
                for (int j = i + 1; j < (persons.length - i); j++) {
                    persons[i] = persons[j];
                    System.out.println("xóa thành công : " + input);
                    flag = false;
                    break;
                }
            }
        }
        if(flag) {
            System.out.println("không có trong ds : ");
        }
    }

    @Override
    public void search() {
        System.out.println("nhập name bạn muốn tìm");
        String input = scanner.nextLine();
        for (Person person : persons) {
            if (person != null && person.getName().contains(input)) {
                System.out.println("đây có phải người bạn muốn tìm không : " + person);
            }
        }
    }

    @Override
    public void display() {
        for (Person s : persons) {
            if (s instanceof Student) {
                System.out.println(s);
            }
        }
    }
}

