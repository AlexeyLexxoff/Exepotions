package Lesson3;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String message) {
        super(message);
    }
    public MyArraySizeException(int sizeA, int sizeB) {
        super("Необходимо ввести массив 4х4, введен массив " + sizeA + "x"+ sizeB);
    }
}
