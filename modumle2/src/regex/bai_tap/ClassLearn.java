package regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassLearn {
    private static final String ACCOUNT_REGEX = "^[CAD][0-9]{4}[GHIKLM]$";
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
//    Ví dụ tên lớp hợp lệ: C0318M

//    Ví dụ tên lớp không hợp lệ: M0318G, P0323A

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập mã kiểm thử đi mầy: ");
        String className = scanner.nextLine();

        System.out.println(ClassLearn.validate(className));

    }
}
