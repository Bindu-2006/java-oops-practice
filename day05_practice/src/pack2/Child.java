package pack2;

import pack1.Parent;
public class Child extends Parent
{
    void display()
    {
        //System.out.println("a:"+a);//cannot run because private-runs only inside class
        //System.out.println("b:"+b);//cannot run because default-runs only inside package
        System.out.println("c:"+c);//runs only when the class is inherited
        System.out.println("d:"+d);
    }
}