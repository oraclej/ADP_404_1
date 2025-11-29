public class Calc {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(double a, double b){
        return (int)(a+b);
    }

    public static int add(int a, double b){
        return (int)(a+b);
    }

    public static int add(double a, int b){
        return (int)(a+b);
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int r1 = add(10,20);
        int r2 = add(10,20,30);
    }
}
