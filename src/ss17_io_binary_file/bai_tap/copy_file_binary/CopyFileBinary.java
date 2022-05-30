package ss17_io_binary_file.bai_tap.copy_file_binary;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


public class CopyFileBinary {
    private final static String PATH_TARGET = "src/ss17_io_binary_file/bai_tap/copy_file_binary/sourcefile.csv";
    private final static String PATH_TARGET1 = "src/ss17_io_binary_file/bai_tap/copy_file_binary/targetfile.csv";

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        File sourceFile = new File(PATH_TARGET);
        File destFile = new File(PATH_TARGET1);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}