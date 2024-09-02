public class StringMethods {
    public static void main(String[] args) {
        /* methods in notes */

        String str="welcome";
        str=str.replace('e','k');
        System.out.println(str);
        String up=str.toUpperCase();
        System.out.println(up);
        Boolean starts=str.startsWith("w");
        Boolean ends=str.endsWith("k");
        System.out.println(starts);
        System.out.println(ends);
        char c=str.charAt(6);
        System.out.println(c);
        int c1=str.indexOf("l");
        System.out.println(c1);
        int c2=str.lastIndexOf("m");
        System.out.println(c2);
        String s1="JAVA";
        String s2="java";
        String s3="python";
        String s4="python";
        int a=s1.compareTo(s2);
        int f=s1.compareTo(s3);
        int b=s4.compareTo(s2);
        int e=s2.compareTo(s3);
        System.out.println(a);
        System.out.println(e);
        System.out.println(b);
        System.out.println(f);
        String g=String.valueOf(s4);
        System.out.println(g);
        System.out.println(g.getClass());
        String z="Ton";
        int y=z.indexOf(z);





    }
    
}
