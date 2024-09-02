import java.util.Scanner;

/**
 * InnerStack
 */
 class  summa{
    int roll;
    summa next;


    
}
public class Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=1;
        summa head=null;
        do{
            summa s=new summa();
            r=s.roll=sc.nextInt();
            
            if(head==null)
            {
                head=s;

            }
            else
            {
                s.next=head;
                head=s;
            }


        }while(r>0);
        summa t=head;
        while (t.next!=null) {
            System.out.println(t.roll);
            t=t.next;
            
        }
        
    }
    
}
