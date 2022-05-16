package ss9_list.bai_tap.mylinkedlist;

import ss9_list.bai_tap.mylinkedlist.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            private Student() {

            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "my");
        Student student2 = new Student(2, "linkedlist");
        Student student3 = new Student(3, "à ");
        Student student4 = new Student(4, "  nha");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        myLinkedList.add(3, student4);
        myLinkedList.remove(2);
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());

        }

    }
}
