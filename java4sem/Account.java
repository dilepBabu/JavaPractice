import java.util.*;
public class Account {
    int acc;
    double atb;
    Account()
    {
        acc=0;
        atb=0;
    }
    Account(int an)
    {
        acc=an;
        atb=250;
    }
    Account(int an,double at)
    {
        acc=an;
        atb=at;
    }
    void read(int an)
    {
        acc=an;
        atb=250;
    }
    void read(int an,double at)
    {
        acc=an;
        atb=an;
    }
    void print()
    {
        System.out.println(acc);
        System.out.println(atb);
    }
    public static void main(String abs[])
    {
        Account a1=new Account();
        Account a2=new Account(2);
        Account a3=new Account(3,4 );
        Account a4=new Account();
        Account a5=new Account();
        a4.read(2);
        a5.read(3,4);
        a1.print();
        a2.print();
        a3.print();
        a4.print();
        a5.print();
    
}
}
