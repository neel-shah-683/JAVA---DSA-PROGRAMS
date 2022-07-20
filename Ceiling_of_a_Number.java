public class Ceiling_of_a_Number {
    public static void main(String[] args) {
        
        int[] arr={2, 3, 5, 9, 14, 16, 18};
                // 0  1  2  3   4   5   6
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[] a)
    {
        int start=0, end = a.length-1;
        int val = 17;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(val == a[mid])
            {
                return a[mid];
            }
            else if(val < a[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }        
        return a[start];
    }
}
