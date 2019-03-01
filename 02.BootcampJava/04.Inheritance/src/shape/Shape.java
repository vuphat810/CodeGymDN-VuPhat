package shape;

public class Shape {
    private String color;
    private boolean filled;
    //Constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //getter setter color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //getter setter filled
    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "A shape.Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}

    class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
