import java.util.Scanner;

/**
 * NeonNumber
 */
public class NeonNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n*n;
        int sum=0;
        int un=m%10;
        sum=sum+un;
        int fn=m/10;
        int ad=fn+sum;
        if(ad==n)
        {
            System.out.println("neon number");
        }
        else{
            System.out.println("not neon number");
        }
    }
}