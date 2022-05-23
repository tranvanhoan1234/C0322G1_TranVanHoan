package company_abc.model;

public abstract class CompanyABC implements Comparable<CompanyABC> {
    private String name;
    private String dateOfBirth;
    private String address;

    public CompanyABC() {
    }

    //    Đa hình lúc compile thể hiện ở đâu? contruc to
    public CompanyABC(String name, String dateOfBirth, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //    Suy nghĩ xem class cha có cần phương thức abstract không? Vì sao?
// cần vì không có tính kế thừa không thể mở rộng k cần triển  khai lại
    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "CompanyABC : " +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ',';
    }

    @Override
    public int compareTo(CompanyABC o) {
        return (int) (tinhLuong() - o.tinhLuong());

    }
}
