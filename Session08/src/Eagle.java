public class Eagle implements Animal , Hunter{
    @Override
    public void move() {
        System.out.println("I fly");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    @Override
    public void breathe() {
        System.out.println("I can breath");
    }

    @Override
    public void hunt() {
        System.out.println("I am hunter");
    }
}
