package bai_tap_nho_1.uitl;

import bai_tap_nho_1.modol.Strudent;
import bai_tap_nho_1.modol.Teach;
import company_abc.model.CompanyABC;

import java.util.Comparator;

public class InterfaceComparetor implements Comparator<Strudent> {
    @Override
    public int compare(Strudent o1, Strudent o2) {
            return (o1.getTen().compareTo(o2.getTen()));
        }


//        @Override
//        public int compare(Product o1, Product o2) {
//            if (o1.getProductPrice() > o2.getProductPrice()) {
//                return 1;
//            } else if (o1.getProductPrice() < o2.getProductPrice()) {
//                return -1;
//            }
//            return 1;
//        }
//    }
//}
//sắp sếp
//@Override
//public void sortProduct() {
//
//        Collections.sort(productList,new InterfaceComparetor());
//        System.out.println("hiển thị danh sách sản phẩm: ");
//        for (Product itemp:productList) {
//        System.out.println(itemp);
//
//        }
////        System.out.println("đã sắp xếp theo giá: ");
////        displayProduct();
//        }
}
