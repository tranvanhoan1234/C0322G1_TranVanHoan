package bai_tap_nho_1.uitl;

import bai_tap_nho_1.modol.Teach;

import java.util.Comparator;

public class CompaTeach implements Comparator<Teach> {
    @Override
    public int compare(Teach o1, Teach o2) {
        return (o1.getTen().compareTo(o2.getTen()));    }
}
