package thi.model;

public abstract class SoTietKiem {
    private Integer maSoSo;
    private Integer maKhachHang;
    private String ngayMoSo;
    private String thoiGianBatDauGui;
    private Integer soTienGui;
    private Integer laiXuat;

    public SoTietKiem() {
    }

    public SoTietKiem(Integer maSoSo, Integer maKhachHang, String ngayMoSo, String thoiGianBatDauGui, Integer soTienGui, Integer laiXuat) {
        this.maSoSo = maSoSo;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianBatDauGui = thoiGianBatDauGui;
        this.soTienGui = soTienGui;
        this.laiXuat = laiXuat;
    }

    public Integer getMaSoSo() {
        return maSoSo;
    }

    public void setMaSoSo(Integer maSoSo) {
        this.maSoSo = maSoSo;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(String ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public String getThoiGianBatDauGui() {
        return thoiGianBatDauGui;
    }

    public void setThoiGianBatDauGui(String thoiGianBatDauGui) {
        this.thoiGianBatDauGui = thoiGianBatDauGui;
    }

    public Integer getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(Integer soTienGui) {
        this.soTienGui = soTienGui;
    }

    public Integer getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(Integer laiXuat) {
        this.laiXuat = laiXuat;
    }

    @Override
    public String toString() {
        return "SoTietKiem{" +
                "maSoSo=" + maSoSo +
                ", maKhachHang=" + maKhachHang +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDauGui='" + thoiGianBatDauGui + '\'' +
                ", soTienGui=" + soTienGui +
                ", laiXuat=" + laiXuat +
                '}';
    }
    public abstract String readEndWriter();
}
