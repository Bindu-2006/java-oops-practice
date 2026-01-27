class Person
{
    void display()
    {
        System.out.println("He is Person");
    }
}
class Student extends Person
{
    void study()
    {
        System.out.println("He is studying");
    }  
}
public class SingleInheritance
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.study();//calling its own method
        s.display();//calling inherited method
    }
}