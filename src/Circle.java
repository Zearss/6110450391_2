public class Circle {
    public static final double PI = 3.14159;
    private String name;
    private double redius;


    public Circle(String name, double redius) {
        this.name = name;
        this.redius = redius;
    }

    public static double rediansToDegrees(double redians){
        return redians * 180 / PI;
    }

    public double area(){
        return PI * redius * redius;
    }

    public double circumference(){
        return 2 * PI * redius;
    }
}

class MainCircle {
    public static void main(String[] args) {
        Circle z = new Circle("Ball",30);
double area = z.area(); Circle.rediansToDegrees(30);
}}

