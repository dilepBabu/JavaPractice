import java.util.*;
class summa{
    int n;
    int a[]=new int[n];
    int front=-1;
    int rear=-1;
    void get()
    {
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
}
    void queue(int data){
        if(front==-1){
            front=0;
            rear=0;
            a[front]=data;
        }
        else{
            rear=rear+1;
            a[rear]=data;
        }
    }
    void dequeue(){
        if(rear==-1){
            System.out.print("List is empty");
        }
        else{
            front=front+1;
        }
    }
}

public class Queue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        summa oruobject = new summa();
        oruobject.get();
        oruobject.queue(2);
        oruobject.dequeue();
        
    }
}