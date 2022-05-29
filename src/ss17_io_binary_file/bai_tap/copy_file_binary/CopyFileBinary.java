package ss17_io_binary_file.bai_tap.copy_file_binary;

import java.io.*;


public class CopyFileBinary {
    private final static String PATH_TARGET = "src/ss17_io_binary_file/bai_tap/copy_file_binary/sourcefile.csv";
    private final static String PATH_TARGET1 = "src/ss17_io_binary_file/bai_tap/copy_file_binary/targetfile.csv";
    public static void main(String[] args) {

        String source = PATH_TARGET;
        String target = PATH_TARGET1;
        File file = new File(source);
        File file1 = new File(target);
        copyFile(file, file1);

    }

    public static void copyFile(File sourceFile, File targetFile) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(targetFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}