package cong_ty_abc.model;

public class NhanVienSanXuat extends CongTyABC {
    private Integer soSanPham;
    private Integer giaMoiSanPham;

    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(Integer id, Integer maNhanVien, String hoTen, String ngaySinh, String diaChi, Integer soSanPham, Integer giaMoiSanPham) {
        super(id, maNhanVien, hoTen, ngaySinh, diaChi);
        this.soSanPham = soSanPham;
        this.giaMoiSanPham = giaMoiSanPham;
    }

    @Override
    public String readEndWriterCongTy() {
        return  "2,"+getId()+","+getMaNhanVien()+","+getHoTen()+","+getNgaySinh()+","+getDiaChi()+","+getSoSanPham()+","+getGiaMoiSanPham();

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
        return "NhanVienSanXuat : " +super.toString()+
                "soSanPham=" + soSanPham +
                ", giaMoiSanPham=" + giaMoiSanPham;
    }
}
