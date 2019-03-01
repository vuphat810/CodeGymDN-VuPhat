import  java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given ShowPrimeNumber equation as 'ShowPrimeNumber * x + b = 0', please enter constants:");

        Scanner input = new Scanner(System.in);

        System.out.println("ShowPrimeNumber: ");
        double a = input.nextDouble();

        System.out.println("b: ");
        double b = input.nextDouble();



        if (a != 0) {
            double x = -b / a;
            System.out.println("x = " + x);
        } else {
            if ( b == 0) {
                System.out.println("all x");
            } else {
                System.out.println("No solution!");
            }


        }
    }
}

