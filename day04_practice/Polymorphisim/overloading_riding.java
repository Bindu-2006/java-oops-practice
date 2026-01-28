class Shape
{
    void draw(int a)
    {
        System.out.println("shape draw(int)");
    }
    void draw(int a,int b)
    {
        System.out.println("shape draw(int,int)");
    }
    void draw(Integer x)
    {
        System.out.println("Shape draw(Integer)");
    }
}
class Circle extends Shape
{
    void draw(int a)
    {
        System.out.println("circle draw(int)");
    }
    void draw(int a,int b)
    {
        System.out.println("circle draw(int,int)");
    }
    void draw(Integer x)
    {
        System.out.println("circle draw(Integer)");
    }
}
class overloading_riding
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.draw(4);
        c.draw(6,5);
        c.draw(new Integer(10));
        Shape s=new Shape();
        s.draw(9);
        s.draw(5,3);
        s.draw(new Integer(45));
        Shape s1=new Circle();
        s1.draw(4);
        s1.draw(6,5);
        s1.draw(new Integer(10));
    }
}