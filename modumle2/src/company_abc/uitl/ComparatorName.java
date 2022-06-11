package company_abc.uitl;

import company_abc.model.CompanyABC;

import java.util.Comparator;

public class ComparatorName implements Comparator<CompanyABC> {
    @Override
    public int compare(CompanyABC o1, CompanyABC o2) {
        return (o1.getName().compareTo(o2.getName()));
    }
}
