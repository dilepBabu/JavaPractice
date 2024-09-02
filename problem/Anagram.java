
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        int e=a.length();
        int f=b.length();
                
        if(e!=f){
            System.out.println("check length");
        }
        else{
            char []c1=a.toLowerCase().toCharArray();
            char []d2=b.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(d2);
            String r=""; 
            String t="";
            for(int i=0;i<e;i++)
            {
                if(c1[i]==d2[i]){
                    r="ANAGRAM";
                }
                else
                {
                    t="NOT ANAGRAM";
                }

            }
            System.out.println(r);
            System.out.println(t);



        }

        




        


        
    }
    
}
