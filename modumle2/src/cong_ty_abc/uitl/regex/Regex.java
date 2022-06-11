package cong_ty_abc.uitl.regex;

import key_study.uitl.check_exception.CheckException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String YEAR_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static boolean yearRegex(String regex) {
        Pattern pattern = Pattern.compile(YEAR_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();


    }
//    public static boolean numberOfFoloorsRegex(String regex) {
//        Pattern pattern = Pattern.compile(NUMBEROFFOLOORS_REGEX);
//        Matcher matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }
//    private static final String NUMBEROFFOLOORS_REGEX = "^[0-9]{10}$";
//    public static Integer checkRegexInterger()  {
//        Integer value = CheckException.checkExForParseDouble();
//        while (!String.valueOf(value).matches(NUMBEROFFOLOORS_REGEX )) {
//            System.out.print("Enter again: ");
//            value = CheckException.checkExForParseDouble();
//        }
//        return value;
//    }
}
