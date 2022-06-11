package ss17_io_binary_file.bai_tap.severis;

import ss17_io_binary_file.bai_tap.model.ProductManagement;
import ss17_io_binary_file.bai_tap.uitl.read_writer.ReadWriter;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductionManger implements ProductionImpl {
    static Scanner scanner = new Scanner(System.in);
    List<ProductManagement> productionMangerList = new LinkedList<>();

    @Override
    public void add() {
        System.out.println("thêm  mã san phảm : ");
        Integer productCode = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm ten san phẩm : ");
        String productName = scanner.nextLine();
        System.out.println("thêm hãng sản xuất : ");
        String khanOfProduct = scanner.nextLine();
        System.out.println("thêm giá : ");
        Integer price = Integer.valueOf(scanner.nextLine());
        ProductManagement production = new ProductManagement(productCode, productName, khanOfProduct, price);
        productionMangerList.add(production);
        ReadWriter.writerFile(productionMangerList);
    }

    @Override
    public void display() {
        productionMangerList = ReadWriter.readFile();
        for (ProductManagement productManagement : productionMangerList) {
            System.out.println(productManagement);
        }
    }

    @Override
    public void search() {
        System.out.println("nhập tên bạn muốn tìm :");
        String productionName = scanner.nextLine();
        for (ProductManagement productManagement : productionMangerList) {
            if (productManagement.getProductName().equals(productionName)) {
                System.out.println(productManagement);

            }
        }
    }
}
