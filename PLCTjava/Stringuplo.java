import java.util.Scanner;

public class Stringuplo {
    public static void main(String[] args) {
        String cap="",small="";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        for(char i:a)
        {
            if(Character.isUpperCase(i))
            {
                cap=cap+i;
            }
            else{
                small=small+i;

            }
        }
        System.out.println("capletter: "+cap);
        System.out.println("Small letter: "+small);
        sc.close();
    }
    
}
