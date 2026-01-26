public class WrapperDemo
{
    public static void main(String args[])
    {
        //primitive to wrapper
        int a=5;
        Integer obj=a;//auto boxing

        //wrapper to primitive
        int b=obj; //auto unboxing

        //String to Wrapper
        String str="100";
        Integer c=Integer.parseInt(str);

        System.out.println("Primitive int:"+a);
        System.out.println("Wrapper Integer:"+obj);
        System.out.println("Unboxed int :"+b);
        System.out.println("String to Integer:"+c);
    }
}