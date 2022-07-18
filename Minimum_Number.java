import java.util.Arrays;

public class Minimum_Number {
    public static void main(String[] args) {
        
        int[] arr = {10, 23, 9, 18, 0, 56, -1};

        System.out.println(Arrays.toString(arr)+"\n");
        System.out.println("Minimum = "+min(arr));
    }   
    static int min(int[] a)
    {
        int min = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(min > a[i])
            {
                min = a[i];
            }
        }
        return min;
    }
}
