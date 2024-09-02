import java.util.Scanner;

public class CommonDivise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print("prime no"+i);
            }
            else{
                System.out.println("not"+i);
            }
        }
    }
    
}
