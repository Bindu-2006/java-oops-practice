import java.util.*;
class person
{
    String name;
    int age;
    void readperson()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter age");
        age=sc.nextInt();
    }
}

class student extends person
{
    String id;
    int marks;
    void readstudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        id=sc.next();
        System.out.println("enter marks");
        marks=sc.nextInt();
    }

}

class result extends student
{
     void display()
    {
        System.out.println("student details are:");
        System.out.println("name is:"+name);
        System.out.println("age is:"+age);
        System.out.println("id is:"+id);
        System.out.println("marks is:"+marks);
    }
}
class MultilevelInheritance2
{
    public static void main(String args[])
    {
        result s=new result();
        s.readperson();
        s.readstudent();
        s.display();
    }
}