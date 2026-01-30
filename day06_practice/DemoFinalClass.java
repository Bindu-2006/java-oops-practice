final class FinalClass
{
    void show()
    {
        System.out.println("This is final class");
    }
}
//class Child extends FinalClass
//if class is final it cannot be inherited
public class DemoFinalClass
{
    public static void main(String args[])
    {
        FinalClass obj=new FinalClass();
        obj.show();
    }
}