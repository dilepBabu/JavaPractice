import java.lang.*;
class First{
public static void main(String args[]){
System.out.println("Hello");


			/*Datatypes:*/
System.out.println("integer min size: "+Integer.MIN_VALUE);
System.out.println("integer max size: "+Integer.MAX_VALUE);
System.out.println("integer bytes size: "+Integer.BYTES);
System.out.println("boolean min size: "+Character.MIN_VALUE);
System.out.println("boolean max size: "+Character.MAX_VALUE);


			/*Variable Declear*/
int a=2147483647;
System.out.println(a);


			/*LITERALS*/


/* INTEGER LITERAL*/

byte b1=10;
byte b2=0b1010;
byte b3=012;
byte b4=0xA;
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(b4);

/* LONG LITERAL*/

long l=125l; /*the long take int also but int have b/w -2148473648 to 2147483647*/
System.out.println(l);
long l1=999999999999l;
System.out.println(l1);



}
}