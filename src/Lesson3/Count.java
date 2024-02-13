package Lesson3;
//Задание №2
//        Создайте класс Счетчик, у которого есть метод add(), увеличивающий
//        значение внутренней int переменнойна 1.Сделайте так, чтобы с объектом
//        такого типа можно было работать в блоке try-with-resources. Нужно бросить
//        исключение, еслиработа с объектом типа счетчикбылане в ресурсном try
//        и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
//        лучше всего.

public class Count implements AutoCloseable{

    int a = 0;
    static boolean isOpen = true;

    public void add(){
        a++;

    }

    @Override
    public void close() throws Exception {
        isOpen = false;
        System.out.println("РЕсурс закрыт");

    }

    public static boolean getCloser(){
        return isOpen;
    }
}
