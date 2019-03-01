import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        //Nhập size
        System.out.print("Enter a size for array: ");
        size = input.nextInt();

        //Nhập giá trị cho các phần tử
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a value for element " + (i + 1) + ":");
            array[i] = input.nextInt();
            i++;
        }
        //Tìm ra giá trị nhỏ nhất
        int min = findMin.minValue(array);
        System.out.print("min is: " + min);
    }
}
