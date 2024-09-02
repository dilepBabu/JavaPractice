import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.Scanner;

/**
 * Arraylists
 */
public class Arraylists {

    public static void main(String []args)
    { 
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split(" ");
        List <Object> a=new ArrayList<Object>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            a.add(c);
        }
            System.out.println(a);
            
    }
}