public class Linear_Search {
    public static void main(String[] args) {

        int[] arr = { 23, 45, 16, 10, 50, 56, 4 };

        linear_search(arr);
    }

    static void linear_search(int[] a) {
        int val = 10, flag = 1, index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) {
                flag = 1;
                index = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("Value " + val + " Found at Position = " + index);
        } else {
            System.out.println("Value " + val + " Not Found");
        }
    }
}