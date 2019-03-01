package point2D;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    Point2D() {
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + this.x + " ; y = " + this.y;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        Point2D point2D1 = new Point2D(2, 3);
        System.out.println(point2D1);
    }
}
