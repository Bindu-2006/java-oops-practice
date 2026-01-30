abstract class Vehicle
{
    //abstract method
    abstract void start();

    //normal method(concrete method)
    void fuel()
    {
        System.out.println("Vehicle fills with fuel");
    }

    //static method
    static void company()
    {
        System.out.println("Company:Auto Motors");
    }

    //final method

    final void safety()
    {
        System.out.println("Safety system followed");
    }
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Vehicle is started");
    }
}
public class Test
{
    public static void main(String args[])
    {
        Vehicle v=new Car();
        v.start();
        v.fuel();
        v.safety();
        Vehicle.company();
    }

}