public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 8, 9, 10, 11};
        int[] array3 = new int[8];
        int sizeOfArray1 = array1.length;
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            array3[sizeOfArray1 + j] = array2[j];
        }

        for (int result : array3) {
            System.out.print(result);
        }
    }
}
