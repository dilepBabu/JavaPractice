import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;;
import java.io.IOException;
public class Demo {
    
    public static void main(String args[]) throws IOException{
        File f =new File("First.txt");
        if(!f.exists())
        {
            f.createNewFile();
        }{
        FileOutputStream o=new FileOutputStream(f);
        String text="HI FILES";
        o.write (text.getBytes());
        o.close();}
        {
        FileInputStream in=new FileInputStream(f);
        int i=in.read();
        while(!(i==-1))
        {
            char c=(char)i;
            System.out.print(c);
            i=in.read();
        }
        in.close();
    }
    }

}
