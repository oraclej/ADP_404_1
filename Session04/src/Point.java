public class Point {
    private int x, y;

    Point(){

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
//        Point p2 = new Point(3);
//        Point p3 = new Point(3, 5);
    }
}
