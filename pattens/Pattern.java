public class Pattern {
    public static void main(String[] args) {
        int a=4;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

    }
    
}
