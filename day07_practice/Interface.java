import java.util.*;

interface Vehicle
{
    void start();
}
class Bike implements Vehicle
{
    public void start()
    {
        System.out.println("Bike is started");
    }
}
class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Car is started");
    }
}
class Interface 
{
    public static void main(String args[])
    {
        Bike b=new Bike();
        Car c=new Car();
        b.start();
        c.start();
    }
}