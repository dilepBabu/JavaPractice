import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String m="KSRCT";
       
        System.out.println(m.charAt(1));
        String s="KSRCT";
        /*string to char*/
        char a[]=s.toCharArray();
        for(char c:a)
        {
            System.out.println(c);
        }
        

            Scanner sc=new Scanner(System.in);
            String b=sc.nextLine();
            char[] d=b.toCharArray();
            for (int j=0;j<d.length;j++) {
                if(d[j]>=65 & d[j]<=90)
                System.out.println(d[j]);
                
            }
        sc.close();
    }


    
}