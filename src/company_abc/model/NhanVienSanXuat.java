package company_abc.model;

import java.math.BigDecimal;

public class NhanVienSanXuat extends CompanyABC {
    private Integer soSanPham;

    public NhanVienSanXuat() {
    }

    @Override
    public double tinhLuong() {
        return getSoSanPham() * 50.0000;
    }

    public NhanVienSanXuat(String name, String dateOfBirth, String address, Integer soSanPham) {
        super(name, dateOfBirth, address);
        this.soSanPham = soSanPham;
    }

    public Integer getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(Integer soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return super.toString() +
                "NhanVienSanXuatSeveris : " +
                "soSanPham=" + soSanPham +
                "\t lương : " + new BigDecimal(tinhLuong());
    }

}
