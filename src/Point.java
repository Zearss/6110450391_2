import java.util.ArrayList;

public class Point {
    private double x;
    private double y;

    ArrayList<Point> p = new ArrayList<>();

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        Point parabola1 = new Point(1,0);
        Point parabola2 = new Point(0.5,4);
        System.out.println(parabola1);
    }
}