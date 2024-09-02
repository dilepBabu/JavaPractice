import java.util.ArrayList;
import java.util.Scanner;

/**
 * InnerCollectionss
 */
 class InnerCollectionss {

    int roll;
    String name;

    
}
public class Collectionss {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int i=0;
        for(i=0;i<n;i++)
        {
            InnerCollectionss s=new InnerCollectionss();
            s.roll=sc.nextInt();
            s.name=sc.next();
            a.add(s);


        }
        for (Object o: a) {
            System.out.println(o.get());
            
        }

    }
    
}
