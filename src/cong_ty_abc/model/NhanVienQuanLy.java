package cong_ty_abc.model;

public class NhanVienQuanLy extends CongTyABC {

    private Integer luongCoBan;
    private Integer heSoLuong;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(Integer id, Integer maNhanVien, String hoTen, String ngaySinh, String diaChi, Integer luongCoBan, Integer heSoLuong) {
        super(id, maNhanVien, hoTen, ngaySinh, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public Integer getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Integer luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Integer getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Integer heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String readEndWriterCongTy() {
        return "1,"+","+getId()+","+getMaNhanVien()+","+getHoTen()+","+getNgaySinh()+","+getDiaChi()+","+getLuongCoBan()+","+getHeSoLuong();

    }
}
