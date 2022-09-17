public class Merge_Sort_Recursion {
    
    public static void main(String[] args) {
        
        int[] arr = {6, 3, 9, 5, 2, 8};

        divide(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    static void divide(int[] arr, int s, int e)
    {
        if(s>=e)
        {
            return ;
        }
        int mid = s + (e-s)/2;
        divide(arr, s, mid);
        divide(arr, mid+1, e);
        conquer(arr, s, mid, e);

    }
    static void conquer(int[] arr, int s, int mid, int e)
    {
        int[] merged = new int[e-s+1];

        int index1 = s;
        int index2 = mid+1;
        int x = 0;

        while(index1 <= mid && index2 <= e)
        {
            if(arr[index2] < arr[index1])
            {
                merged[x] = arr[index2];
                index2++;
                x++;
            }
            else
            {
                merged[x] = arr[index1];
                index1++;
                x++;
            }
        }

        while(index1 <= mid)
        {
            merged[x] = arr[index1];
            index1++;
            x++;
        }

        while(index2 <= e) 
        {
            merged[x] = arr[index2];
            index2++;
            x++;
        }

        for(int i=0,j=s;i<merged.length;i++,j++)
            arr[j] = merged[i];
    }
}
