package ss9_list.bai_tap.mylinkedlist;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }


    }//phần tử đầu tiên của danh sách liên kết

    private Node head;
    //số lượng phần tử trong danh sách
    private int numNodes = 0;

    public MyLinkedList() {

    }

    public void addFirst(E element) {
        // KHAI BÁO 1 BIẾN LÀ TEMP tham chiếu  tới giá trị của head;
        Node temp = head;
        //biến head sẽ nhận giá trị là 1 node mới
        head = new Node(element);
        // head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }
    public void addlist(E element) {
        // khai báo biến temp trỏ đến head
        Node temp = head;
        //cho con trỏ chạy đến pt cuối cùng của ds
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void
    add(int index, E element) {
        // khai báo biến temp trỏ đến head
        Node temp = head;
        //khai báo 1 node là holder
        Node holder;
        //cho con trỏ chạy đến vị trí index -1;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho hoder tham chiếu đến vị trí index.
        holder = temp.next;
        //node tại vị trí index -1 sẽ trỏ tới node mới;
        temp.next = new Node(element);
        //node mới sẽ trỏ đến hoder
        temp.next.next = holder;
        //tăng số lượng pt trong ds lên 1
        numNodes++;
    }

    public Object get(int index) {
        //khai báo biến temp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;

    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("eror index: " + index);

        }
        //khai báo biến temp trỏ đến head
        Node temp = head;
        Object data;
        //nếu index =0 thì sẽ trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //remove đối tuongj nếu elemete head
        if (head.data.equals(element)) {
            remove(0);
        } else {
            Node temp = head;
            while (temp.next != null) {
                //nếu như tồn tại 1 phần tử có dâta truyền vào thì node do se bi remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {

        if (numNodes == 0) {
            throw new NullPointerException("linkidlist này null");
        }
        //khai báo 1 temp list trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();

        //KHAI báo 1 temp trỏ đến head
        Node temp = head;
        //add temp vào ds trả về để nó làm head
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addFirst((E) temp.data);
            temp = temp.next;

        }
        return returnLinkedList;
    }

}
