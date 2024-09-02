public class Revpascal {
    public static void main(String[] args) {
        int num=0,n=4;
        for(int i=n;i>=0;i--)
        {
            for(int sp=1;sp<=n-1;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                num=num+1;
                System.out.print(num);
            }
            System.out.println();
        }
    }
    
}
