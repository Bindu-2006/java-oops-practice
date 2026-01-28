class Student
{
    private String id;
    private String name;
    private int marks;
    Student(String id,String name,int marks)
    {
        this.id=id;
        this.name=name;
        setMarks(marks);
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setMarks(int marks)
    {
        if(marks<=100 && marks>=0)
        {
            this.marks=marks;
        }
        else
        {
            System.out.println("Invalid marks!");
        }
    }
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getMarks()
    {
        return marks;
    }

}
class Encapsulation
{
    public static void main(String args[])
    {
        Student s=new Student("R220442","bindu",98);
        System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
        s.setName("ajay");
        s.setMarks(100);
        System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
        s.setName("karthik");
        s.setMarks(112);
    }
}