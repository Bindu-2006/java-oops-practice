class Vehicle
{
    void start()
    {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle
{
    void drive()
    {
        System.out.println("He is driving");
    }
}
class ElectricCar extends Car
{
    void charge()
    {
        System.out.println("Car is charging");
    }
}
public class MultilevelInheritance
{
    public static void main(String args[])
    {
        ElectricCar c=new ElectricCar();
        c.start();
        c.drive();
        c.charge();
    }
}