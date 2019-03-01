import java.util.Scanner;
public class CountElement {
    public static void main(String[] args) {
        int count = 0;
        String[] array = {"Phat", "Nam", "Lam", "Hai", "Hung", "Phat", "Nam", "Nam"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i])) {
                isExist = true;
                count ++;
            }
        }
        if(isExist) {
            System.out.println(name + " exist " + count + " times");
        }
        if(!isExist) {
            System.out.println("There is no " + name);
        }

    }


}
