package bai_tap_nho_1.modol;

public class Teach extends TruongHoc {
    private String lopDay;
    private Integer luongMotGio;
    private Integer soGioDayTrongThang;

    public Teach() {
    }

    public Teach(Integer id, String ten, String ngaySinh, String gioiTinh, String diaChi, String lopDay, Integer luongMotGio, Integer soGioDayTrongThang) {
        super(id, ten, ngaySinh, gioiTinh, diaChi);
        this.lopDay = lopDay;
        this.luongMotGio = luongMotGio;
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    public String getLopDay() {
        return lopDay;
    }

    public void setLopDay(String lopDay) {
        this.lopDay = lopDay;
    }

    public Integer getLuongMotGio() {
        return luongMotGio;
    }

    public void setLuongMotGio(Integer luongMotGio) {
        this.luongMotGio = luongMotGio;
    }

    public Integer getSoGioDayTrongThang() {
        return soGioDayTrongThang;
    }

    public void setSoGioDayTrongThang(Integer soGioDayTrongThang) {
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    @Override
    public String toString() {
        return "Teach" + super.toString() +
                "lopDay='" + lopDay + '\'' +
                ", luongMotGio=" + luongMotGio +
                ", soGioDayTrongThang=" + soGioDayTrongThang;
    }

    @Override
    public String readEndWriterTruongHoc() {
        return getId() + "," + getTen() +","+getNgaySinh()+ "," + getGioiTinh() + "," + getDiaChi() + "," + getLopDay() + "," + getLuongMotGio() + "," + getSoGioDayTrongThang();
    }
}
