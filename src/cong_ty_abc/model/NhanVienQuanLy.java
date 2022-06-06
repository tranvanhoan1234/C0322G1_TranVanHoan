package cong_ty_abc.model;

public class NhanVienQuanLy extends CongTyABC {

    private Integer heSoLuong;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi, Integer heSoLuong) {
        super(maNhanVien, luongCoBan, hoTen, ngaySinh, diaChi);
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String readEndWriterCongTy() {
        return getMaNhanVien()+","+getLuongCoBan()+","+getHoTen()+","+getNgaySinh()+","+getDiaChi()+","+getHeSoLuong();

    }

    public Integer getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Integer heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "NhanVienQuanLy{" +super.toString()+
                "heSoLuong=" + heSoLuong +
                '}';
    }
}
