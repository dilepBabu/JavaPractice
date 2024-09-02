import java.util.Scanner;

public class SameSrtingremove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0,max=0;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            c=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                    
                }
  

            }
            if(c<max)
            {
                c=max;

            
            System.out.println(s.charAt(i)+""+c);
            }


        }
        

        System.out.println(ans);
    }
    
}
