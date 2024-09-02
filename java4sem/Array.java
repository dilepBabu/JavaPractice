import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int []a =new int[n]; 
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int big=findBiggestPositiveEven
        for(int i=0;i<n;i++)
        {
            int num=a[i];
            if(num>0 && num % 2 == 0 &&num>big){
            big=num;
        }
    }
    
    System.out.println(big);
    s.close();
}
}