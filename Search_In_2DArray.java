import java.util.Arrays;

public class Search_In_2DArray {
    public static void main(String[] args) {
        
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 44, 361},
                {18, 12}            
        };
        if(arr.length == 0)
        {
            System.out.println("No Elements in an Array");
        }
        else
        {
            int res[] = search2d(arr);
            System.out.println(Arrays.toString(res));
        }
    }
    static int[] search2d(int[][] a)
    {
        int val = 99;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j] == val)
                {
                    return new int[] {i,j};
                }
                                
            }
        }
        return new int[] {-1, -1};
    }
}
