public class Student {
    private String name;
    private double gpa;
    public final static double CONDITIONAL_GPA = 12;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static void printConditionalGpa(){
        System.out.println(CONDITIONAL_GPA);
    }

}
