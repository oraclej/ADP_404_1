public class StringDemo1 {
    public static void main(String[] args) {
//        String lowerEmail = email.toLowerCase();
//        String t = email.concat("@iau.ac.ir");

        String name1 = "babak";
        String name2 = "bahram";
        int n = name1.compareToIgnoreCase(name2);
        if(n > 0){
            System.out.println(name1 + " is greater than " + name2);
        }else if(n < 0){
            System.out.println(name1 + " is smaller than " + name2);
        }else{
            System.out.println(name1 + " is equal to " + name2);
        }
        String email = "a.hemmati@iau.ac.ir";
        if(email.indexOf("(")<0){

        }
        if(!email.contains("(")){

        }
        if(email.indexOf("@") > 2){

        }
//        email.lastIndexOf()
    }
}
