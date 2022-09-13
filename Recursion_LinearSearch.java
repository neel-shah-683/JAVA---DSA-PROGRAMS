public class Recursion_LinearSearch{

    public static void main(String[] args) {
        
        int[] arr = {3, 2, 1, 18, 9};
        int val = 1,i = 0;
        if(recurLinearSearch(arr, val, i)==true)
        {
            System.out.println("Element Present in the Array:");
        }
        else
        {
            System.out.println("Element Not Found:");
        }
    }
    static boolean recurLinearSearch(int[] a, int val, int i)
    {
       if(i==a.length)
            return false;
        
        if(a[i] == val)
            return true;
        
        return recurLinearSearch(a, val, ++i);
    }
}