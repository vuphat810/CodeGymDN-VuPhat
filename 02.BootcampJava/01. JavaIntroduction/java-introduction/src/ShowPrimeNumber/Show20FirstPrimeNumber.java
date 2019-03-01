package ShowPrimeNumber;

public class Show20FirstPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        boolean isPrime;
        while (count < 20) {
            isPrime = ShowPrimeNumberUnderOneHundred.isPrime(number);
            if (isPrime) {
                System.out.println(number);
                count ++;
            }
            number++;
        }
    }
}

