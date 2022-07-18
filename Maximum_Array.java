import java.util.Arrays;

public class Maximum_Array {
    public static void main(String[] args) {
        
        int[] arr = {1, 23, 9, 18, 56};

        System.out.println(Arrays.toString(arr)+"\n");
        System.out.println("Maximum = "+max(arr));
    }   
    static int max(int[] a)
    {
        int max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        return max;
    }
}
