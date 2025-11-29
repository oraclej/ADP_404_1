package exceptions;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("one");
        try {
            System.out.println(4 / 0);
        }catch (ArithmeticException e){
            System.out.println("can not divide by zero");
        }
        System.out.println("two");
        System.out.println("three");
    }
}
