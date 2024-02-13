package Lesson3;
//Задание №1
//        Создайте метод doSomething(), который может быть источником одного из
//        типов checked exceptions (тело самогометода прописывать не обязательно).
//        Вызовите этот метод из main и обработайте в нем исключение, которое
//        вызвалметод doSomething().


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try{
         doSomething();
        }
        catch (IOException e){
            e.printStackTrace();
        }




    }
    public static void doSomething() throws IOException {

    }
}
