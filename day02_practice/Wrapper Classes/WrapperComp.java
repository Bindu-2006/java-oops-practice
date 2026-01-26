public class WrapperComp
{
    public static void main(String args[])
    {
        Integer a=100;
        Integer b=100;
        System.out.println(a==b);
        System.out.println(a.equals(b));

        // Cached values (-128 to 127) 
        Integer x=-129;
        Integer y=-129;
        System.out.println(x==y);
        //values other than the given range in cached values results false
        System.out.println(x.equals(y)); 
      
       
     
    }
}