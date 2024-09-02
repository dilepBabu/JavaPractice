
import java.util.*;

public class MaxDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int  count=0;
        int max=0;
        ArrayList <Character> a=new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            count =1;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    
                    count++;

                }
            }
            if(count>=max)
            {
                
                max=count;
                a.add(s.charAt(i));

                


            }
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        
  
        
        
    }
    
}
