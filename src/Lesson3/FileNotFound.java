package Lesson3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFound extends FileNotFoundException {
    public FileNotFound(String s) {
        super(s);
    }
    public FileNotFound(){
        super("Файл не найден");
    }
}
