import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width + height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
    class TestRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = input.nextDouble();
        System.out.println("Enter height: ");
        double height = input.nextDouble();

        Rectangle rectangle1 = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle1.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle1.getArea());
    }
}
