class Shape
{
    void draw()
    {
        System.out.println("Diagram is drawn");
    }
}
class Circle extends Shape
{
    void round()
    {
        System.out.println("Shape is Circle");
    }
}
class Rectangle extends Shape
{
    void box()
    {
        System.out.println("Shape is Rectangle");
    }
}
public class HierarchicalInheritance
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.draw();
        c.round();
        Rectangle r=new Rectangle();
        r.draw();
        r.box();
    }
}