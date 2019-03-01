import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        //Hiện menu
        System.out.println("Enter any 5 numbers");
        int[] array = new int[5];

        Scanner input = new Scanner(System.in);

        //Nhập dữ liệu
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element: " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        //Hiển thị mảng
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //Tìm giá trị lớn nhất
        int max = array[0];
        int indexOfMax = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] > max) {
                max = array[a];
                indexOfMax = a + 1;
            }
        }
        System.out.println();
        System.out.print("The greatest element is: " + max + " at position: " + indexOfMax);
    }
}
