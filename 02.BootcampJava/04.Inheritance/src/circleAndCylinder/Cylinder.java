package circleAndCylinder;

public class Cylinder extends Circle {
    double height = 1;

    public Cylinder() {
    }

    public Cylinder (double height){
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return this.height * this.radius * this.radius * Math.PI;
    }
     @Override
    public String toString() {
        return "The cyclinder with height = " + this.height + ", which is a subclass of " + super.toString();
     }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(2);
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(3 , 5, "Blue");
        System.out.println(cylinder3);
    }
}
