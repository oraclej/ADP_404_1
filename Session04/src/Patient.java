public class Patient {
    private String name;
    private int age;
    private double height;
    private int weight;
    private int minBloodPressure;
    private int maxBloodPressure;

    public Patient() {
    }

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 3)
            this.height = height * 100;
        else
            this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight < 150)
            this.weight = weight;
        else
            System.err.println("Invalid Weight");
    }

    public int getMinBloodPressure() {
        return minBloodPressure;
    }

    public void setMinBloodPressure(int minBloodPressure) {
        this.minBloodPressure = minBloodPressure;
    }

    public int getMaxBloodPressure() {
        return maxBloodPressure;
    }

    public void setMaxBloodPressure(int maxBloodPressure) {
        this.maxBloodPressure = maxBloodPressure;
    }

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
        System.out.println(ali.height);
        System.out.println(hasan.getHeight());
    }
}
