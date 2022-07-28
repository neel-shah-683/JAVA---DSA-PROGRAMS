import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        
        int[] arr = {-5, 3, -4, 1, -2};
        insertion_sort(arr);
    }
    static void insertion_sort(int[] a)
    {
        for(int i=0;i<=a.length-2;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(a[j] < a[j-1])
                {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
