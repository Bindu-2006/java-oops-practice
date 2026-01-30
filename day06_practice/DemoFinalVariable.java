class FinalVar
{
    final int a=10;
    void show()
    {
        System.out.println("Value of a:"+a);
        //a=20
        //final variable cannot be reassigned
    }
}
public class DemoFinalVariable
{
    public static void main(String args[])
    {
        FinalVar f=new FinalVar();
        f.show();
    }
}