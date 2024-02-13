package Lesson3;

public class DivZero extends ArithmeticException{

    public DivZero(String s) {
        super(s);
    }
    public DivZero(){
        super("Деление на ноль");
    }
}
