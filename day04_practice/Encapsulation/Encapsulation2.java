class Employee
{
    private String name;
    private double salary;
    private String designation;

    Employee(String name,double salary,String designation)
    {
        this.name=name;
        setSalary(salary);
        this.designation=designation;
    }

    public void setSalary(double salary)
    {
        if(salary<=0)
        {
            System.out.println("Salary must be greater than 0");
            return;
        }
        this.salary=salary;
        if(salary>=80000)
        {
            this.designation="Manager";
        }
        else
        {
            this.designation="Employee";
        }
       
    }

    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getDesignation()
    {
        return designation;
    }
}
class Encapsulation2
{
    public static void main(String args[])
    {
        Employee e=new Employee("bindu",75000,"Manager");
        System.out.println(e.getName()+" "+e.getSalary()+" "+e.getDesignation());
        e.setSalary(8000);
        System.out.println(e.getName()+" "+e.getSalary()+" "+e.getDesignation());
        e.setSalary(0);
        System.out.println(e.getName()+" "+e.getSalary()+" "+e.getDesignation());
    }
}