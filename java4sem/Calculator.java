abstract class Calculator
{
    public abstract double ans(double n1,double n2);
}
class Addition extends Calculator
{
    public Addition(double n1,double n2){}
    public  double ans(double n1,double n2)
    {
        return n1+n2;
    }
}   
    class Subraction extends Calculator
    {
        public Subraction(double n1,double n2){}
        public double ans(double n1,double n2)
        {
            return n1-n2;
        }
    }
class Mul extends Calculator
{
    public Mul(double n1,double n2){}

    public double ans (double n1,double n2)
    {
        return n1*n2;
    }  
}
class Div extends Calculator
{
    public Div(double n1,double n2){}
    public double ans(double n1,double n2)
    {
        return n1/n2;
    }
}
class Answer
{
    public static void main(String args[]) {
        Addition add=new Addition(10,20);
        Subraction sub=new Subraction(20,30);
        Mul m=new Mul(2,2);
        Div d=new Div(2,4);
        System.out.println("the addition is :"+add.ans(10,20));
        System.out.println("the subraction is :"+sub.ans(20,30)); 
        System.out.println("the multiple is:"+m.ans(2,2)); 
        System.out.println("the division is: "+d.ans(2,4));
        
    }
}
