package ShowPrimeNumber;

public class ShowPrimeNumberUnderOneHundred {

    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }


    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

