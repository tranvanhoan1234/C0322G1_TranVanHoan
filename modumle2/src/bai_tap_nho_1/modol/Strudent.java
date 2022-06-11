package bai_tap_nho_1.modol;

import bai_tap_nho_1.service.StudentImpl;

import java.util.Comparator;

public class Strudent extends TruongHoc {
    private Integer maSinhVien;
    private Integer diemTrungBinh;

    public Strudent() {
    }

    public Strudent(Integer id, String ten, String ngaySinh, String gioiTinh, String diaChi, Integer maSinhVien, Integer diemTrungBinh) {
        super(id, ten, ngaySinh, gioiTinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }

    public Integer getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(Integer maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public Integer getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Integer diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String readEndWriterTruongHoc() {
   return getId()+","+getTen()+","+getNgaySinh()+","+getGioiTinh()+","+getDiaChi()+","+getMaSinhVien()+","+getDiemTrungBinh();

    }
}
