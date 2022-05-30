package regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String ACCOUNT_REGEX = "^(0|(\\+84))[0-9]{9}$";
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
//    Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
//    Ví dụ tên lớp không hợp lệ: (a8)-(22222222)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã kiểm thử đi mầy: ");
        String exNumberText = scanner.nextLine();
        System.out.println(NumberPhone.validate(exNumberText));


    }
}
