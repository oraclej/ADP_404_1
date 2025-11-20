package hasA;

public class Main {
    public static void main(String[] args) {
        Human ali = new Human();
        ali.setLeftHand(new Hand());
        ali.setRightHand(new Hand());
        //hasA.Heart heart = new hasA.Heart();
        ali.setHeart(new Heart());
    }
}
