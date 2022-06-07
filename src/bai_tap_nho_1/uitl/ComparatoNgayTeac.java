package bai_tap_nho_1.uitl;

import bai_tap_nho_1.modol.Teach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class ComparatoNgayTeac implements Comparator<Teach> {
    @Override
    public int compare(Teach o1, Teach o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1 = LocalDate.parse(o1.getNgaySinh(), dateTimeFormatter);
        LocalDate date2 = LocalDate.parse(o2.getNgaySinh(), dateTimeFormatter);

        if (date1.compareTo(date2) > 0) {
            return 1;
        } else if (date1.compareTo(date2) < 0) {
            return -1;
        } else {
            return o1.getTen().compareTo(o2.getTen());
        }
    }
}
