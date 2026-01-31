import java.util.*;
interface A
{
    default void show()
    {
        System.out.println("show method");
    }
    static void hello()
    {
        System.out.println("Hello world!");
    }
}
class B implements A{}
class Test
{
    public static void main(String args[])
    {
     //   A obj=new A(); //cannot work because we cannot create object for interface
        B obj=new B();
        obj.show();
        //obj.hello(); error
        A.hello();
    }
}