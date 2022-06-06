package cong_ty_abc.model;

public abstract class CongTyABC {
    private Integer maNhanVien;
    private Integer luongCoBan;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    public CongTyABC() {
    }

    public CongTyABC(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.luongCoBan = luongCoBan;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Integer getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Integer luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public abstract String readEndWriterCongTy();

    @Override
    public String toString() {
        return "CongTyABC{" +
                "maNhanVien=" + maNhanVien +
                ", luongCoBan=" + luongCoBan +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

}
