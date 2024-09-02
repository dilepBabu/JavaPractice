import java.util.*;

public class Method {
   static int avg(int a,int b)
    {
        return((a+b)/2);
    }
    static int avg(int a,int b,int c)
    {
        return((a+b+c)/2);
    }
    public static void main(String args[])
    {
        Method m=new Method();
        System.out.println(avg(2, 2));
        System.out.println(avg(2, 2, 2));
    }
    
}
