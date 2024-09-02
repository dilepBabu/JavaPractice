import java.util.Scanner;
class Swap
{
    public static void main(String gg[])
    {
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+"=a"+b+"=b");
    }

}