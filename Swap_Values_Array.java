import java.util.Arrays;

public class Swap_Values_Array {
    public static void main(String[] args) {

        int[] arr = {1, 3, 23, 9, 18};

        swap(arr);

        System.out.println("Swap Array = "+Arrays.toString(arr));
    }
    static void swap(int[] a)
    {
        for(int i=0,j=i+1;i<a.length;i++,j++)
        {
            if(j<=a.length-1)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            
        }
    }
}
