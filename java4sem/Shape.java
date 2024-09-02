import java.util.Scanner;


public class Shape {
    

     void area(int a)
    {
System.out.println("Area of circle: "+3.14*a*a);
    }
    void area(int a,int b )
    {
        System.out.println("Area of rectangle: "+a*b);
    }
}
class Ans
{
    public static void main(String [] args)
    {
        
        Shape obj=new Shape();
        obj.area(2);
        obj.area(2,4);
    }
}
