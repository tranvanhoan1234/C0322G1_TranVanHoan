package ss9_list.bai_tap.mylist;
    public class MyListTest {
        private int id;
        private String name;

        public MyListTest() {

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

        public MyListTest(int id, String name) {
            this.id = id;
            this.name = name;
        }

    public static void main(String[] args) {
        MyListTest a = new MyListTest(1, "trần");
        MyListTest b = new MyListTest(2, "văn");
        MyListTest c = new MyListTest(3, "hoàn");
        MyListTest d = new MyListTest(4, "lớp");
        MyListTest f = new MyListTest(4, "co3222g1");

        MyList<MyListTest> studentMyArrayList = new MyList<>();

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
        studentMyArrayList.remove(2);
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            MyListTest student = new MyListTest();
            System.out.println(student.getId());

        }
    }
}