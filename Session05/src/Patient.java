public class Patient {
    private String name;
    private int age;
    private double weight;
    private double sugar;
    private double minBloodPressure;
    private double maxBloodPressure;
    public static final double DIABETIC_RISK_MIN_RANGE = 100;
    public static final double DIABETIC_RISK_MAX_RANGE = 120;
    public static final double PRESSURE_RISK_MIN = 10;
    public static final double PRESSURE_RISK_MAX = 14;

    public String isDiabetic(){
        if(sugar > DIABETIC_RISK_MAX_RANGE)
            return "Hi Risk";
        if(sugar > DIABETIC_RISK_MIN_RANGE)
            return "Medium Risk";
        return "No Risk";
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getMinBloodPressure() {
        return minBloodPressure;
    }

    public void setMinBloodPressure(double minBloodPressure) {
        this.minBloodPressure = minBloodPressure;
    }

    public double getMaxBloodPressure() {
        return maxBloodPressure;
    }

    public void setMaxBloodPressure(double maxBloodPressure) {
        this.maxBloodPressure = maxBloodPressure;
    }
}
