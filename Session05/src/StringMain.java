public class StringMain {
    public static void main(String[] args) {
//        String s = "123";
//        for (int i = 0; i < 1000; i++) {
//            s += "1";
//        }

        String email = "a.HEMMATI@iau.ac.IR";
        System.out.println(email.equals("a.hemmati@iau.ac.ir"));
        System.out.println(email.equalsIgnoreCase("a.hemmati@iau.ac.ir"));





//        System.out.println(email.charAt(7));
        if(email.charAt(0) == 'a' || email.charAt(0)=='A'){

        }
        if(email.contains("iau")){

        }

        if(email.startsWith("a.")){

        }

        if(email.endsWith("iau.ac.ir")){

        }
        if(email.equals("a.hemmati@iau.ac.ir")){

        }

        if(email.equalsIgnoreCase("a.hemmati@iau.ac.ir")){

        }
//        if(Character.isUpperCase(email.charAt(0)))
//        System.out.println(email.length());
//        System.out.println(email.toLowerCase());
//        System.out.println(email.toUpperCase());

        if(!email.isEmpty()){

        }
        String text = "    ";
        if(text.isBlank()){

        }


    }
}
