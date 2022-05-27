package ss16_io_test.bai_tap.copy_file_text;


import java.io.*;

public class CopyFileText {
    private final static String PATH_TARGET = "src/ss16_io_test/bai_tap/copy_file_text/targetfile.csv";

    public void readFile(String filePath) {
        File file = new File(filePath);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/ss16_io_test/bai_tap/copy_file_text/sourcefile.csv"));
            BufferedReader br = new BufferedReader(new FileReader(PATH_TARGET));) {

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            while ((line = br.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}

