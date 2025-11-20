public class Test {
    public static void main(String[] args) {
        Patient ali = new Patient("Ali", 40);
        ali.setHeight(180);
        ali.setWeight(80);
        ali.setMinBloodPressure(11);
        ali.setMaxBloodPressure(15);
        ali.setAge(41);
        Patient hasan = new Patient("Hasan", 20);
        hasan.setAge(20);
        hasan.setHeight(1.6);
        hasan.setWeight(40);
        System.out.println(ali.getHeight());
        System.out.println(hasan.getHeight());
    }
}
