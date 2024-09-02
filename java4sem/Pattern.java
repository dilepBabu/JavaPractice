import java.util.Scanner;
public class Pattern
{
    public static void main(String arg[])
    {
        int size;
        Scanner obj = new Scanner (System.in);
        size=obj.nextInt();
        
        for(int i=0;i<size;i++) {
        for(int j=0;j<size;j++){
            System.out.print("*");
        }
          System.out.println();
        }
        
        for(int k=0;k<size;k++)
        {
            for(int l=0;l<=k;++l)
            {
                System.out.print(1);
                
            }
            System.out.println();
        }
    }
}