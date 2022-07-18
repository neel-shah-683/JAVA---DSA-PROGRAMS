public class Even_Number_of_Digits {
 public static void main(String[] args) {
    
    int [] arr = {121, 345, 2, 6, 7896};

    computeEvenDigits(arr);
 }   
 static void computeEvenDigits(int[] a)
 {
        int digit=0,c=0;

        for(int i=0;i<a.length;i++)
        {
            int count=0;
            while(a[i] > 0)
            {
                digit = a[i] % 10; 
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
