import java.util.Arrays;

public class Cyclic_Sort{
    public static void main(String[] args) {
        
        int[] arr = {2, 4, 3, 1, 5, 6};
        cyclic_sort(arr);
    }
    static void cyclic_sort(int[] a)
    {
        for(int i=0;i<a.length;)
        {
            int correctIndex = a[i] - 1;
            if(i!=correctIndex)
            {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}