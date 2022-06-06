package cong_ty_abc.severis;

import key_study.model.person.Customer;
import key_study.uitl.reader_writer.ReaderWriter;

import java.util.List;
import java.util.Scanner;

public interface Severis  {

    void display();
    void add();
    void delete();
    void search();
//    public int check() {
//        List<Customer> list = ReaderWriter.readFileCustumer();
//        int id = 1; // gán id = 1
//        if (list.isEmpty()) { //kiểm tra nếu rỗng return 1;
//            return id;
//        } else {
//            for (Customer item : list) {  //duyệt mảng
//                if (id < item.getCustomerCode()) { //nếu id < id hiện tại
//                    id = item.getCustomerCode(); // gán lại id
//                }
//            }
//            return (id + 1); //trả về id + thêm 1
//
//        }
//    }

}
