public class RegexDemo1 {
    public static void main(String[] args) {
        String name = "d7T556";
        boolean m =
                name.matches("1[0-9]{3}/[0-9]{1,2}/[0-9]{1,2}");
        System.out.println(m);
        if(name.matches("[a-z&&^[c-f]]")){}
        if(name.matches("[a-z&&^[cf]]")){}
    }
}
