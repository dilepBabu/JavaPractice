import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n=sc.nextInt();
        // for(i=0;i<n;i++)
        // {
        //     for(j=n-i;j>1;j--)
        //     {
                
        //         System.out.print(" ");
        //     }
        //      for(j=0;j<=i;j++)
        //         {
        //             System.out.print("* ");
        //         }
            
        //     System.out.println(" ");
        // }
        for(i=0;i<=n;i++){

            for(j=n;j>=1;j--)
            {

                if(i>=j)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                

            }

            System.out.println("");
        }
        sc.close();
    
    }
    
}
