import java.util.Arrays;
import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c[]=new int[n];
        int b=0;
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
       
        
        for(i=0;i<a.length-1;i++)
        {

            for(j=i+1;j<a.length-1;j++)
            {
                if(a[i]==a[j])

                {
                    b=a[i];
                    //System.out.println(a[i]);

                }
                
            }
            
           
        }
        c[i]=b;
        
        System.out.println(c[i]);


        
       

        
    
    }
    
}
