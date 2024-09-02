import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    
}