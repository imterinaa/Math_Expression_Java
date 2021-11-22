package Exceptions;

public class ZeroDivException extends Exception {
    public ZeroDivException(String s) {
        super("DivByZero");
        System.out.println(s);

    }
}
