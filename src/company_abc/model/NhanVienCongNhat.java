package company_abc.model;

import java.math.BigDecimal;

public class NhanVienCongNhat extends CompanyABC {
    private Integer soNgayCong;

    public NhanVienCongNhat() {

    }

    @Override
    public double tinhLuong() {
        return getSoNgayCong() * 120000;
    }

    public NhanVienCongNhat(String name, String dateOfBirth, String address, Integer soNgayCong) {
        super(name, dateOfBirth, address);
        this.soNgayCong = soNgayCong;
    }

    public Integer getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(Integer soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public String toString() {
        return super.toString() +
                "NhanVienCongNhat: " +
                "soNgayCong=" + soNgayCong +
                "\t tiền lương: " + new BigDecimal(tinhLuong());
    }

}
