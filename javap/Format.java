/*print format*/
import java.util.*;
class Format{
public static void main(String args[]){
int a=10;
String b="hello";
float c=1.2f;

System.out.printf("%3$.2f ,%1$d ,%2$s\n",a,b,c);
System.out.format("%3$.2f ,%1$d ,%2$s\n",a,b,c);
System.out.printf("%-20s",b);


}
}