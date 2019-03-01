import java.util.Scanner;

public class FindPosition {
    public static void main(String[] args) {
        //Khai báo mảng
        String[] studentList = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        //Hiển thị mảng tên học sinh
        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Student List: " + studentList[i]);
        }

        //Nhập dữ liệu
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a student name: ");
        String studentName = input.nextLine();
        //Hiển thị kết quả
        boolean isExist = false;
        for (int i = 0; i < studentList.length; i++) {
            if (studentName.equals(studentList[i])) {
                isExist = true;
                System.out.println("The position of " + studentName + " is: " + i);
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not Found!");
        }
    }
}
