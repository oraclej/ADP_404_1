package edu.iaun;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(2 , 5);
        Point p2 = new Point(5 , 1);
        double d = p1.getEuclideanDistance(p2);
        System.out.println(d);
    }
}
