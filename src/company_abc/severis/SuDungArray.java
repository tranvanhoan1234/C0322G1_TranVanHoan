package company_abc.severis;

import company_abc.model.CompanyABC;
import company_abc.model.NhanVienCongNhat;
import company_abc.model.NhanVienSanXuat;
import company_abc.model.StaffOfficials;

public class SuDungArray implements ISuDungArrayList {
    public static CompanyABC[] array = new CompanyABC[1000];

    //    Hard code dữ liệu đầu vào STATIC
    static {
        array[0] = new NhanVienCongNhat("hoan", "13/2/1996", "hà nội", 100);
        array[1] = new NhanVienSanXuat("thuận", "13/2/1991", "hoa minh", 10);
        array[2] = new StaffOfficials("phuc", "13/2/2000", "hà nội", 1000000, 5);
    }
//    Đa hình lúc runtime thể hiện ở đâu?
//    Suy nghĩ xem từ khóa instanceof làm chức năng gì?
    // ĐỂ SO SÁNH nếu đúng kiểu giữ liệu mới in ra
//Suy nghĩ xem nếu có 1001 nhân viên trong công ty thì chuyện gì xảy ra?
//xuấthiện lỗi arrayindexofboutexception vượt độ dài mảng


    @Override
    public void displayArrayList() {
        for (CompanyABC companyABCList : array) {
            if (companyABCList != null) {
                System.out.println(companyABCList);
            }
        }
    }
}