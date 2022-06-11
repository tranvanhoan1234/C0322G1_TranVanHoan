package company_abc.severis;

public interface IChamCong extends ISuDungArrayList {
    //    Suy nghĩ xem phải tạo ra một interface có phương thức là chấm công rồi cho nhân viên quản lý và nhân viên sản xuất implements lại phương thức này, hay là viết phương thức abstract ở class cha? Vì sao?
//    không cần vì dư thừa dữ liệu thawngfnhan viên quan lý k cân chấm công nếu dùng abs thì cả thằng quan lý phải triển khai lại
//   1 Suy nghĩ xem khi nào nên dùng interface=> khi các classs con cần thêm các thuộc tính chung triển khai
//   2 khi nào nên dùng abstract class,=> để tạo ra các thuộc tính chung k cụ thể
//   3  khi nào cần có phương thức abstract ở class cha?=>khi có pt chung để các thằng con ghi đè lại nội dung mà k cần phải triển khai lại các pt
    void chamCong();

}
