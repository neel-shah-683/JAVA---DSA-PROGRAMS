import java.util.ArrayList;

public class Recursion_LinearSearch{

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr = {3, 9, 1, 18, 9};
        int val = 9, i = 0;
       System.out.println(recurLinearSearch(arr, val, i, al)); 
      }
    static ArrayList<Integer> recurLinearSearch(int[] a, int val, int i, ArrayList<Integer> al )
    {
        if(i==a.length)
            return al;
        if(a[i] == val)
            al.add(i);
        return recurLinearSearch(a, val, ++i, al);
    }
}