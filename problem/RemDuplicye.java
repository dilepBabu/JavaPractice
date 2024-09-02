import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * RemDuplicye
 */
public class RemDuplicye {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        char[] b=a.toCharArray();
        Arrays.sort(b);
        
        for(int i=0;i<a.length();i++)
        {
            if (b[i]==b[i+1])
            {

            }
            else{
                System.out.println(b[i]);
            }
        }

        
    }
}