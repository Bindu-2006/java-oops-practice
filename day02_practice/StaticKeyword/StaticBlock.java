public class StaticBlock
{
    static int a=4;
    static int b;

    static
    {
        System.out.println("Static block executed");
        b=a*5;
    }
    public static void main(String args[])
    {
        StaticBlock o=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);//static block executes only once and first
        b=b+3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }
}