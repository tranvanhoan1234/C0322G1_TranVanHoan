package employee_manager.severis;

import employee_manager.model.Person;
import employee_manager.model.Student;
import employee_manager.model.Teacher;

import java.util.Scanner;

import static employee_manager.controller.Function.count;
import static employee_manager.controller.Function.persons;

public class TeacherSeriver implements ISeriverTeacher {
    static Scanner scanner = new Scanner(System.in);

    static {
        persons[0] = new Teacher(2, "thuận2", 15, "bê đê", 1111);
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
                System.out.print(s);
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
        System.out.println("nhập tên teach bạn muốn xóa : ");
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
}
