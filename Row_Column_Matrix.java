import java.util.Arrays;

public class Row_Column_Matrix {
    public static void main(String[] args) {
        
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        if(arr.length == 0)
        {
            System.out.println("No Elements are there:");
        }
        else
        {
            int[] ans = search(arr);
            System.out.println("Element found at "+Arrays.toString(ans)+" position");
        }
    }
    static int[] search(int[][] a)
    {
        int val = 27;
        for(int i=0;i<a.length;)
        {
            for(int j=a.length-1;j>=0;)
            {
                if(val == a[i][j])
                {
                    return new int[] {i,j};                    
                }
                else if(val < a[i][j])
                {
                    if(j>=0)
                    {
                        j--;
                        if(j<=-1)
                            return new int[] {-1,-1};
                    }
                }
                else
                {
                    if(i<a.length)
                    {
                        i++;
                    }
                }
            }
        }
        return new int[] {-1,-1};
    }
}
