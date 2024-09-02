public class Hi {
    public static void main(String[] args) {
        String str="Java";
        str.concat("Programming");
        System.out.println(str);
        int x=5;
        System.out.println(x++ + ++x);
        for(int i=0;i<5;i++)
        {
            if(i==3)continue;
            System.out.println(i+" ");
        }
    }
    
}
