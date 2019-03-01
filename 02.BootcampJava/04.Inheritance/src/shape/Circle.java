package shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //getter setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
    class CircleTest {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);
            Circle circle0 = new Circle(3);
            System.out.println(circle0);
            Circle circle1 = new Circle(2,"Red", true);
            System.out.println(circle1);

        }
    }

