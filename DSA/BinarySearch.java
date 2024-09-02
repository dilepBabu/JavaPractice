import java .util.*;

public class BinarySearch {
    int Binary(int [] a,int key){

        int mid;
        int low =0;
        int high=a.length-1;
        
        
        for (;low<high;)

        {
            mid=(low+high)/2;
            if (key==a[mid])
            {
                return mid;
            }
             if(key>a[mid])
            {
                return mid +1; 
            }
            else
            {
                return mid -1;
            }
            

        }
        return -1;
         
    }
    public static void main(String[] args) {

        BinarySearch b=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array: ");
        n=sc.nextInt();
        int [] a= new int[n];
        System.out.println("Enter the value: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        System.out.println("Enter the search key: ");
        int key=sc.nextInt();;
        int c=b.Binary(a,key);
        System.out.println(c);
        
    }
    
}
