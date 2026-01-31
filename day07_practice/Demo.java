import java.util.*;
interface A
{
    public void show();
}
class B implements A
{
    public void show()
    {
        System.out.println("Method is executed");
    }
}
class Demo 
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.show();
    }
}