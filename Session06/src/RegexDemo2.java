public class RegexDemo2 {
    public static void main(String[] args) {
        String t = "$#";
        System.out.println(t.matches("[\\d]"));
        System.out.println(t.matches("[^0-9]"));
        System.out.println(t.matches("[\\S]"));

    }
}
