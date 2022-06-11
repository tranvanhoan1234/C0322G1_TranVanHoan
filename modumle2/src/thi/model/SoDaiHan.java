package thi.model;

public class SoDaiHan extends SoTietKiem{
    private String kyHan;


    public SoDaiHan() {
    }

    public SoDaiHan(Integer maSoSo, Integer maKhachHang, String ngayMoSo, String thoiGianBatDauGui, Integer soTienGui, Integer laiXuat, String kyHan) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGui, laiXuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "SoDaiHan{" +super.toString()+
                "kyHan='" + kyHan + '\'' +
                '}';
    }

    //public SoDaiHan(Integer maSoSo, Integer maKhachHang, String ngayMoSo, String thoiGianBatDauGui, Integer soTienGui, Integer laiXuat, String kyHan, String uuDai) {
    @Override
        public String readEndWriter() {
            return getMaSoSo()+","+getMaKhachHang()+","+getNgayMoSo()+","+getThoiGianBatDauGui()+","+getSoTienGui()+","+getLaiXuat()+","+getKyHan();
    }
}
