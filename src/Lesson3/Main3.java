package Lesson3;

public class Main3 {
    public static void main(String[] args) {

        try(Count c = new Count()){
            c.add();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Count.getCloser());

    }
}
