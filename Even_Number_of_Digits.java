public class Even_Number_of_Digits {
 public static void main(String[] args) {
    
    int [] arr = {12, 345, 2, 6, 7896, 4568};

    computeEvenDigits(arr);
 }   
 static void computeEvenDigits(int[] a)
 {
        int c=0;

        for(int i=0;i<a.length;i++)
        {
            int count=0;
            while(a[i] > 0)
            { 
                a[i] = a[i] / 10;
                count++;
            }     
            if(count % 2 == 0)
            {
                c++;
            }     
        }
        System.out.println("Even Digits = "+c);

 }
}
