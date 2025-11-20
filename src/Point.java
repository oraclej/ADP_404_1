public class Point {
    int x;
    int y;

    Point(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    Point(int x) {
        this.x = x;
        this.y = 0;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(4, 3);
        Point p3 = new Point(2);
    }
}
