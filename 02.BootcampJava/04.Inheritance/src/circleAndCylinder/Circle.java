package circleAndCylinder;

public class Circle {
    double radius;
    String color;

    public Circle() {
        this.radius = 1.0;
        color = "black";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "The Circle with radius = " + this.radius + " and the color is " + this.color;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(5.0, "White");
        System.out.println(circle2);
    }
}
