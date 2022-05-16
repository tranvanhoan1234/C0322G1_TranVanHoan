package ss9_list.thuc_hanh.inplement_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("----------TESTING----------");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(4,9);
        myLinkedList.add(4,9);
        myLinkedList.printList();
    }
}
