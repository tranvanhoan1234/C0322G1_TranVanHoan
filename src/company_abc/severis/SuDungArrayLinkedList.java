package company_abc.severis;

import company_abc.model.CompanyABC;
import company_abc.model.NhanVienCongNhat;
import company_abc.model.NhanVienSanXuat;
import company_abc.model.StaffOfficials;
import company_abc.uitl.ComparatorName;
import company_abc.uitl.InterfaceComparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SuDungArrayLinkedList implements IChamCong {
    private static List<CompanyABC> companyABCList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    //    Giả sử công ty ABC thay đổi nhân sự liên tục (xóa và thêm nhân viên) thì nên sử dụng ArrayList hay LinkedList? Lý do?
// dùng linked vì nó chỉ cần thêm xóa các liên kết các nốt k cần phải duyệt hết qua phần tử
    // Ưu và nhược điểm của ArrayList và LinkedList.
    // array list xóa chèn chậm hơn,phù hợp bài toán ít thao tác truy xuất ngẫu nhiên ít thêm xóa đầu
    // truy xuất pt ngẫu nhiên chậm hơn
    static {
        NhanVienCongNhat companyABCList1 = new NhanVienCongNhat("hoàn", "2/3/1999", "đn", 5);
        NhanVienSanXuat companyABCList2 = new NhanVienSanXuat("thuan", "2/3/1999", "đn", 10);
        StaffOfficials companyABCList3 = new StaffOfficials("phuc", "2/3/1999", "đn", 10, 5);
        StaffOfficials companyABCList4 = new StaffOfficials("phuc", "2/3/1999", "đn", 10, 5);
        companyABCList.add(new NhanVienCongNhat("hoàn", "2/3/1999", "đn", 5));
        companyABCList.add(new NhanVienCongNhat("a", "2/3/1999", "đn", 5));
        companyABCList.add(new NhanVienCongNhat("b", "2/3/1999", "đn", 5));
        companyABCList.add(new NhanVienCongNhat("c", "2/3/1999", "đn", 5));
        companyABCList.add(companyABCList1);
        companyABCList.add(companyABCList2);
        companyABCList.add(companyABCList3);
        companyABCList.add(companyABCList4);
    }

    // khi dùng linkedlist không dùng pt get i fori vì rất là lâu.
// get có 1 for chạy ngầm duyệt toàn bộ phần tử mới lấy dc vị trí
// cần tìm độ phức tạp của thuật toán 0(n^2)
    @Override
    public void displayArrayList() {
        for (CompanyABC companyABC : companyABCList) {
            System.out.println(companyABC);
        }
    }
//    Muốn sử dụng comparator thì cần làm gì?
//    Muốn sử dụng comparable thì cần làm gì?
//    Sắp xếp nhân viên theo lương tăng dần
//    Suy nghĩ xem nên sử dụng Comparable hay Comparator? Vì sao?
//    Suy nghĩ xem nếu chỉ sử dụng Comparable thì có được không? Vì sao?
//    Suy nghĩ xem nếu chỉ sử dụng Comparator thì có được không? Vì sao?

    //khi sử dụng 1 tiêu chí thì dùng comparable
    // khi dùng với nhiều tiêu chí ví dụ như khách hàng muốn sắp xếp theo nhiều kiểu nhưu
    // theo tên theo lương hay id thì dung comparator

    public void sapXepTheoLuong() {
        Collections.sort(companyABCList, new InterfaceComparator());
        displayArrayList();
    }

    public void sapXepTheoTen() {
        Collections.sort(companyABCList, new ComparatorName());
        displayArrayList();
    }

    @Override
    public void chamCong() {

    }
}
