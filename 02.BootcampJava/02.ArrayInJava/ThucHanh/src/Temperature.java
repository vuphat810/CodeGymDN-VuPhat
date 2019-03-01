import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        //Tạo menu
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");

        //Nhập dữ liệu
        Scanner input = new Scanner(System.in);
        System.out.println("Which one do you want?");
        int choice = input.nextInt();
        double fahrenheit;
        double celsius;
        //Hiển thị kết quả
        switch (choice) {
            case 1:
                System.out.println("Enter Fahrenheit: ");
                fahrenheit = input.nextDouble();
                celsius = FahrenheitToCelsius(fahrenheit);
                System.out.println("Celsius is " + celsius);
                break;
            case 2:
                System.out.println("Enter Celsius: ");
                celsius = input.nextDouble();
                fahrenheit = CelsiusToFahrenheit(celsius);
                System.out.println("Fahrenheit is: " + fahrenheit);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Not Valid!!");
        }

    }

    //Tạo hàm chuyển đổi độ F sang C
    public static double FahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    //Tạo hàm chuyển đổi độ C sang F
    public static double CelsiusToFahrenheit(double celsius) {
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }


}
