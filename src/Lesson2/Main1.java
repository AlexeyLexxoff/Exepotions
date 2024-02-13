package Lesson2;

//Задание №3
//        Запишите в файл следующие строки:
//        Анна=4
//        Елена=5
//        Марина=6
//        Владимир=?
//        Константин=?
//        Иван=4
//        Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
//        студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
//        значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
//        числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    static Map<String, Integer> map;

    static {
        map = new HashMap<>();
    }

    public static void main(String[] args) {

    }
    static void readFile(String filePath){
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] arr = line.split("=");
                if (arr[1].equals("?")){
                    arr[1] = String.valueOf(arr[0].length());
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }

}
