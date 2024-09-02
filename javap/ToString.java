public class ToString {
    
     String name;
     int roll;

    public ToString(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
   
    public static void main(String[] args) {
        ToString t=new ToString("dilep",20);
        System.out.println(t);
    
    }
    public String toString()
    {
        return name + roll;
        
    }
   
    
}
