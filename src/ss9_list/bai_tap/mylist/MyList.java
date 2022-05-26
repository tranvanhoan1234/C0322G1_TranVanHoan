package ss9_list.bai_tap.mylist;

import java.util.Arrays;

public class MyList<dataTybe> {

    public int size = 0;
    //sức chứa arraylist
    public static final int DEFAULT_CAPACITY = 10;
    // mảng chứa các phần tử
    public dataTybe[] list;


    /**
     * Khởi tạo mảng ban đầu với chiều dài mặc định
     */
//    public MyList() {
//        this.list = (dataType[]) new Object[DEFAULT_CAPACITY];
//    }

    //contructor không tham số sức chứa mặc định là 10;
    public MyList() {
       list =(dataTybe[]) new Object[DEFAULT_CAPACITY];
    }

    //contructor có tham số
    public MyList(int size) {
        if (size >= 0) {
          list =(dataTybe[]) new Object[size];
        } else {
            throw new IllegalArgumentException("capacity:  " + size);
        }
        //pt trả về số lượng pt;
    }

    public int size() {
        return this.size;
    }

    //pt clear arraylist,
    public void clean() {
        size = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = null;

        }
    }
    // pt add 1 phần tư vào arraylist

    public boolean add(dataTybe element) {
        if (list.length == size) {
            this.ensureCapacity(10);
        }
        list[size] = element;
        size++;
        return true;
    }

    public void add(dataTybe element, int index) {
        if (index > list.length) {
            throw new IllegalArgumentException("INDEX" + index);
        } else if (list.length == size) {
            ensureCapacity(5);
        }
        if (list[index] == null) {
            list[index] = element;
        } else {
            for (int i = size + 1; i >= index; i--) {
                list[i] = list[size - 1];

            }
            list[index] = element;
            size++;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            list[size -1]=null;
            size--;
        }
    }

    public dataTybe get(int index) {
        if (index >= 0 && index < size) {
            return (list) [index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 10) {
            int newSize = this.list.length + minCapacity;
            list = Arrays.copyOf(list, newSize);
        } else {
            throw new IllegalArgumentException("mincapecity: " + list);
        }
    }
}
