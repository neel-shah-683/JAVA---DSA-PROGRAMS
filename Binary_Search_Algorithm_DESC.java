public class Binary_Search_Algorithm_DESC {
    public static void main(String[] args) {
        
        int[] arr = {90, 75, 18, 12, 6, 4, 3, 1};
                    //0   1   2   3  4  5  6   7
        int res = binary_Search(arr);
        System.out.println(res);
    }
    static int binary_Search(int[] a)
    {
        int val = 12, start=0, end=a.length-1;

        while(start<=end)
        {
            int mid = (start + end)/2;
            if(val == a[mid])
            {
                return mid;
            }
            else if(val > a[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }

        }
        return -1;
    }
}
