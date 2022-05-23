package company_abc.severis;

import company_abc.model.CompanyABC;
import company_abc.model.NhanVienCongNhat;
import company_abc.model.NhanVienSanXuat;
import company_abc.model.StaffOfficials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SuDungArrayList implements IChamCong {
    //    Suy nghĩ xem vì sao ArrayList không cần khởi tạo 1000 phần tử trước?
//Nếu công ty có 1001 nhân viên thì có vấn đề gì không?
    public static List<CompanyABC> comparableList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    static {
        NhanVienCongNhat comparableList1 = new NhanVienCongNhat("name", "13/1/1996", "hà nội", 10);
        NhanVienSanXuat comparableList2 = new NhanVienSanXuat("name", "13/1/1996", "hà nội", 10);
        StaffOfficials comparableList3 = new StaffOfficials("name", "13/1/1996", "hà nội", 10, 123);
        comparableList.add(comparableList1);
        comparableList.add(comparableList2);
        comparableList.add(comparableList3);
    }

    @Override
    public void displayArrayList() {
        Collections.sort(comparableList);
        for (CompanyABC companyABC : comparableList) {
            System.out.println(companyABC);
        }

    }

    @Override
    public void chamCong() {

    }
}
