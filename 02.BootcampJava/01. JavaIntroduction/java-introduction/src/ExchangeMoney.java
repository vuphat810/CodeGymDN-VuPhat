import java.util.Scanner;
public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị USD: ");
        double usd = input.nextDouble();

        double vnd = usd * 23000;
        System.out.println("Giá trị chuyển thành: " + vnd + " vnd");

    }
}
