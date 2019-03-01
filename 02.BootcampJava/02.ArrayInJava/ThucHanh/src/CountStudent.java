import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        //Nhập size < 30
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Size should not over 30");
            }
        } while (size > 30);
        //Nhập điểm cho từng học sinh
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        //Hiển thị ds điểm vừa nhập và số học sinh pass
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.print("\nThe number of studert pass the exam is: " + count);


    }
}
