import java.util.*;
interface A
{
    void show();
}
interface B extends A 
{
    void hello();
}
class C implements A,B 
{
    public void show()
    {
        System.out.println("show method");
    }
    public void hello()
    {
        System.out.println("hello method");
    }
}
class Interface_extends
{
    public static void main(String args[])
    {
        C obj=new C();
        obj.show();
        obj.hello();
    }
}