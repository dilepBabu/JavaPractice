import java.util.Scanner;

class list {
    int roll;
    String name;
    list next;


    
}
public class Linkedlist {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        list head=null;
        int r=1;

        do{
            list s=new list();
             r=s.roll=sc.nextInt();
             
            String n=s.name=sc.next();
            if(head==null)
            {
                head=s;
            }
            else{
                list t=head;
                while (t.next!=null) {
                    t=t.next;
                    
                }
                t.next=s;

            }

        }while(0<r);
        list t=head;
        while (t.next!=null) {
            System.out.println("Roll No"+" "+"NAME");
            System.out.println(t.roll+" "+t.name);
            t=t.next;

            
        }




        
    }
}