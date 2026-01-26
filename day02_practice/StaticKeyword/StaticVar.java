public class StaticVar
{
    String name;
    static int count=0;

    StaticVar(String name)
    {
        this.name=name;
        count++;
    }
    public static void main(String args[])
    {
       StaticVar s1=new StaticVar("Bindu");
       System.out.println("after adding 1st student count:"+count);
       StaticVar s2=new StaticVar("Ajay");
       StaticVar s3=new StaticVar("Karthik");

       System.out.println("Total:"+count);

    }
}