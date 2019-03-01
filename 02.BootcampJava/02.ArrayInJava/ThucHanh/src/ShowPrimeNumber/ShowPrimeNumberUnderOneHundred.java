package ShowPrimeNumber;

public class ShowPrimeNumberUnderOneHundred {
    public static void main(String[] args) {
        int number = 2;

        while (number < 100 ) {
            boolean isPrime = ShowTwentyPrimeNumber.isPrime(number);
            if (isPrime) {
                System.out.println(number);
            }
            number++;
        }
    }
}
