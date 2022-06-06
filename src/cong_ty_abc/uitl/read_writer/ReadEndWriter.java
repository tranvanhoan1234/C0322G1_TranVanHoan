package cong_ty_abc.uitl.read_writer;

import cong_ty_abc.model.NhanVienQuanLy;
import cong_ty_abc.model.NhanVienSanXuat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadEndWriter {
    private final static String PATH_QUANLY = "src/cong_ty_abc/uitl/data/quanly.csv";
    private final static String PATH_SANXUAT = "src/cong_ty_abc/uitl/data/sanxuat.csv";

    public static void writeQuanLy(List<NhanVienQuanLy> list) {
        File file = new File(PATH_QUANLY);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (NhanVienQuanLy nhanVienQuanLy : list) {
                bufferedWriter.write(nhanVienQuanLy.readEndWriterCongTy());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeSanXuat(List<NhanVienSanXuat> list) {
        File file = new File(PATH_SANXUAT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (NhanVienSanXuat nhanVienSanXuat : list) {
                bufferedWriter.write(nhanVienSanXuat.readEndWriterCongTy());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFileCsvToListStrinng(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<NhanVienQuanLy> readFileQuanLy() {
        List<String> stringList = readFileCsvToListStrinng(PATH_QUANLY);
        List<NhanVienQuanLy> nhanVienQuanLIES = new ArrayList<>();
        String[] array = null;
        NhanVienQuanLy nhanVienQuanLy = null;
        for (String str : stringList) {
            array = str.split(",");
            nhanVienQuanLy = new NhanVienQuanLy(Integer.parseInt(array[0]), Integer.parseInt(array[1]), array[2], array[3], array[4], Integer.parseInt(array[5]));
            nhanVienQuanLIES.add(nhanVienQuanLy);
        }
        return nhanVienQuanLIES;
    } public static List<NhanVienSanXuat> readFileSanXuat() {
        List<String> stringList = readFileCsvToListStrinng(PATH_SANXUAT);
        List<NhanVienSanXuat> nhanVienSanXuatList = new ArrayList<>();
        String[] array = null;
        NhanVienSanXuat nhanVienSanXuat = null;
        for (String str : stringList) {
            array = str.split(",");
            nhanVienSanXuat = new NhanVienSanXuat(Integer.parseInt(array[0]), Integer.parseInt(array[1]), array[2], array[3], array[4], Integer.parseInt(array[5]),Integer.parseInt(array[6]));
            nhanVienSanXuatList.add(nhanVienSanXuat);
        }
        return nhanVienSanXuatList;
    }
}
