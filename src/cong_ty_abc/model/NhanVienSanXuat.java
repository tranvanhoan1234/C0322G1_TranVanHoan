package cong_ty_abc.model;

public class NhanVienSanXuat extends CongTyABC {
    private Integer soSanPham;
    private Integer giaMoiSanPham;

    public NhanVienSanXuat() {
    }


    public NhanVienSanXuat(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi, Integer soSanPham, Integer giaMoiSanPham) {
        super(maNhanVien, luongCoBan, hoTen, ngaySinh, diaChi);
        this.soSanPham = soSanPham;
        this.giaMoiSanPham = giaMoiSanPham;
    }
    @Override
    public String readEndWriterCongTy() {
        return getMaNhanVien()+","+getLuongCoBan()+","+getHoTen()+","+getNgaySinh()+","+getDiaChi()+","+getSoSanPham()+","+getGiaMoiSanPham();

    }




    public Integer getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(Integer soSanPham) {
        this.soSanPham = soSanPham;
    }

    public Integer getGiaMoiSanPham() {
        return giaMoiSanPham;
    }

    public void setGiaMoiSanPham(Integer giaMoiSanPham) {
        this.giaMoiSanPham = giaMoiSanPham;
    }

    @Override
    public String toString() {
        return "NhanVienSanXuatImpl : " +super.toString()+
                "soSanPham=" + soSanPham +
                ", giaMoiSanPham=" + giaMoiSanPham;
    }
}
