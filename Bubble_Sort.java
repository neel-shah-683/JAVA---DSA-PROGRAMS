import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        bubble(arr);
    }
    static void bubble(int[] a)
    {
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag=true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(a));
        
    }
}
