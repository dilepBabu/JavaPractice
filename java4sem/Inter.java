import java.util.*;
interface I1
{
    public void disp1(String s);
}
interface I2 extends I1
{
    public void disp2(String s);
   
}
class C1
{
    public void disp3(String s)
    {
        System.out.println(s);
    }
}
public class Inter  extends C1 implements I2  {
    public void disp1(String s)
    {
        System.out.println(s);
    
    }
    public void disp2(String s)
    {
        System.out.println(s);
    
    } 
    public static void main(String ar[])
    {
        Inter i=new Inter();
        i.disp1(ar[0]);
        i.disp2(ar[1]);
        i.disp3(ar[2]);
    }

    
}
