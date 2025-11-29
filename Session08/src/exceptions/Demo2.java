package exceptions;

public class Demo2 {
    public static void main(String[] args) {
        try {
            System.out.println(2 / 2);

            int[] arr = {10, 20, 30};
            System.out.println(arr[1]);

            String s = null;
            System.out.println(s.charAt(7));
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }catch (NullPointerException e){
            System.out.println("Object is null");
        }catch (Exception e){
            System.out.println("Other exception");
        }


    }
}
