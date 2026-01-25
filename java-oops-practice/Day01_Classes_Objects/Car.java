public class Car
{
    String brand;
    String color;
    int year;
    Car(String brand,String color,int year)
    {
        this.brand=brand;
        this.color=color;
        this.year=year;
    }
    //this() will calls main constructor
    Car(String brand,String color)
    {
        this(brand,color,2006);//if year is not given 2006 will be default
    }
    void display()
    {
        System.out.println(brand+" "+color+" "+year);
    }
    public static void main(String args[])
    {
        Car c1=new Car("Ferari","red",2023);
        c1.display();
        Car c2=new Car("lamborghini","yellow");
        c2.display();
    }
}