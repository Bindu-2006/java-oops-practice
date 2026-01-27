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

    void display()
    {
        System.out.println("student details are:");
        System.out.println("name is:"+name);
        System.out.println("age is:"+age);
        System.out.println("id is:"+id);
        System.out.println("marks is:"+marks);
    }
}

class SingleInheritance2
{
    public static void main(String args[])
    {
        student s=new student();
        s.readperson();
        s.readstudent();
        s.display();
    }
}