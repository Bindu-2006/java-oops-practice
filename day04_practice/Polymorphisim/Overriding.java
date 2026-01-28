class Vehicle
{
    Vehicle()
    {
        System.out.println("I am in vehicle constructor");
    }
    void speed()
    {
        System.out.println("Speed depends on vehicle");
    }
}

class Car extends Vehicle
{
    @Override
    void speed()
    {
        System.out.println("Car speed is 70kmph");
    }
}

class Bike extends Vehicle
{
    @Override
    void speed()
    {
        System.out.println("Bike speed is 90kmph");
    }
}
class Overriding
{
    public static void main(String args[])
    {
        Vehicle v=new Vehicle();
        v.speed();
        Car c=new Car();
        c.speed();
        Bike b=new Bike();
        b.speed();
        Vehicle v1=new Bike();
        v1.speed();
    }
}