import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int i;

        int [] a= new int[n];
        System.out.println("Enter the value: ");
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
            
        }
        
        
        System.out.println("Enter the search key: ");
        int key=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++)
        {
            if (a[i]==key)
            {
                System.out.println("VALUE IN THE INDEX OF "+i);
                
            }


        }
       
        
    }
    

    
}