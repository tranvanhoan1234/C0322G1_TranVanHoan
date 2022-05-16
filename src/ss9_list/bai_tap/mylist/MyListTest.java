package ss9_list.bai_tap.mylist;

public class MyListTest {

    private static class Student {
        private int id;
        private String name;

        public Student() {

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

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "trần");
        Student b = new Student(2, "văn");
        Student c = new Student(3, "hoàn");
        Student d = new Student(4, "lớp");
        Student f = new Student(4, "co3222g1");

        MyList<Student> studentMyArrayList = new MyList<>();

        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(f);

        studentMyArrayList.add(a, 5);
        studentMyArrayList.add(b, 6);
        studentMyArrayList.add(c, 7);
        studentMyArrayList.add(d, 8);
        studentMyArrayList.add(f, 9);

        studentMyArrayList.remove(3);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getName());

        }

    }
}