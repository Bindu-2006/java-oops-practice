import java.util.*;
interface A
{
    public void showA();
}
interface B 
{
    public void showB();
}
class C implements A,B 
{
    public void showA()
    {
        System.out.println("interface A show A method");
    }
    public void showB()
    {
        System.out.println("interface B show B method");
    }
}
class MultipleInheritance
{
    public static void main(String args[])
    {
        C obj=new C();
        obj.showA();
        obj.showB();
    }
}