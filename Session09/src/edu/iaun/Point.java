package edu.iaun;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getEuclideanDistance(Point p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(Math.pow(dx , 2) + Math.pow(dy , 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
