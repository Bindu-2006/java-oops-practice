class A 
{
    int x=100;
    A()
    {
        System.out.println("Parent constructor called");
    }
    void show()
    {
        System.out.println("Parent show() called");
    }
}
class B extends A 
{
    int x=200;
    B()
    {
        super();//calls parent constructor
        System.out.println("child contructor");
    }
    void show()
    {
        super.show();//calls parent method
        System.out.println("Child show()");
    }
    void display()
    {
        System.out.println("x:"+super.x);//parent class variable
        System.out.println("x:"+this.x);//child class variable
    }
}
class Super
{
    public static void main(String args[])
    {
        B b=new B();
        b.show();
        b.display();
    }
}