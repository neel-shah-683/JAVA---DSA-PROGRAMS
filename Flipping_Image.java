public class Flipping_Image {
    public static void main(String[] args) {
        
        int[][] arr = {
            {1,0,1},
            {1,0,0},
            {1,0,0}
        };
        int [][] ans = reverse(arr);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] reverse(int[][] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int end = a.length-1;
            for(int j=0;j<a[i].length;j++)
            {
                if (j <= end - j) {
                    int temp = 1-a[i][j];
                    a[i][j] = 1-a[i][end - j];
                    a[i][end - j] = temp;
                }
            }
        }
        return a;
    }
}
