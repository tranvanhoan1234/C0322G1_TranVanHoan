package cong_ty_abc.uitl.read_writer;

import cong_ty_abc.model.CongTyABC;
import cong_ty_abc.model.NhanVienQuanLy;
import cong_ty_abc.model.NhanVienSanXuat;

import java.io.*;
import java.util.List;

public class ReadEndWriter {
    private final static String PATH_EMPLOYEE = "src/cong_ty_abc/uitl/data/employee.csv";
//    private final static String PATH_SANXUAT = "src/cong_ty_abc/uitl/data/sanxuat.csv";

    public static void writeQuanLy(List<CongTyABC> list) {
        File file = new File(PATH_EMPLOYEE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CongTyABC nhanVienQuanLy : list) {
                bufferedWriter.write(nhanVienQuanLy.readEndWriterCongTy());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeSanXuat(List<CongTyABC> list) {
        File file = new File(PATH_EMPLOYEE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CongTyABC nhanVienSanXuat : list) {
                bufferedWriter.write(nhanVienSanXuat.readEndWriterCongTy());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//
//    public static List<String> readFileCsvToListStrinng(String pathFile) {
//        List<String> stringList = new ArrayList<>();
//        File file = new File(pathFile);
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
//                stringList.add(line);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return stringList;
//    }

//    public static List<NhanVienQuanLy> readFileQuanLy() {
//        List<String> stringList = readFileCsvToListStrinng(PATH_QUANLY);
//        List<NhanVienQuanLy> nhanVienQuanLIES = new ArrayList<>();
//        String[] array = null;
//        NhanVienQuanLy nhanVienQuanLy = null;
//        for (String str : stringList) {
//            array = str.split(",");
//            nhanVienQuanLy = new NhanVienQuanLy(Integer.parseInt(array[0]), Integer.parseInt(array[1]), array[2], array[3], array[4], Integer.parseInt(array[5]));
//            nhanVienQuanLIES.add(nhanVienQuanLy);
//        }
//        return nhanVienQuanLIES;
//    }
//    public static List<NhanVienSanXuat> readFileSanXuat() {
//        List<String> stringList = readFileCsvToListStrinng(PATH_SANXUAT);
//        List<NhanVienSanXuat> nhanVienSanXuatList = new ArrayList<>();
//        String[] array = null;
//        NhanVienSanXuat nhanVienSanXuat = null;
//        for (String str : stringList) {
//            array = str.split(",");
//            nhanVienSanXuat = new NhanVienSanXuat(Integer.parseInt(array[0]), Integer.parseInt(array[1]), array[2], array[3], array[4], Integer.parseInt(array[5]),Integer.parseInt(array[6]));
//            nhanVienSanXuatList.add(nhanVienSanXuat);
//        }
//        return nhanVienSanXuatList;
//    }

    public static void readFileEmployee(List<CongTyABC>list) {

        try {
            FileReader fileReader = new FileReader("src/cong_ty_abc/uitl/data/employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null ) {
                String[] temp = line.split(",");
                if (temp[0].equals("1")) {
                    NhanVienQuanLy nhanVienQuanLy = new NhanVienQuanLy(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], Integer.parseInt(temp[5]),Integer.parseInt(temp[6]));
                    list.add(nhanVienQuanLy);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("src/cong_ty_abc/uitl/data/employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                if (temp[0].equals("2")){
               NhanVienSanXuat nhanVienSanXuat = new NhanVienSanXuat(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], Integer.parseInt(temp[5]),Integer.parseInt(temp[6]));
                list.add(nhanVienSanXuat);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
