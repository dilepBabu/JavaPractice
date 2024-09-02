import java.util.Scanner;

/**
 * RightShift
 */
public class RightShift {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
      
        int i,j,temp;
        int []b=new int[n];
        for(i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
            
        }
        int p=3;
        while(p>0)
        {
        for(i=0;i<b.length;i++)
        {
         temp=b[n-1];
         b[n-1]=b[i];
         b[i]=temp;   
            
        }
        p--;
    }
        for(i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
            
        }

       
    }}
