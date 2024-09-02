import java.util.Scanner;
import java.lang.*;
public class Area {
    public static void main(String arg[])
    {
        Scanner obj =new Scanner(System.in);
        int num=obj.nextInt();
        int area=num*num;
        int perimeter=2*num*num;
        System.out.println("Area= "+area +" peri= "+perimeter);
    }
    
}
