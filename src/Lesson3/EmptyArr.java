package Lesson3;

public class EmptyArr extends NullPointerException {
    public EmptyArr(String s) {

        super(s);

    }
    public EmptyArr(){
        super("элемент отсутсвует");
    }
}
