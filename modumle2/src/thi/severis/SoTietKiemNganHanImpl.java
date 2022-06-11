package thi.severis;

import thi.model.SoDaiHan;
import thi.model.SoVoThoiHan;
import thi.uitl.check_exception.IvaliHouseException;
import thi.uitl.read_end_writer.ReadEndWriter;

import java.util.List;
import java.util.Scanner;

public class SoTietKiemNganHanImpl implements Severis{
    private Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        List<SoVoThoiHan> soDaiHan= ReadEndWriter.readFileVoThoiHan();
        for (SoVoThoiHan soVoThoiHan:soDaiHan) {
            System.out.println(soVoThoiHan);
        }
    }

    @Override
    public void add() {
        List<SoVoThoiHan> soDaiHan= ReadEndWriter.readFileVoThoiHan();
        System.out.println("thêm");
        Integer maSoSo =  IvaliHouseException.checkExForParseInteger();
        System.out.println("thêm");
        Integer maKhachHang =  IvaliHouseException.checkExForParseInteger();
        System.out.println("thêm");
        String ngayMoSo = scanner.nextLine();
        System.out.println("thêm");
        String thoiGianBatDauGui = scanner.nextLine();
        System.out.println("thêm");
        Integer soTienGui =  IvaliHouseException.checkExForParseInteger();
        System.out.println("thêm");
        Integer laiXuat =  IvaliHouseException.checkExForParseInteger();
        System.out.println("thêm");
        String kyHan = null;
        while (kyHan == null) {
            System.out.println("thời hạn : \n" +
                    "1.6 tháng,\n" +
                    "3.3thang");
            Integer choice =  IvaliHouseException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    kyHan = "6.thang";
                    break;
                case 2:
                    kyHan = "3.thang";
                    break;
                case 3:

                default:
                    System.out.println("nhập sai xin nhập đúng yêu cầu");
            }
        }
        SoVoThoiHan soDaiHan1 =new SoVoThoiHan(maSoSo,maKhachHang,ngayMoSo,thoiGianBatDauGui,soTienGui,laiXuat,kyHan);
        soDaiHan.add(soDaiHan1);
        ReadEndWriter.write(soDaiHan);
    }

    @Override
    public void delete() {

    }
}
