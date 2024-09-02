import java.util.*;

public class Areatrii{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int a,b,c;
float S;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
S=(a+b+c)/2;
float area=(S*(S-a)*(S-b)*(S-c));
System.out.println(Math.sqrt(area));
}
}