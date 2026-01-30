class Parent
{
    final void show()
    {
        System.out.println("This is final method");
    }
}
class Child extends Parent
{
    //final method be overrided
    //void show()
    //{
    //    System.out.println("Override");
    //}
}
public class DemoFinalMethod
{
    public static void main(String args[])
    {
        Parent c=new Child();
        c.show();
    }
}