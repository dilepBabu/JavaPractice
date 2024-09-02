import java.util.Scanner;

public class Ninputswap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int r=0;
        // while(n>0){
        //     int d=n%10;
        //     r=r*10+d;
        //     n=n/10;
        // }
        // System.out.println(r);
        int n=sc.nextInt();
        int d=0,c=0;
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            d=a[i]%10;
             c=a[i]/10;
             System.out.println(d+""+c);
            
        }

    }
    
}
