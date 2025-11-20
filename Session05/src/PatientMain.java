public class PatientMain {
    public static void main(String[] args) {
        Patient ali = new Patient();
        ali.setAge(30);
        ali.setName("Ali");
        ali.setSugar(90);
        ali.setWeight(70);
        ali.setMinBloodPressure(13);
        ali.setMaxBloodPressure(16);
        System.out.println(ali.isDiabetic());

        if(ali.getMinBloodPressure() > Patient.PRESSURE_RISK_MIN){
            System.out.println("has blood pressure");
        }
    }
}
