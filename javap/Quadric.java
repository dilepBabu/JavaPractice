import java.lang.*;
import java.util.*;
class Quadric{
public static void main(String args[]){
int a,b,c;
double r1,r2,d;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
d=(Math.sqrt((Math.pow(b,2)-4*a*c)));
r1=(-b+d)/(2*a);
r2=(-b-d)/(2*a);
System.out.println(r1);
System.out.println(r2);
}
}