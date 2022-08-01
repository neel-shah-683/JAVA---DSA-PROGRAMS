public class Binay_Search_Recursion {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        int start = 0, end = arr.length-1;
        int ans = binary_search_recur(target, arr, start, end);
        System.out.println(ans);
    }
    static int binary_search_recur(int target, int[] a, int start, int end)
    {
        if(start > end)
            return -1;

        int mid = (start + end)/2;
        if(target == a[mid])
        {
            return mid;
        }
        if(target > a[mid])
        {
            return binary_search_recur(target, a,mid+1,end);
        }
        return binary_search_recur(target, a, start, mid-1);
    }
}
