package ShowPrimeNumber;

public class ShowTwentyPrimeNumber {
    //Phương thức isPrime
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number >= 2) {
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }

    //Hiển thị 20 số nguyên tố đầu tiên
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

}
