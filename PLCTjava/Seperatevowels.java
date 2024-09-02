import java.util.Scanner;
/* remove vowels */
public class Seperatevowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        char []a=s.toCharArray();
        for (char c : a) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {

            }
            else
            {
                System.out.println(c);
            }
            
        }
        sc.close();

    }
    
    
}
