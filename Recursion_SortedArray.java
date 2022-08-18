public class Recursion_SortedArray {
    public static void main(String[] args) {
        
        int[] arr = {0, 2, 4, 5, 9, 12};
        int i=0, j=1;
        if(recurSortedArray(arr, i, j)==true)
        {
            System.out.println("Sorted Array:");
        }
        else
        {
            System.out.println("Not Sorted Array:");
        }
    }
    static boolean recurSortedArray(int[] a, int i, int j)
    {
        if(i==a.length-1)
        {
            return true;
        }
        if(a[i] < a[j])
        {
            return recurSortedArray(a, ++i, ++j);
        }
        return false;
    }
}
