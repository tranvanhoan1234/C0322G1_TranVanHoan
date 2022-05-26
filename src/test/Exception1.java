package test;

public class Exception1 {
    public class MyException extends java.lang.Exception {

        public MyException(String message) {
            System.out.println(message);
        }

    }
}
