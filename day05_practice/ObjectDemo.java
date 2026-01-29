import java.util.*;
import java.io.*;
class Student implements Cloneable
{
    int id;
    String name;

    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public String toString()
    {
        return id+" "+name;
    }

    public boolean equals(Object obj)
    {
        Student s=(Student)obj;
        return this.id==s.id && this.name.equals(s.name);
    }

    public int hashCode()
    {
        return id;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public void finalize()
    {
        System.out.println("Object is garbage successfully");
    }
}
class ObjectDemo
{
    public static void main(String args[]) throws Exception
    {
        Student s1=new Student(234,"bindu");
        Student s2=new Student(342,"ajay");
        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));

        System.out.println("hashCode()"+s1.hashCode());
        System.out.println("hashCode()"+s2.hashCode());

        System.out.println("getClass():"+s1.getClass());

        Student s3 = (Student) s1.clone();
        System.out.println("Cloned Object: " + s3);
        System.out.println(s1 instanceof Object);//Every class extends Object class

        s1=null;
        s2=null;
        s3=null;
        System.gc();

       

    }
}