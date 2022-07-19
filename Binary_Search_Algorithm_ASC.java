public class Binary_Search_Algorithm_ASC {
    public static void main(String[] args) {
        
        int[] arr = {2, 4, 5, 9, 11, 15, 17, 21, 24};
                   //0  1  2  3   4   5   6   7   8
        int res = binary_search(arr);
        System.out.println(res);
    }
    static int binary_search(int[] a)
    {
        int val = 24, start = 0, end = a.length-1;

        while(start<=end)
        {
            int mid = (start + end)/2;

            if(val < a[mid])
            {
                end = mid - 1;
            }
            else if(val > a[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
