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

        //Hiển thị kết quả
        switch (choice) {
            case 1:
                System.out.println("Enter Fahrenheit: ");
                int fahrenheit = input.nextInt();
                int celsius = FahrenheitToCelsius(fahrenheit);
                System.out.println(celsius);
                break;
            case 2:
                System.out.println("Enter Celsius: ");
                celsius = input.nextInt();
                fahrenheit = CelsiusToFahrenheit(celsius);
                System.out.println(fahrenheit);
                break;

        }

    }
    //Tạo hàm chuyển đổi độ F sang C
    public static int FahrenheitToCelsius(int fahrenheit) {
        int celsius = (fahrenheit - 32) * (5/9);
        return celsius;
    }
    //Tạo hàm chuyển đổi độ C sang F
    public  static  int CelsiusToFahrenheit (int celsius) {
        int fahrenheit = (9/5) * celsius + 32;
        return fahrenheit;
    }


}
}
