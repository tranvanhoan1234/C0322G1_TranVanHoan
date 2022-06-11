package thi.uitl.read_end_writer;

import thi.model.SoDaiHan;
import thi.model.SoVoThoiHan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadEndWriter {
    private final static String PATH_DAIHAN = "src/thi/uitl/data/longterm.csv";
    private final static String PATH_NGANHAN = "src/thi/uitl/data/shortTerm.csv";
    public static void writeDaiHan(List<SoDaiHan> list) {
        File file = new File(PATH_DAIHAN);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SoDaiHan soDaiHan : list) {
                bufferedWriter.write(soDaiHan.readEndWriter());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void write(List<SoVoThoiHan> list) {
        File file = new File(PATH_NGANHAN);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SoVoThoiHan soNganHan : list) {
                bufferedWriter.write(soNganHan.readEndWriter());
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

    public static List<SoDaiHan> readFileDaiHan() {
        List<String> stringList = readFileCsvToListStrinng(PATH_DAIHAN);
        List<SoDaiHan> soDaiHans = new ArrayList<>();
        String[] array = null;
        SoDaiHan soDaiHan = null;
        for (String str : stringList) {
            array = str.split(",");
            soDaiHan = new SoDaiHan(Integer.parseInt(array[0]), Integer.parseInt(array[1]), array[2], array[3], Integer.parseInt(array[4]), Integer.parseInt(array[5]),array[6]);
            soDaiHans.add(soDaiHan);
        }
        return soDaiHans;
    }
    public static List<SoVoThoiHan> readFileVoThoiHan() {
        List<String> stringList = readFileCsvToListStrinng(PATH_NGANHAN);
        List<SoVoThoiHan> nhanVienSanXuatList = new ArrayList<>();
        String[] array = null;
        SoVoThoiHan nhanVienSanXuat = null;
        for (String str : stringList) {
            array = str.split(",");
            nhanVienSanXuat = new SoVoThoiHan(Integer.parseInt(array[0]), Integer.parseInt(array[1]), array[2], array[3], Integer.parseInt(array[4]), Integer.parseInt(array[5]),(array[6]));
            nhanVienSanXuatList.add(nhanVienSanXuat);
        }
        return nhanVienSanXuatList;
    }
}
