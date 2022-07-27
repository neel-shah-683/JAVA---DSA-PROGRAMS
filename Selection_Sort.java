import java.util.Arrays;

// import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 1, 2, 3};
        selection_sort(arr);
    }
    static void selection_sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j] < a[i])
                {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
}
