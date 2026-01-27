import java.util.*;

class Person {
    static Scanner sc = new Scanner(System.in); // default access

    String name;
    int age;

    void readPerson() {
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter age:");
        age = sc.nextInt();
    }
}
class Student extends Person {
    String id;
    int marks;

    void readStudent() {
        System.out.println("Enter id:");
        id = sc.next();
        System.out.println("Enter marks:");
        marks = sc.nextInt();
    }

    void displayStudent() {
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
    }
}
class Employee extends Person {
    int sal;

    void readEmployee() {
        System.out.println("Enter salary:");
        sal = sc.nextInt();
    }

    void displayEmployee() {
        System.out.println("Employee details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + sal);
    }
}
public class HierarchicalInheritance2 {
    public static void main(String[] args) {

        Student s = new Student();
        Employee e = new Employee();

        System.out.println("Enter student details:");
        s.readPerson();
        s.readStudent();
        s.displayStudent();

        System.out.println("\nEnter employee details:");
        e.readPerson();
        e.readEmployee();
        e.displayEmployee();
    }
}
