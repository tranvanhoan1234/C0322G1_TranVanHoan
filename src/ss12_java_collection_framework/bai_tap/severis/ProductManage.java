package ss12_java_collection_framework.bai_tap.severis;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.uitl.InterfaceComparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManage implements IProductManage {
    protected static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        Product product1 = new Product(1, "keo", 6000);
        Product product2 = new Product(2, "keo ngọt", 2000);
        Product product3 = new Product(3, "banhquy", 1000);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    public void addProduct() {
        System.out.println("thêm id Product : ");
        Integer idProduct = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm name Product : ");
        String nameProduct = scanner.nextLine();
        System.out.println("thêm price product : ");
        Integer priceProduct = Integer.valueOf(scanner.nextLine());
        Product productLists = new Product(idProduct, nameProduct, priceProduct);
        productList.add(productLists);

    }

    @Override
    public void deleteProduct() {

        System.out.println("nhập id muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                System.out.println("xóa thành công : ");
                break;

            } else {
                System.out.println("không tìm thấy xin nhập lại");
                return;
            }

        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortProduct() {

       Collections.sort(productList,new InterfaceComparetor());
        System.out.println("hiển thị danh sách sản phẩm: ");
        for (Product itemp:productList) {
            System.out.println(itemp);

        }
//        System.out.println("đã sắp xếp theo giá: ");
//        displayProduct();
    }

    @Override
    public void search() {
        System.out.println("nhập ten sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct(scanner.nextLine()).contains(name)) {
                System.out.println(productList.get(i));

            }

        }
    }

    @Override
    public void editProduct() {
        System.out.println("nhap id muon sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println("sua id: ");
                Integer idProduct = Integer.valueOf(scanner.nextLine());
                System.out.println("sua ten: ");
                String nameProduct = scanner.nextLine();
                System.out.println("sửa gia: ");
                Integer priceProduct = Integer.valueOf(scanner.nextLine());
                Product product = new Product(idProduct, nameProduct, priceProduct);
                productList.set(i, product);
                break;
            }
        }
    }
}
