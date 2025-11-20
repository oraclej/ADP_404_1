public class StringDemo3 {
    public static void main(String[] args) {
        String t = "1";
//        for (int i = 0; i < 1000; i++) {
//            t += "1";
//        }

        long t1 = System.currentTimeMillis();
//        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10_000_000; i++)
            t += "1";
//        String e = s.toString();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
