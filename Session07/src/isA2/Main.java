package isA2;

public class Main {
    public static void main(String[] args) {
        Human ali = new Human();
        Worm worm = new Worm();
        ali.move();
        worm.move();

        //Creature creature = new Creature();

        Creature creature = new Human();
        //creature.study();
        Human human = new Human();
        human.study();
    }
}
