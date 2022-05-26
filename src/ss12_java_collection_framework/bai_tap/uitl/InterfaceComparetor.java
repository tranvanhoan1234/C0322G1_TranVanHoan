package ss12_java_collection_framework.bai_tap.uitl;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.Comparator;

public class InterfaceComparetor implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getProductPrice() > o2.getProductPrice()) {
            return 1;
        } else if (o1.getProductPrice() < o2.getProductPrice()) {
            return -1;
        }
        return 1;
    }
}
