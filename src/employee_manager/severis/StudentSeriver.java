package employee_manager.severis;

import employee_manager.model.Person;
import employee_manager.model.Student;

import java.util.Scanner;

import static employee_manager.controller.Function.count;
import static employee_manager.controller.Function.persons;

public class StudentSeriver implements ISeriverStudent {
    private static Scanner scanner = new Scanner(System.in);

    static {
        persons[0] = new Student(1, "thuận1", 10, "bê đê", 3);
        persons[1] = new Student(2, "thuận2", 11, "bê đê", 3);
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
        System.out.println("nhập tên muốn xóa : ");
        String input = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student && input.equals(persons[i].getName())) {
                flag = false;
            }
            for (int j = 0; j < (persons.length - 1); j++) {
                persons[i] = persons[j];
            }
            count--;
            System.out.println("xóa thành công : " + input);
        }
    }

    @Override
    public void search() {
        System.out.println("nhập name id bạn muốn tìm");
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

