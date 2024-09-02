public class Stringcreating {
    public static void main(String[] args) {
        /* the java is in the pool memory allocation and s1 is pointing that memory allocation lets take example memory allocation of that pool is 109
        ,now we declear another string called s2 that also pointing the same memory allocation so its true */
        String s1="java";
        String s2="java";
        System.out.println(s1==s2);
        /*here in creating an object for an string is different that is in str1 is the referal the object ,that object is in the heap here also pool memory allocation is there to store the literals
         * here different referal create a different to store the string 
         * ex :
         * str1-> memory allocation id is :109
         * str2-> memory aloocation id is :110
         * like that it will create the object in the heap area
         * so it is false
         */
        String str1=new String("java");
        String str2=new String("java");
        System.out.println(str1==str2);
        /* converting char to string and byte to string */
        char [] b={'h','e','l','l','o'};
        String a=new String(b);
        System.out.println(a);
        byte []c={67,89,79,53};
        String d=new String(c);
        System.out.println(d);
    }
    
}
