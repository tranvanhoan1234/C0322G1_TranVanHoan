package bai_tap_nho_1.uitl.read_end_write;

import bai_tap_nho_1.modol.Strudent;
import bai_tap_nho_1.modol.Teach;
import bai_tap_nho_1.modol.TruongHoc;
import cong_ty_abc.model.CongTyABC;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadEndWrite {
    private final static String PATH_STUDENT = "src/bai_tap_nho_1/uitl/data/student.csv";
    private final static String PATH_TEACH = "src/bai_tap_nho_1/uitl/data/teach.csv";

    public static void writeStudent(List<Strudent> list) {
        File file = new File(PATH_STUDENT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Strudent strudent : list) {
                bufferedWriter.write(strudent.readEndWriterTruongHoc());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeTeach(List<Teach> list) {
        File file = new File(PATH_TEACH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Teach teach : list) {
                bufferedWriter.write(teach.readEndWriterTruongHoc());
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

    public static List<Strudent> readFileStudent() {
        List<String> stringList = readFileCsvToListStrinng(PATH_STUDENT);
        List<Strudent> strudents = new ArrayList<>();
        String[] array = null;
        Strudent strudent = null;
        for (String str : stringList) {
            array = str.split(",");
            strudent = new Strudent(Integer.parseInt(array[0]),array[1], array[2], array[3], array[4], Integer.parseInt(array[5]),Integer.parseInt(array[6]));
            strudents.add(strudent);
        }
        return strudents;
    }
    public static List<Teach> readFileTech() {
        List<String> stringList = readFileCsvToListStrinng(PATH_TEACH);
        List<Teach> teaches = new ArrayList<>();
        String[] array = null;
        Teach teach = null;
        for (String str : stringList) {
            array = str.split(",");
            teach = new Teach(Integer.parseInt(array[0]),array[1], array[2], array[3], array[4], array[5],Integer.parseInt(array[6]),Integer.parseInt(array[7]));
            teaches.add(teach);
        }
        return teaches;
    }

}
