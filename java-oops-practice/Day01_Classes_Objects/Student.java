public class Student
{
    String name;
    int roll;

    Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    void display()
    {
        System.out.println(name+" "+roll);
    }
    public static void main(String args[])
    {
        Student s1=new Student("Bindu",1);
        s1.display();
    }
}