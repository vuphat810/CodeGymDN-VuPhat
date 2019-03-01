import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return this.a; }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return  b * b - (4 * a * c);
    }
    public double getRoot1 () {
        return ((-b + Math.pow((b * b - (4 * a * c)), 0.5) ) / (2 * a));
    }
    public double getRoot2() {
        return ((-b - Math.pow((b * b - (4 * a * c)), 0.5) ) / (2 * a));
    }

    public void calculate() {
        double delta = getDiscriminant();
        if (delta > 0 ) {
            System.out.println ("x1 = " + getRoot1() + "; x2 =  " + getRoot2());
        }
        if (delta == 0) {
            System.out.println("x1 = x2 = " + getRoot1());
        }
        if(delta < 0) {
            System.out.println("No root!");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value a, b, c for Quadratic Equation: ax2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.calculate();

    }
}


