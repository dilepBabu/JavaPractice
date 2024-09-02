import java.util.*;
public class Simple {
    int amount=100;
    int year=2;
    double rate=10;
    double si;
    double ci;
    public void simplei()
    {
        
        si=(amount*rate*year/100);

    }
    public void compoundi()
    {
       
        ci=(amount*Math.pow(1.0+rate/100.0,year));
    }
    public void display()
    {
        System.out.println(si);
        System.out.println(ci);

    }
    public  static void main(String args[])
    {
        Simple s=new Simple();
        s.simplei();
        s.compoundi();
        s.display();

    }

    
}
