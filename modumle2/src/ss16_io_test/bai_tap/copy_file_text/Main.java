package ss16_io_test.bai_tap.copy_file_text;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<CopyFileText> a = new CopyOnWriteArrayList<>();
        copyFileText.readFile("src/ss16_io_test/bai_tap/copy_file_text/targetfile.csv");
    }
}
