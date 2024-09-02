class Pattern{
    public static void main(String args []){
        int n=3;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                for(int k=0;k<=n-1;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}