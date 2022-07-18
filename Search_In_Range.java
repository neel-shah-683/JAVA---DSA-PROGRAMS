public class Search_In_Range{
    public static void main(String[] args) {

        int[] arr = { 56, 10, 89, 4, 7, 45};

        if(arr.length==0)
        {
            System.out.println("No Elements in an Array");
        }
        else
        {
            linear_search(arr);
        }
    }

    static void linear_search(int[] a) {
        int val = 10, flag = 1, index = 0,end=4;

        for (int i = 0; i < end; i++) {
           
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