abstract class A
{
    A()
    {
        System.out.println("Abstract A constructor");
    }
    abstract void fun();
}
class B extends A
{
    B()
    {
        System.out.println("B constructor");
    }
    void fun()
    {
        System.out.println("B fun");
    }
}
public class Demo2
{
    public static void main(String args[])
    {
        A obj=new B();
        obj.fun();//Remember: Constructor of abstract class is called before child class constructor
    }
}