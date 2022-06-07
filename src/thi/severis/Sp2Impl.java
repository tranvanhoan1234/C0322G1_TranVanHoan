package thi.severis;

import key_study.uitl.check_exception.IvalidHoseEpception;
import key_study.uitl.regex.Regex;

public class Sp2Impl implements Severis{
    @Override
    public void display() {

    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void sort() {

    }

    @Override
    public void search() {
    }
    //su dung excepti on tự tạo

//    String serviceCode = scanner.nextLine();
//        while (!Regex.hoseRegex(serviceCode)) {
//        try {
//            if (!serviceCode.matches("SVVL-[0-9]{4}")) {
//                throw new IvalidHoseEpception("nhập không đúng xin nhập lại định dạng SVHO-YYYY: ");
//            }
//        } catch (IvalidHoseEpception e) {
//            System.err.println(e.getMessage());
//        }
//        serviceCode = scanner.nextLine();
//    }
}
