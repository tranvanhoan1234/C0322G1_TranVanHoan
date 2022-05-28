package ss17_io_binary_file.bai_tap.uitl.read_writer;

import ss17_io_binary_file.bai_tap.model.ProductManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriter {
    public static void writerFile(List<ProductManagement> list) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_io_binary_file/bai_tap/uitl/data/product.csv");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<ProductManagement> readFile() {
        List<ProductManagement> products = new ArrayList<>();
        try (    FileInputStream fileInputStream = new FileInputStream("src/ss17_io_binary_file/bai_tap/uitl/data/product.csv");
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){
            products = (List<ProductManagement>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
