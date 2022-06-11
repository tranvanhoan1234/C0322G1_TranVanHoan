package company_abc.uitl;

import company_abc.model.CompanyABC;

import java.util.Comparator;

public class InterfaceComparator implements Comparator<CompanyABC> {


    @Override
    public int compare(CompanyABC o1, CompanyABC o2) {
//        if (o1.tinhLuong() == o2.tinhLuong()) {
//            return o1.getName().compareTo(o2.getName());
//        }
        return (int) (o1.tinhLuong() - o2.tinhLuong());

    }
}

