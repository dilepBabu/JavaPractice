import java.util.Scanner;

public class Count {
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // String f=new String();
        // String []d={"hello","bye"};
        // StringBuffer s=new StringBuffer(d[]);

        // String a="";
        
        // for (String sb:d ) {
        //     s.append("world");

        
        //     a+=s;}
        // System.out.println(a);
        String s1="listen";
        String s2="silent";
        String s3="malayamal";
        System.out.println(isva(s1,s2));
        System.out.println(ispa(s3));

    }  
    public static boolean isva(String s1,String s2)
    {
        if(s1.length()!=s2.length()) return false;
        int []a=new int[26];
        for(char c1:s1.toCharArray())
        {
            a[c1-'a']++;
            System.out.println(c1);
        }
        for(char c2:s2.toCharArray())
        {
            a[c2-'a']--;
            System.out.println(c2);
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0)
            {
                return false;
            }

        }
        return true;
    }
    public static boolean ispa(String s3)
    {
        String ss=s3;
        String sr="";
        for(int i=s3.length()-1;i>=0;i--)
        {
            sr+=ss.charAt(i);

        }
        if(sr.contains(ss))
        {
            return true;
        }
        return false;
    }
  


    }

    
    

