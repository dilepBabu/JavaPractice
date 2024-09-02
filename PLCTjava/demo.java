import java.util.*;
public class demo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        String arr[]=str.split(" ");
        int len=arr.length;
        System.out.println("No. of words in the given string is : "+len);
        char vowels[]={'a','e','i','o','u'};
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            char a=s.charAt(0);
            char b=s.charAt(s.length()-1);
            count1=0;
            for(char e:vowels)
            {
                for(int k=0;k<s.length();k++)
                { 
                    if(e==s.charAt(k))
                    {
                       count1++;
                    }
                }
              if(e==a || e==b)
              {
                  count++;
              }
            }
            System.out.print(s+" "+count1);
            System.out.println(" ");
        }
        System.out.println("words count starting or ending with vowels :"+count);

    }
}
