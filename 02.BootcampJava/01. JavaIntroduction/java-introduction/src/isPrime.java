import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ShowPrimeNumber number: ");
        int number = input.nextInt();


        if (number >= 2) {
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime");
                    break;

                } else {
                    System.out.println(number + " is prime");
                    break;
                }
            }
        } else {
            System.out.println(number + " is not prime");

        }
    }
}
