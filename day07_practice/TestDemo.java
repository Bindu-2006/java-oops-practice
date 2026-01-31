interface A
{
    public void show();
}
class B implements A 
{
    public void show()
    {
        System.out.println("class B");
    }
}
class C implements A 
{
    public void show()
    {
        System.out.println("class C");
    }
}
class TestDemo
{
    public static void main(String args[])
    {
        B obj1=new B();
        C obj2=new C();
        obj1.show();
        obj2.show();
    }
}