package thi.uitl.check_exception;

import key_study.uitl.check_exception.IvalidHoseEpception;
import key_study.uitl.regex.Regex;

import java.util.Scanner;

public class IvaliHouseException {
    static Scanner scanner=new Scanner(System.in);
    public class IvalidHoseEpception extends Exception{

        public IvalidHoseEpception (String message){
            super(message);
        }
    }


//    public static Double checkExForParseDouble() {
//        boolean check = true;
//        Double value1 = 0d;
//        while (check) {
//            try {
//                value1 = Double.parseDouble(sc.nextLine());
//                check = false;
//            } catch (NumberFormatException a) {
//                System.err.println("Error: " + a.getMessage());
//                a.getStackTrace();
//            } catch (Exception e) {
//                System.err.println("Error: " + e.getMessage());
//                System.out.println(">>> Enter again: ");
//                e.printStackTrace();
//            }
//        }
//        return value1;
//    }
//
//    public static Long checkExForParseLong() {
//        boolean check = true;
//        Long value1 = 0l;
//        while (check) {
//            try {
//                value1 = Long.parseLong(sc.nextLine());
//                check = false;
//
//            } catch (NumberFormatException e) {
//                System.err.println("Error: " + e.getMessage());
//
//            } catch (Exception e) {
//                System.err.println("Error: " + e.getMessage());
//                System.out.println(">>> Enter again: ");
//
//            }
//        }
//        return value1;
//    }
//
    public static Integer checkExForParseInteger() {
        while (true) {
            try {
                int value1 = Integer.parseInt(scanner.nextLine());
                return value1;
            } catch (IllegalArgumentException a) {
                System.err.println("Error: " + a.getMessage());
                a.printStackTrace();
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

}
