package company_abc.severis;

import company_abc.model.CompanyABC;
import company_abc.model.NhanVienCongNhat;
import company_abc.model.NhanVienSanXuat;
import company_abc.model.StaffOfficials;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
    static Map<Integer, CompanyABC> companyABCMap = new TreeMap<>();


    static {

        NhanVienCongNhat companyABCList1 = new NhanVienCongNhat("hoàn", "2/3/1999", "đn", 5);
        NhanVienSanXuat companyABCList2 = new NhanVienSanXuat("thuan", "2/3/1999", "đn", 10);
        StaffOfficials companyABCList3 = new StaffOfficials("phuc", "2/3/1999", "đn", 10, 5);
        StaffOfficials companyABCList4 = new StaffOfficials("phuc", "2/3/1999", "đn", 10, 5);
        companyABCMap.put(1, companyABCList1);
        companyABCMap.put(2, companyABCList2);
        companyABCMap.put(3, companyABCList3);
        companyABCMap.put(4, companyABCList4);

    }

    //    Làm sao để kiểm tra mã nhân viên đã tồn tại hay chưa?
// dung containkey kiểm tra tồn tại chưa nếu tồn tại trả về true k false
    public static void displayMap() {

        Set<Integer> a = companyABCMap.keySet();
        for (Integer b : a) {
            System.out.println("Key: " + b);
            System.out.println("Value: " + companyABCMap.get(b));
            System.out.println("mã này đã tồn tại =>" + companyABCMap.containsKey(4));
        }
//    }public boolean check(int id){
//        if(companyABCMap.containsKey(id)){
//            System.out.println("id đã tồn tại");
//            return true;
//        }
//        else {
//            System.out.println("id k tồn tại");
//            return false;
//        }
    }
}
