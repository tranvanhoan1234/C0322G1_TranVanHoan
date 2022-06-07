package bai_tap_nho_1.modol;

public abstract class TruongHoc {
    private Integer id;
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public TruongHoc() {
    }

    public TruongHoc(Integer id, String ten,String ngaySinh, String gioiTinh, String diaChi) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh=ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    @Override
    public String toString() {
        return "TruongHoc{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public abstract String readEndWriterTruongHoc();
}
