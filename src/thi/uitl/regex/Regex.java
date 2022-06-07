package thi.uitl.regex;

import key_study.uitl.check_exception.AgeException;
import key_study.uitl.check_exception.CheckException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String AGE_REGEX ="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    static Scanner scanner=new Scanner(System.in);
//
//            -	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
//            -	Nếu là Villa thì XX sẽ là VL
//-	Nếu là House thì XX sẽ là HO
//-	Nếu Room thì XX sẽ là RO


    private static final String VILLA_REGEX = "^(SVVL-)[0-9]{4}$";
    public static boolean villaRegex(String regex) {
        try {
            Pattern pattern = Pattern.compile(VILLA_REGEX);
            Matcher matcher = pattern.matcher(regex);
            return matcher.matches();

        } catch (NumberFormatException e) {
            System.out.println("xin vui lòng nhập lại định đnag" ) ;
            e.getStackTrace();
        }
        return false;
    }
    private static final String HOUSE_REGEX = "^(SVHO-)[0-9]{4}$";
    public static boolean hoseRegex(String regex) {
        Pattern pattern = Pattern.compile(HOUSE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    private static final String ROOM_REGEX = "^(SVRO-)[0-9]{4}$";
    public static boolean roomRegex(String regex) {
        Pattern pattern = Pattern.compile(ROOM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

//-	Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường
//-	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2
//-	Chi phí thuê phải là số dương
//-	Số lượng người tối đa phải >0 và nhỏ hơn <20
//            -	Số tầng phải là số nguyên dương.
//-	 Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch v
//-	Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100
// tuổi và phải đúng định dạng dd/mm/YYYY (sử dụng User Exception)

    private static final String NAME_REGEX = "^[A-Z][a-z]+$";
    public static boolean nameRegex(String regex) {
        try {
            Pattern pattern = Pattern.compile(NAME_REGEX);
            Matcher matcher = pattern.matcher(regex);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return true;
    }


    private static final String USABLEAREA_REGEX = "^((([3-9][0-9])|([1-9][0-9]{2,}))\\.[0-9]+)$";
    public static boolean usableAreaRegex(String regex) {
        Pattern pattern = Pattern.compile(USABLEAREA_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }



    private static final String MAXIMUMNUMBEROFPEOPLE_REGEX = "^(1)\\d$|^[1-9]$";
    public static boolean maxImumNumberOfPeopleRegex(String regex) {
        Pattern pattern = Pattern.compile(MAXIMUMNUMBEROFPEOPLE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }

    private static final String NUMBEROFFOLOORS_REGEX = "^[0-9]+$";
    public static boolean numberOfFoloorsRegex(String regex) {
        Pattern pattern = Pattern.compile(NUMBEROFFOLOORS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();


    }
    public static String checkExForParseAge(String temp) {
        Scanner scanner =new Scanner(System.in);
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(AGE_REGEX, temp)) {
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 10&& current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Nhập tuổi phải lớn hơn 18 tuổi NHỎ HƠN 100 ");
                    }
                } else {
                    throw new AgeException("đinh dạng sai dd/MM/YY");
                }
            } catch (AgeException e) {
                System.err.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
    //tuổi
    private static final String YEAR_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static boolean yearRegex(String regex) {
        Pattern pattern = Pattern.compile(YEAR_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();


    }

//vừa chex excepti on vừa number
    public static int checkRegexPoint()  {
        int value = CheckException.checkExForParseInteger();
        while (!String.valueOf(value).matches(NUMBEROFFOLOORS_REGEX )) {
            System.out.print("Enter agai: ");
            value = CheckException.checkExForParseInteger();
        }
        return value;
    }
}
