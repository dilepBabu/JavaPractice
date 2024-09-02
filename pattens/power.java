import java.util.*;
import java.math.*;
public class power{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c=0;
        int n = s.nextInt();
        for(int i=0;i<n;i++){
        double q = Math.pow(2,i);
        if(q==n){
            c++;
            System.out.println("True");
        }
        }
        if(c==0){
            System.out.println("False");
        }
    }
}