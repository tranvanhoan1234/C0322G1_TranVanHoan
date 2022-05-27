package ss16_io_test.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public final static String PATH_NAME = "src/ss16_io_test/bai_tap/doc_file_csv/file_contry.csv";

    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            String[] listLine;
            String line;
            br = new BufferedReader(new FileReader(PATH_NAME));
            while ((line = br.readLine()) != null) {
                listLine = line.split(",");
                list.add(new Country(Integer.parseInt(listLine[0]), listLine[1], listLine[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Country c : list) {
            System.out.println(c);
        }
    }
//
//    public static void testFile() {
//        try (FileWriter filer = new FileWriter(PATH_NAME);
//             BufferedWriter bw = new BufferedWriter(filer)) {
//            List<Country> list = new ArrayList<>();
//            list.add(new Country(1,3,"hoàn"));
//
//            for (Country s : list) {
//                bw.write(s.toStringCountry());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    public static List<String> parseCsvLine(String csvLine) {
//
//        List<String> result = new ArrayList<>();
//        if (csvLine != null) {
//            String[] splitData = csvLine.split(",");
//            for (int i = 0; i < splitData.length; i++) {
//                result.add(splitData[i]);
//            }
//        }
//        return result;
//    }
//
}