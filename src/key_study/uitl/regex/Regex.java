package key_study.uitl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

//
//            -	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
//            -	Nếu là Villa thì XX sẽ là VL
//-	Nếu là House thì XX sẽ là HO
//-	Nếu Room thì XX sẽ là RO


    private static final String VILLA_REGEX = "^(SVVL-)[0-9]{4}$";
    public static boolean villaRegex(String regex) {
        Pattern pattern = Pattern.compile(VILLA_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
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
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
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
}
