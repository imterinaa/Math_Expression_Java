package Exceptions;

public class CharUndef extends Exception {
    public CharUndef(String s) {
        super("Параметр не задан '%s".formatted(s));
    }
}
