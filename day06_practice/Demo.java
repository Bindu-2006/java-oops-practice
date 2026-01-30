abstract class Employee
{
    int sal;
    Employee(int sal)
    {
        this.sal=sal;
    }
    abstract void salary();
}
class Manager extends Employee
{
    Manager(int sal)
    {
        super(sal);
    }
    void salary()
    {
        System.out.println("Manager salary is:"+(sal));
    }
}
class Developer extends Employee
{
    Developer(int sal)
    {
        super(sal);
    }
    void salary()
    {
        System.out.println("Developer salary is:"+sal);
    }
}
public class Demo 
{
    public static void main(String args[])
    {
        Manager m=new Manager(5000);
        m.salary();
        Developer d=new Developer(10000);
        d.salary();
    }
}