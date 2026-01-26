public class Outer
{
    static class Inner
    {
        void start()
        {
            System.out.println("Engine started");
        }
    }
    public static void main(String args[])
    {
        Outer.Inner obj=new Outer.Inner();
        obj.start();
    }
}