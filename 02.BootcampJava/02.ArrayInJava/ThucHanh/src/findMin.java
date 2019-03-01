public class findMin {
    public static int minValue (int array[]) {
       int minValue = array[0];
       for (int i = 0; i < array.length; i++) {
           if (array[i] < minValue) {
               minValue = array[i];
           }
       }

       return minValue;
    }

    public static void main(String[] args) {
        int[] array = {6,38,5,7,4,69,99,66,8,10};
            int minValue = minValue((array));
        System.out.println("The min is: " + minValue);
        }
    }

