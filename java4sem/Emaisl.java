
import java.util.*;
class Emaisl {
    public static void main()
    {
        Scanner s =new Scanner(System.in);
        String a=s.next();
        String regex="^[A-Za-z0_9+_.-]+@[A-Za-z0-9.-]+$";
        boolean b=a.matches(regex);
        if(b)
        {
            System.out.println(yes);
            
        }
        else{
            System.out.println(no);
        }
    } 
    
}
