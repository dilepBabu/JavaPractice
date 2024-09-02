import java.io.File;

public class FileHandiling {
    public static void main(String [] args){
try{
        File f=new File("Second");
        if(f.createNewFile())
        {
            System.out.println("exist");

        }else{
            System.out.println("not exist");
        }
    } catch( Exception e) {
        System.out.println("exc");
    }
}
}
