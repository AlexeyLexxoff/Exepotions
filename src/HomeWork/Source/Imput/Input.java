package HomeWork.Source.Input;

import java.util.Scanner;

public class Input {


    public static String getData(){
        String data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел ФИО, дату рождения, номер телефона, пол");
        System.out.println(">>> ");
        data = scanner.nextLine();
        return data;
    }
}