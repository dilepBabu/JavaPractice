
public class Pascal {
    public static void main(String a[])
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for (int j = n; j >i; j--) { 
                System.out.print("  "); 
            } 
                         
            for (int j = i; j >0; j--) { 
                System.out.print(j+" "); 
            } 
  
             
            for (int j = 0; j <= i; j++) { 
                System.out.print(j+" "); 
            } 
            System.out.println(" ");
        }
        
    }
    
}
