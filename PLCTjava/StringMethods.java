import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for (char c : a.toCharArray()) {
            if (a.indexOf(1)==-1)
            {
                System.out.println(c);

            }
            
        }
        System.out.println();
        sc.close();
    }
    
}
