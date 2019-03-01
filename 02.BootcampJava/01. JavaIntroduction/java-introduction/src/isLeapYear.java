import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập dữ liệu năm cần check năm nhuận
        System.out.println("Enter ShowPrimeNumber year: ");
        int year = scanner.nextInt();

        //Phân loại và hiển thị kết quả

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.printf(year + " is ShowPrimeNumber leap year");
                } else {
                    System.out.printf("%d is NOT ShowPrimeNumber leap year", year);
                }
            } else {
                System.out.printf("%d is ShowPrimeNumber leap year", year);
            }
        } else {
            System.out.printf("%d is NOT ShowPrimeNumber leap year", year);
        }


        }
    }

