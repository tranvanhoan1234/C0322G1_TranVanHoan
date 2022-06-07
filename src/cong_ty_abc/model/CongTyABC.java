package cong_ty_abc.model;

public abstract class CongTyABC {
    private Integer id;
    private Integer maNhanVien;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    public CongTyABC() {
    }

    public CongTyABC(Integer id, Integer maNhanVien, String hoTen, String ngaySinh, String diaChi) {
        this.id = id;
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
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

    @Override
    public String toString() {
        return "CongTyABC" +
                "id=" + id +
                ", maNhanVien=" + maNhanVien +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'';
    }

    public abstract String readEndWriterCongTy();


}
