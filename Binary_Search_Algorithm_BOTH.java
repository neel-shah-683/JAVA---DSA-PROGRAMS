public class Binary_Search_Algorithm_BOTH {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 50 ,60,70};

        int res = binary_search(arr);
        System.out.println(res);
    }
    static int binary_search(int[] a)
    {
        int val = 0, start = 0, end = a.length-1;

                while(start<=end)
                {
                    int mid = (start + end)/2;

                    if(val == a[mid])
                    {
                        return mid;
                    }
                    //ASCENDING
                    else if(a[start] <= a[end])
                    {
                        if(val < a[mid])
                        {
                            end = mid - 1;
                        }
                        else if(val > a[mid])
                        {
                            start = mid + 1;
                        }
                    }
                    //DESCENDING
                    else
                    {
                        if(val > a[mid])
                        {
                            end = mid - 1;
                        }
                        else 
                        {
                            start = mid + 1;
                        }
                    }
                   
                }                
        return -1;
    }
}
