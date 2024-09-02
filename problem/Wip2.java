public class Wip2 {
    public static void main(String[] args) {
        // int n=5;
        int []a={1,2,3,4,5};
        int []b={1,2,3,6};
        int d=0,e=0;
        for(int i=0;i<=a.length&&i<b.length;i++)
        {
            if(a[i]==b[i]){

            }
            else{
                d=d+a[i];
                e=e+b[i];
            }
        }
        System.out.println(d+e);

    }
    
}
