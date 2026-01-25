public class Rectangle
{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle()
    {
        this(1,1);
    }
    void display() 
    {
        System.out.println("Rectangle: Length = " + length + ", Breadth = " + breadth);
    }
    int area()
    {
        return length*breadth;
    }
    int perimeter()
    {
        return 2*(length+breadth);
    }
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle(5,6);
        Rectangle r2=new Rectangle();
        
        r1.display();
        System.out.println("area: "+r1.area());
        System.out.println("perimeter: "+r1.perimeter());

        r2.display();
        System.out.println("area: "+r2.area());
        System.out.println("perimeter: "+r2.perimeter());
    }
}
