import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 23, 9, 18, 56, 101 };

        System.out.println("Original Array = " + Arrays.toString(arr) + "\n");

        reverse(arr);

        System.out.println("Reverse Array = " + Arrays.toString(arr));

    }

    static void reverse(int[] a) {
        int end = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (i <= end - i) {
                int temp = a[i];
                a[i] = a[end - i];
                a[end - i] = temp;
            }
        }
    }
}
