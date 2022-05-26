package employee_manager.severis;

import employee_manager.model.Person;
import employee_manager.model.Student;
import employee_manager.model.Teacher;

import java.util.Scanner;

import static employee_manager.controller.Function.persons;
import static employee_manager.controller.Function.scanner;

public class TeacherSeriver implements ISeriverTeacher {
    static Scanner scanner = new Scanner(System.in);

    static {persons[0] = new Teacher(1, "thuận1", 15, "đẹp trai", 1111);
        persons[1] = new Teacher(2, "thuận2", 15, "đẹp trai", 1111);
        persons[2] = new Teacher(3, "thuận3", 15, "đẹp trai", 1111);
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
        System.out.println("thêm saliary : ");
        Integer salary = Integer.valueOf(scanner.nextLine());
        persons[5] = new Teacher(id, name, age, gender, salary);
    }

    @Override
    public void display() {
        for (Person s : persons) {
            if (s instanceof Teacher)
                System.out.println(s);
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
    public void delete() {
        boolean flag = true;
        System.out.println("nhập tên teach bạn muốn xóa : ");
        String input = scanner.nextLine();
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Teacher && input.equals(persons[i].getName())) {
                for (int j = i + 1; j < persons.length - i; j++) {
                    persons[i] = persons[j];
                    System.out.println("đã xóa thành công : ");
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("không tìm thấy phần name : ");
        }

    }
}
