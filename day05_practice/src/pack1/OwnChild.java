package pack1;

public class OwnChild extends Parent
{
    public void display1()
    {
        // System.out.println("a:"+a); // //cannot run because private-runs only inside class
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
    }
    
}