public class StaticMethod
{
    static void greet()
    {
        System.out.println("Good Morning");
    }
    void display()
    {
        System.out.println("Good Evening");
    }
    public static void main(String args[])
    {
        //Static Method no need to create object
        greet();
        //Non Staic Method we have to create object
        StaticMethod s=new StaticMethod();
        s.display();
    }
}