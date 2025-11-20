public class Three {
    public static void main(String[] args) {
        int[] numbers = {5,3,7,6,2,8,1,9};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("SUM=" + sum);
        double avg = (double) sum / numbers.length;
        System.out.println("AVG=" + avg);


    }
}
