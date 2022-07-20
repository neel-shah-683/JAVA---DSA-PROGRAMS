public class Pythagorean_Triplet {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 9, 5};

        boolean ans = py(arr);
        if(ans == true)
        {
            System.out.println("There is Pythagorean Triplet");
        }
        else
        {
            System.out.println("No Pythagorean Triplet");
        }
    }
    static boolean py(int[] a)
    {
        int res=0;
        
        for(int i=0;i<a.length;i++)
        {
            for(int n=i,m=1;m<a.length;m++)
            {
                     res = (a[n] * a[n]) + (a[m] * a[m]); 
                    for(int k=0;k<a.length;)
                    {
                        int c = a[k] * a[k];
                        if(res==c)
                        {
                            return true;
                        }
                        else 
                        {
                            k++;
                        }
                    }                        
            }
        }            
        return false;
    }
}
