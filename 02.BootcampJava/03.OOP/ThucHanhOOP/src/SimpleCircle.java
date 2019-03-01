//Kết hợp 2 lớp thành 1
public class SimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The circle with the radius " + circle1.getRadius() + "and Area is: " + circle1.getArea() );
        SimpleCircle circle2 = new SimpleCircle(5);
        System.out.println("The circle with the radius " + circle2.getRadius() +"and Area is: " + circle2.getArea() );
    }



    //Constructor
    double radius;
    SimpleCircle () {
        radius = 1;
    }

    SimpleCircle (double newRadius) {
        radius = newRadius;
    }
    double getRadius() {
        return radius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
}
