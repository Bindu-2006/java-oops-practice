package pack2;
import pack1.Parent;
import pack1.OwnChild;
public class ChildDemo
{
    public static void main(String args[])
    {
        Parent p = new Parent();

       // System.out.println(p.a); //cannot run because private-runs only inside class
       // System.out.println(p.b); //cannot run because default-runs only inside package
       // System.out.println(p.c); //cannot runs because protected-only when the class is inherited
        System.out.println(p.d);   
        p.show();//a,b,c,d all print
        Child obj = new Child();
        obj.display();//c,d will print
        OwnChild o=new OwnChild();
        o.display1();//b,c,d will print
    }
}