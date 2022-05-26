package employee_manager.controller;

import employee_manager.model.Person;
import employee_manager.model.Student;
import employee_manager.model.Teacher;
import employee_manager.severis.StudentSeriver;
import employee_manager.severis.TeacherSeriver;

import java.util.Scanner;

public class Function {
    public static Scanner scanner = new Scanner(System.in);
    public static Person[] persons = new Person[10];
    public static int count = 2;

    static {
        persons[0] = new Student(1, "thuận1", 5, "bê đê", 3);
        persons[1] = new Teacher(3, "thuận3", 15, "bê đê", 2000);
    }

    public static void displaymanage() {

        do {
            System.out.println("-------manage-------\n"
                    + "1.student : \n"
                    + "2.teacher : \n"
                    + "3.exit");
            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayStudent();
                    break;
                case 2:
                    displayTeacher();
                    break;
                case 3:
                    System.exit(3);
                    break;
                default:
                    System.out.println("k có xin nhập lại : ");
            }
        } while (true);
    }

    public static void displayStudent() {
        StudentSeriver studentSeriver = new StudentSeriver();

        do {
            System.out.println("-----------lựa chọn---------- \n"
                    + "1.display \n"
                    + "2.add \n"
                    + "3.delete \n"
                    + "4.search \n"
                    + "5.để thoát chương trình \n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentSeriver.display();
                    break;
                case 2:
                    studentSeriver.add();
                    break;
                case 3:
                    studentSeriver.delete();
                    break;
                case 4:
                    studentSeriver.search();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("nhập k đúng xin nhập lại : ");
            }
        } while (true);
    }

    public static void displayTeacher() {
        TeacherSeriver teacherSeriver = new TeacherSeriver();

        do {
            System.out.println("-----------lựa chọn---------- \n"
                    + "1.display \n"
                    + "2.add \n"
                    + "3.delete \n"
                    + "4.search \n"
                    + "5.để thoát chương trình \n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    teacherSeriver.display();
                    break;
                case 2:
                    teacherSeriver.add();
                    break;
                case 3:
                    teacherSeriver.delete();
                    break;
                case 4:
                    teacherSeriver.search();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("nhập không đúng xin nhập lại: ");
            }
        } while (true);
    }
}


