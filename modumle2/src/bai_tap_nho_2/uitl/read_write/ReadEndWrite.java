package bai_tap_nho_2.uitl.read_write;

import bai_tap_nho_1.modol.Strudent;
import bai_tap_nho_2.model.Degree;
import bai_tap_nho_2.model.Experience;
import bai_tap_nho_2.model.Fresher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadEndWrite {
    private final static String PATH_EXPERIENCE = "src/bai_tap_nho_2/uitl/data/experience.csv";
    private final static String PATH_FRESHER = "src/bai_tap_nho_2/uitl/data/fresher.csv";
    private final static String PATH_DEGREE = "src/bai_tap_nho_2/uitl/data/degree.csv";

    public static void writeExperience(List<Experience> list) {
        File file = new File(PATH_EXPERIENCE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Experience experience : list) {
                bufferedWriter.write(experience.readWrite());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFresher(List<Fresher> list) {
        File file = new File(PATH_FRESHER);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Fresher fresher : list) {
                bufferedWriter.write(fresher.readWrite());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDegree(List<Degree> list) {
        File file = new File(PATH_FRESHER);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Degree degree : list) {
                bufferedWriter.write(degree.writer());
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

    public static List<Experience> readFileEx() {
        List<String> stringList = readFileCsvToListStrinng(PATH_EXPERIENCE);
        List<Experience> experiences = new ArrayList<>();
        String[] array = null;
        Experience experience = null;
        for (String str : stringList) {
            array = str.split(",");
            experience = new Experience(Integer.parseInt(array[0]),array[1],array[2],Integer.parseInt(array[3]),array[4],array[5],Integer.parseInt(array[6]),array[7],array[8]);
            experiences.add(experience);
        }
        return experiences;
    }

    public static List<Fresher> readFileFresher() {
        List<String> stringList = readFileCsvToListStrinng(PATH_FRESHER);
        List<Fresher> freshers = new ArrayList<>();
        String[] array = null;
        Fresher fresher = null;
        for (String str : stringList) {
            array = str.split(",");
            fresher = new Fresher(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]), array[4], array[5], Integer.parseInt(array[6]), array[7], array[8], array[9]);
            freshers.add(fresher);
        }
        return freshers;
    }

    public static List<Degree> readFileDegree() {
        List<String> stringList = readFileCsvToListStrinng(PATH_DEGREE);
        List<Degree> degrees = new ArrayList<>();
        String[] array = null;
        Degree degree = null;
        for (String str : stringList) {
            array = str.split(",");
            degree = new Degree(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]));
            degrees.add(degree);
        }
        return degrees;
    }
}
